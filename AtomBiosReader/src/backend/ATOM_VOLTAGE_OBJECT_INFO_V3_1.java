package backend;
import java.util.ArrayList;
import java.util.List;

public class ATOM_VOLTAGE_OBJECT_INFO_V3_1  extends AContainer{
	 ATOM_COMMON_TABLE_HEADER	sHeader = new ATOM_COMMON_TABLE_HEADER();
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj1 = new ATOM_VOLTAGE_OBJECT_V3();
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj2 = new ATOM_VOLTAGE_OBJECT_V3();
	 ATOM_VOLTAGE_OBJECT_V3		asVoltageObj3 = new ATOM_VOLTAGE_OBJECT_V3();
	 StructureType type = StructureType.subFixed;
	 
	public ATOM_VOLTAGE_OBJECT_INFO_V3_1(BinaryDataBlock voltageObjectInfoBB) {
		super.subStructureList = getSubStructureList();
		super.binDataBlock = voltageObjectInfoBB;
		super.process();
		this.binDataBlock.printHexString();
		System.out.println("sHeader: "+" & HEX: "+sHeader.binDataBlock.getHexString());
		System.out.println("asVoltageObj1: " + " & HEX: "+asVoltageObj1.binDataBlock.getHexString());
		System.out.println("asVoltageObj2: " + " & HEX: "+asVoltageObj2.binDataBlock.getHexString());
		System.out.println("asVoltageObj3: " + " & HEX: "+asVoltageObj3.binDataBlock.getHexString());
		
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

}
