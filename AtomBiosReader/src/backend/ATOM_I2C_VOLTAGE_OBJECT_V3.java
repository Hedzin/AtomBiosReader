package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_I2C_VOLTAGE_OBJECT_V3 extends AContainer{
	   ATOM_VOLTAGE_OBJECT_HEADER_V3 sHeader = new ATOM_VOLTAGE_OBJECT_HEADER_V3();    // voltage mode = VOLTAGE_OBJ_VR_I2C_INIT_SEQ
	   ByteStructure	ucVoltageRegulatorId = new ByteStructure();					  //Indicate Voltage Regulator Id
	   ByteStructure    ucVoltageControlI2cLine = new ByteStructure();
	   ByteStructure    ucVoltageControlAddress = new ByteStructure();
	   ByteStructure    ucVoltageControlOffset = new ByteStructure();	
	   ByteStructure    ulReserved = new ByteStructure();
	   VOLTAGE_LUT_ENTRY asVolI2cLut = new VOLTAGE_LUT_ENTRY();     // end with 0xff
	@Override
	public int getLength() {
		int length = 5;
		length += new ATOM_VOLTAGE_OBJECT_HEADER_V3().getLength();
		length += new VOLTAGE_LUT_ENTRY().getLength();
		return length;  
	}
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(sHeader);
		list.add(ucVoltageRegulatorId);
		list.add(ucVoltageControlI2cLine);
		list.add(ucVoltageControlAddress);
		list.add(ucVoltageControlOffset);
		list.add(ulReserved);
		list.add(asVolI2cLut);

		
		
		
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		sHeader.setName("ATOM_VOLTAGE_OBJECT_HEADER_V3");
		ucVoltageRegulatorId.setName("VoltageRegulatorId");
		ucVoltageRegulatorId.setDescription("Indicate Voltage Regulator Id");
		ucVoltageControlI2cLine.setName("VoltageControlI2cLine");
		ucVoltageControlAddress.setName("VoltageControlAddress");
		ucVoltageControlOffset.setName("VoltageControlOffset");
		ulReserved.setName("Reserved");
		asVolI2cLut.setName("VolI2cLut");
		super.fillSubListDescriptions();
	}
}
