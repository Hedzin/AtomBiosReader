import java.nio.ByteBuffer;

public class ATOM_COMMON_TABLE_HEADER implements IStructure {
	Short usStructureSize;
	Byte  ucTableFormatRevision;
	Byte  ucTableContentRevision;
	public ATOM_COMMON_TABLE_HEADER(BinaryDataBlock voltageObjectInfoHeaderBB) {
		ByteBuffer bb = voltageObjectInfoHeaderBB.getBody();
		ByteBuffer usStructureSizeBB = bb.duplicate();
		usStructureSizeBB.limit(2);
		
		bb.position(2);
		ByteBuffer ucTableFormatRevisionBB = bb.slice();
		
		
		BinaryDataBlock usStructureSizeBDB = new BinaryDataBlock(voltageObjectInfoHeaderBB.getBody().get);
	}
	@Override
	public int getLength() {
		int length = 4;
		return length;
	}

}
