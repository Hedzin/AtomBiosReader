package backend;
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
		this.binDataBlock.printHexString();
		System.out.println("usStructureSize: "+usStructureSize.binDataBlock.getIntegerLE() + " & HEX: "+usStructureSize.binDataBlock.getHexString());
		System.out.println("ucTableFormatRevision: "+ucTableFormatRevision.binDataBlock.getIntegerLE() + " & HEX: "+ucTableFormatRevision.binDataBlock.getHexString());
		System.out.println("ucTableContentRevision: "+ucTableContentRevision.binDataBlock.getIntegerLE() + " & HEX: "+ucTableContentRevision.binDataBlock.getHexString());

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
	
	@Override
	public void fillSubListDescriptions() {
		usStructureSize.setName("StructureSize");
		ucTableFormatRevision.setName("TableFormatRevision");
		ucTableContentRevision.setName("TableContentRevision");
		super.fillSubListDescriptions();
	}
}
