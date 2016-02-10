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
	
	public List<AtomTable> tableList = new ArrayList<AtomTable>();
	//
	public ATOM_VOLTAGE_OBJECT_INFO_V3_1 atomVoltageObjectInfoTable = new ATOM_VOLTAGE_OBJECT_INFO_V3_1();
	
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
		atomVoltageObjectInfoTable.setBinaryDataBlock(getTableBDBbyOffset(atomMasterDataTable.ListOfDataTables.VoltageObjectInfo.getBinaryDataBlock().getIntegerLE()));
		atomVoltageObjectInfoTable.init();
		
		ATOM_COMMON_TABLE_HEADER PowerPlayInfoHeader = getCommonTableHeaderByOffset(atomMasterDataTable.ListOfDataTables.PowerPlayInfo.getBinaryDataBlock().getIntegerLE());
		System.out.println(PowerPlayInfoHeader.ucTableContentRevision.getBinaryDataBlock().getIntegerLE() + " "+PowerPlayInfoHeader.ucTableFormatRevision.getBinaryDataBlock().getIntegerLE());
		
		Path path = Paths.get("ppt.txt");
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
		    writer.write(getTableBDBbyOffset(atomMasterDataTable.ListOfDataTables.PowerPlayInfo.getBinaryDataBlock().getIntegerLE()).getHexString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		return finalBDB;
		
	}

}
