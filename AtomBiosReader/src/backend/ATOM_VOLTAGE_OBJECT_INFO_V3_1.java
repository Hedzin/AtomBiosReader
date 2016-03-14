package backend;
import java.util.ArrayList;
import java.util.List;

public class ATOM_VOLTAGE_OBJECT_INFO_V3_1  extends AtomTable{
	
	public ATOM_VOLTAGE_OBJECT_INFO_V3_1(BinaryDataBlock bdb) {
		setBinaryDataBlock(bdb);
		init();
	}

	{
	name = "ATOM_VOLTAGE_OBJECT_INFO_V3_1";
	description = "Voltage Object Info Table";
	}
	
	
	 ATOM_COMMON_TABLE_HEADER	sHeader = new ATOM_COMMON_TABLE_HEADER();
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj1 = new ATOM_VOLTAGE_OBJECT_V3();
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj2 = new ATOM_VOLTAGE_OBJECT_V3();
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj3 = new ATOM_VOLTAGE_OBJECT_V3();
	 StructureType type = StructureType.subFixed;
	 
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
	public void fillSubListDescriptions() {
		sHeader.setName("CommonTableHeader");
		asVoltageObj1.setName("VoltageObj1");
		asVoltageObj1.setDescription("Info for Voltage control");
		asVoltageObj2.setName("VoltageObj2");
		asVoltageObj2.setDescription("Info for Voltage control");
		asVoltageObj3.setName("VoltageObj3");
		asVoltageObj3.setDescription("Info for Voltage control");
		super.fillSubListDescriptions();
	}

}
