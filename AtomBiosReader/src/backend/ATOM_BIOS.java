package backend;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ATOM_BIOS {
	public static String OFFSET_TO_POINTER_TO_ATOM_ROM_HEADER = "0x00000048";
	public static String OFFSET_TO_ATOM_ROM_IMAGE_SIZE = "0x00000002";
	public ShortStructure atomRomHeaderOffset = new ShortStructure();
	public BinaryDataBlock mainBDB = new BinaryDataBlock();
	
	public ATOM_ROM_HEADER atomRomHeader = new ATOM_ROM_HEADER();
	public ATOM_MASTER_DATA_TABLE atomMasterDataTable = new ATOM_MASTER_DATA_TABLE();
	public ATOM_MASTER_COMMAND_TABLE atomMasterCommandTable = new ATOM_MASTER_COMMAND_TABLE();
	
	public List<IAtomTable> tableList = new ArrayList<IAtomTable>();
	//
	public ATOM_VOLTAGE_OBJECT_INFO_V3_1 atomVoltageObjectInfoTable_v3_1;
	public ATOM_POWERPLAY_INFO_V7_1 atomPPtable;
	public ATOM_BIOS(BinaryDataBlock mainBDB) {
		this.mainBDB = mainBDB;

		int offsetI = Integer.decode(OFFSET_TO_POINTER_TO_ATOM_ROM_HEADER);
		int lenghtPRE = 36;
		System.out.println("off:'"+offsetI+"' lenPRE:'"+2+"'");
		ByteBuffer bbD = mainBDB.getBody().duplicate();
		bbD.position(offsetI);
		ByteBuffer atomRomHeaderOffsetBB = bbD.slice();
		atomRomHeaderOffsetBB.limit(2);
		BinaryDataBlock atomRomHeaderOffsetBDB = new BinaryDataBlock(atomRomHeaderOffsetBB);
		atomRomHeaderOffset.setBinaryDataBlock(atomRomHeaderOffsetBDB);
		//atomRomHeaderOffset.process();
		System.out.println("off:'"+atomRomHeaderOffset.getBinaryDataBlock().getIntegerLE()+"' lenPRE:'"+lenghtPRE+"'");
		ByteBuffer bbD2 = mainBDB.getBody().duplicate();
		bbD2.position(atomRomHeaderOffset.getBinaryDataBlock().getIntegerLE());
		ByteBuffer atomRomHeaderBB = bbD2.slice();
		atomRomHeaderBB.limit(lenghtPRE);
		BinaryDataBlock atomRomHeaderBDB = new BinaryDataBlock(atomRomHeaderBB);
		atomRomHeader.setBinaryDataBlock(atomRomHeaderBDB);
		atomRomHeader.init();
		atomMasterDataTable.setBinaryDataBlock(getTableBDBbyOffset(atomRomHeader.usMasterDataTableOffset.getBinaryDataBlock().getIntegerLE()));
		atomMasterDataTable.init();
		atomMasterCommandTable.setBinaryDataBlock(getTableBDBbyOffset(atomRomHeader.usMasterCommandTableOffset.getBinaryDataBlock().getIntegerLE()));
		atomMasterCommandTable.init();
		
		tableList.add(atomRomHeader);
		tableList.add(atomMasterDataTable);
		tableList.add(atomMasterCommandTable);
		
//		atomVoltageObjectInfoTable_v3_1.setBinaryDataBlock(getTableBDBbyOffset(atomMasterDataTable.ListOfDataTables.VoltageObjectInfo.getBinaryDataBlock().getIntegerLE()));
//		atomVoltageObjectInfoTable_v3_1.init();
//		atomPPtable.setBinaryDataBlock(getTableBDBbyOffset(atomMasterDataTable.ListOfDataTables.PowerPlayInfo.getBinaryDataBlock().getIntegerLE()));
//		atomPPtable.init();
		fillTables();
		//ATOM_COMMON_TABLE_HEADER PowerPlayInfoHeader = getCommonTableHeaderByOffset(atomMasterDataTable.ListOfDataTables.PowerPlayInfo.getBinaryDataBlock().getIntegerLE());
		//System.out.println(PowerPlayInfoHeader.ucTableContentRevision.getBinaryDataBlock().getIntegerLE() + " "+PowerPlayInfoHeader.ucTableFormatRevision.getBinaryDataBlock().getIntegerLE());
		
//		Path path = Paths.get("ppt.txt");
//		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
//		    writer.write(getTableBDBbyOffset(atomMasterDataTable.ListOfDataTables.PowerPlayInfo.getBinaryDataBlock().getIntegerLE()).getHexString());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	private void fillTables(){
		for (IStructure atomTable : atomMasterDataTable.ListOfDataTables.getSubStructureList()) {
			int offset = atomTable.getBinaryDataBlock().getIntegerLE();
			if (offset==0)continue;
			String tablename = atomTable.getName();
			ATOM_COMMON_TABLE_HEADER tableheader = getCommonTableHeaderByOffset(offset);
			int tableContentRevision = tableheader.ucTableContentRevision.getBinaryDataBlock().getIntegerLE();
			int tableFormatRevision = tableheader.ucTableFormatRevision.getBinaryDataBlock().getIntegerLE();
			String tableVersion = "v"+tableFormatRevision+"."+tableContentRevision;
			System.out.println(tablename+" "+tableVersion);
			switch (tablename) {
			case "VoltageObjectInfo":
				switch (tableVersion) {
				case "v3.1":
					tableList.add(new ATOM_VOLTAGE_OBJECT_INFO_V3_1(getTableBDBbyOffset(offset)));
					break;

				default:
					tableList.add(makeStubTable(atomTable));
					break;
				}
				break;
			case "PowerPlayInfo":
				switch (tableVersion) {
				case "v7.1":
					tableList.add(new ATOM_POWERPLAY_INFO_V7_1(getTableBDBbyOffset(offset)));
					break;
				case "v6.1":
					tableList.add(new ATOM_POWERPLAY_INFO_V6_1(getTableBDBbyOffset(offset)));
					break;
				default:
					Path path = Paths.get("ppt"+tableVersion+"_.txt");
					try (BufferedWriter writer = Files.newBufferedWriter(path)) {
					    writer.write(getTableBDBbyOffset(offset).getHexString());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					tableList.add(makeStubTable(atomTable));
					break;
				}
				break;
			default:
				tableList.add(makeStubTable(atomTable));
				break;
			}
		}
		
		for (IStructure atomTable : atomMasterCommandTable.ListOfCommandTables.getSubStructureList()) {
			if (atomTable.getBinaryDataBlock().getIntegerLE()==0)continue;
			String tablename = atomTable.getName();
			ATOM_COMMON_TABLE_HEADER tableheader = getCommonTableHeaderByOffset(atomTable.getBinaryDataBlock().getIntegerLE());
			int tableContentRevision = tableheader.ucTableContentRevision.getBinaryDataBlock().getIntegerLE();
			int tableFormatRevision = tableheader.ucTableFormatRevision.getBinaryDataBlock().getIntegerLE();
			String tableVersion = "v"+tableContentRevision+"."+tableFormatRevision;
			System.out.println(tablename+" "+tableVersion);
			switch (tablename) {
			default:
				tableList.add(makeStubTable(atomTable));
				break;
			}
		}
		
	}
	
	private IAtomTable makeStubTable(IStructure atomTable) {
		int offset = atomTable.getBinaryDataBlock().getIntegerLE();
		ATOM_STUB_TABLE stubTable = new ATOM_STUB_TABLE(getTableBDBbyOffset(offset));
		String tablename = atomTable.getName();
		ATOM_COMMON_TABLE_HEADER tableheader = getCommonTableHeaderByOffset(offset);
		int tableContentRevision = tableheader.ucTableContentRevision.getBinaryDataBlock().getIntegerLE();
		int tableFormatRevision = tableheader.ucTableFormatRevision.getBinaryDataBlock().getIntegerLE();
		String tableVersion = "v"+tableFormatRevision+"."+tableContentRevision;
		stubTable.setName("(UNSUPPORTED)"+tablename+" "+tableVersion);
		stubTable.setDescription("not supported yet");
		return stubTable;
	}
	private ATOM_COMMON_TABLE_HEADER getCommonTableHeaderByOffset(int offset){
		ATOM_COMMON_TABLE_HEADER header = new ATOM_COMMON_TABLE_HEADER();
		ByteBuffer bbD = mainBDB.getBody().duplicate();
		bbD.position(offset);
		ByteBuffer headerBB = bbD.slice();
		headerBB.limit(4);
		BinaryDataBlock headerBDB = new BinaryDataBlock(headerBB);
		header.setBinaryDataBlock(headerBDB);
		header.init();
		return header;
		
	}
	private BinaryDataBlock getTableBDBbyOffset(int offset){
		ShortStructure size = new ShortStructure();
		ByteBuffer bbD = mainBDB.getBody().duplicate();
		bbD.position(offset);
		ByteBuffer sizeBB = bbD.slice();
		sizeBB.limit(2);
		BinaryDataBlock sizeBDB = new BinaryDataBlock(sizeBB);
		size.setBinaryDataBlock(sizeBDB);

		
		ByteBuffer bbD2 = mainBDB.getBody().duplicate();
		bbD2.position(offset);
		ByteBuffer finalBB = bbD2.slice();
		finalBB.limit(size.getBinaryDataBlock().getIntegerLE());
		BinaryDataBlock finalBDB = new BinaryDataBlock(finalBB);
		finalBDB.setRootOffset(offset);
		return finalBDB;
		
	}

}
