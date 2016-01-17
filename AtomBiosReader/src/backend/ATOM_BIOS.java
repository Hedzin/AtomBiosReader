package backend;

import java.nio.ByteBuffer;

public class ATOM_BIOS {
	public static String OFFSET_TO_POINTER_TO_ATOM_ROM_HEADER = "0x00000048";
	public static String OFFSET_TO_ATOM_ROM_IMAGE_SIZE = "0x00000002";
	public ShortStructure atomRomHeaderOffset = new ShortStructure();
	public BinaryDataBlock mainBDB = new BinaryDataBlock();
	
	public ATOM_ROM_HEADER atomRomHeader = new ATOM_ROM_HEADER();
	
	public ATOM_BIOS(BinaryDataBlock mainBDB) {
		

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
		 
	}

}
