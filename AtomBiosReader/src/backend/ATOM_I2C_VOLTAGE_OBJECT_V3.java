package backend;

public class ATOM_I2C_VOLTAGE_OBJECT_V3 extends AContainer{
	   ATOM_VOLTAGE_OBJECT_HEADER_V3 sHeader;    // voltage mode = VOLTAGE_OBJ_VR_I2C_INIT_SEQ
	   ByteStructure	ucVoltageRegulatorId;					  //Indicate Voltage Regulator Id
	   ByteStructure    ucVoltageControlI2cLine;
	   ByteStructure    ucVoltageControlAddress;
	   ByteStructure    ucVoltageControlOffset;	 	
	   ByteStructure    ulReserved;
	   VOLTAGE_LUT_ENTRY asVolI2cLut;        // end with 0xff
	@Override
	public int getLength() {
		int length = 5;
		length += new ATOM_VOLTAGE_OBJECT_HEADER_V3().getLength();
		length += new VOLTAGE_LUT_ENTRY().getLength();
		return length;  
	}
	@Override
	public void fillSubListDescriptions() {
		sHeader.setName("ATOM_VOLTAGE_OBJECT_HEADER_V3");
		ucVoltageRegulatorId.setName("VoltageRegulatorId");
		ucVoltageControlI2cLine.setName("VoltageControlI2cLine");
		ucVoltageControlAddress.setName("VoltageControlAddress");
		ucVoltageControlOffset.setName("VoltageControlOffset");
		ulReserved.setName("Reserved");
		asVolI2cLut.setName("VolI2cLut");
		super.fillSubListDescriptions();
	}
}
