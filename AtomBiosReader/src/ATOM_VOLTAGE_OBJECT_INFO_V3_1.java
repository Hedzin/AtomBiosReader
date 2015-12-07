
public class ATOM_VOLTAGE_OBJECT_INFO_V3_1  implements IStructure{
	 ATOM_COMMON_TABLE_HEADER	sHeader = null; 
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj1 = null;
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj2 = null;
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj3 = null;
	 
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
}
