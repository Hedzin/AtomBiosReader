
public class ATOM_LEAKAGE_VOLTAGE_OBJECT_V3  implements IStructure{
	   ATOM_VOLTAGE_OBJECT_HEADER_V3 sHeader;    // voltage mode = 0x10/0x11/0x12
	   Byte    ucLeakageCntlId;             // default is 0
	   Byte    ucLeakageEntryNum;           // indicate the entry number of LeakageId/Voltage Lut table
	   Byte    ucReserved1;
	   Byte    ucReserved2;  
	   Long    ulMaxVoltageLevel;
	   LEAKAGE_VOLTAGE_LUT_ENTRY_V2 asLeakageIdLut;
	@Override
	public int getLength() {
		int length = 16;
		length += new ATOM_VOLTAGE_OBJECT_HEADER_V3().getLength();
		length += new LEAKAGE_VOLTAGE_LUT_ENTRY_V2().getLength();

		return length;
	}   
}
