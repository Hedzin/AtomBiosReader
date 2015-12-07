
public class ATOM_GPIO_VOLTAGE_OBJECT_V3 implements IStructure {
	   ATOM_VOLTAGE_OBJECT_HEADER_V3 sHeader;   // voltage mode = VOLTAGE_OBJ_GPIO_LUT or VOLTAGE_OBJ_PHASE_LUT
	   Byte    ucVoltageGpioCntlId;         // default is 0 which indicate control through CG VID mode 
	   Byte    ucGpioEntryNum;              // indiate the entry numbers of Votlage/Gpio value Look up table
	   Byte    ucPhaseDelay;                // phase delay in unit of micro second
	   Byte    ucReserved;   
	   Long    ulGpioMaskVal;               // GPIO Mask value
	   VOLTAGE_LUT_ENTRY_V2 asVolGpioLut;
	@Override
	public int getLength() {
		int length = 12;
		length += new ATOM_VOLTAGE_OBJECT_HEADER_V3().getLength();
		length += new VOLTAGE_LUT_ENTRY_V2().getLength();
		return length;  
	}
}
