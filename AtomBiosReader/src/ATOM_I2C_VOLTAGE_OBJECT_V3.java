
public class ATOM_I2C_VOLTAGE_OBJECT_V3 implements IStructure {
	   ATOM_VOLTAGE_OBJECT_HEADER_V3 sHeader;    // voltage mode = VOLTAGE_OBJ_VR_I2C_INIT_SEQ
	   Byte	ucVoltageRegulatorId;					  //Indicate Voltage Regulator Id
	   Byte    ucVoltageControlI2cLine;
	   Byte    ucVoltageControlAddress;
	   Byte    ucVoltageControlOffset;	 	
	   Byte    ulReserved;
	   VOLTAGE_LUT_ENTRY asVolI2cLut;        // end with 0xff
	@Override
	public int getLength() {
		int length = 5;
		length += new ATOM_VOLTAGE_OBJECT_HEADER_V3().getLength();
		length += new VOLTAGE_LUT_ENTRY().getLength();
		return length;  
	}
}
