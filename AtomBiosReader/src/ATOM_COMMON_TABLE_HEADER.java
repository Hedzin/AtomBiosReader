import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Hex;

public class ATOM_COMMON_TABLE_HEADER extends AContainer {
	ShortStructure usStructureSize = new ShortStructure();
	ByteStructure  ucTableFormatRevision = new ByteStructure();
	ByteStructure  ucTableContentRevision = new ByteStructure();
	public ATOM_COMMON_TABLE_HEADER(BinaryDataBlock voltageObjectInfoHeaderBB) {

		super.subStructureList = getSubStructureList();
		super.binDataBlock = voltageObjectInfoHeaderBB;
		super.process();
		byte[] array =  new byte[1];
		ucTableContentRevision.binDataBlock.getBody().get(array);
		System.out.println("ddd"+Hex.encodeHexString(array));

	}
	public ATOM_COMMON_TABLE_HEADER() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getLength() {
		int length = 4;
		return length;
	}
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usStructureSize);
		list.add(ucTableFormatRevision);
		list.add(ucTableContentRevision);
		return list;
	}
}
