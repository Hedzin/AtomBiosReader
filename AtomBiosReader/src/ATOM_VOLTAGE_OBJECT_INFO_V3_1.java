import java.util.ArrayList;
import java.util.List;

public class ATOM_VOLTAGE_OBJECT_INFO_V3_1  implements IContainer{
	 ATOM_COMMON_TABLE_HEADER	sHeader = null; 
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj1 = null;
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj2 = null;
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj3 = null;
	 StructureType type = StructureType.subFixed;
	 
	public ATOM_VOLTAGE_OBJECT_INFO_V3_1(BinaryDataBlock voltageObjectInfoBB) {
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public int getLength() {
		int length = 0;
		length += new ATOM_COMMON_TABLE_HEADER().getLength();
		length += new ATOM_VOLTAGE_OBJECT_V3().getLength();
		length += new ATOM_VOLTAGE_OBJECT_V3().getLength();
		length += new ATOM_VOLTAGE_OBJECT_V3().getLength();
		return length;
	}
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(sHeader);
		list.add(asVoltageObj1);
		list.add(asVoltageObj2);
		list.add(asVoltageObj3);
		
		return list;
	}
	@Override
	public StructureType getType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StructureDataType getDataType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BinaryDataBlock getBinaryDataBlock() {
		// TODO Auto-generated method stub
		return null;
	}
}
