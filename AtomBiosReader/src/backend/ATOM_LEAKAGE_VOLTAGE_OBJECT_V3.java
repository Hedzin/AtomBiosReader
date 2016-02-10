package backend;

public class ATOM_LEAKAGE_VOLTAGE_OBJECT_V3  extends AContainer{
	   ATOM_VOLTAGE_OBJECT_HEADER_V3 sHeader;    // voltage mode = 0x10/0x11/0x12
	   ByteStructure    ucLeakageCntlId;             // default is 0
	   ByteStructure    ucLeakageEntryNum;           // indicate the entry number of LeakageId/Voltage Lut table
	   ByteStructure    ucReserved1;
	   ByteStructure    ucReserved2;  
	   LongStructure    ulMaxVoltageLevel;
	   LEAKAGE_VOLTAGE_LUT_ENTRY_V2 asLeakageIdLut;
	@Override
	public int getLength() {
		int length = 16;
		length += new ATOM_VOLTAGE_OBJECT_HEADER_V3().getLength();
		length += new LEAKAGE_VOLTAGE_LUT_ENTRY_V2().getLength();

		return length;
	}  
	@Override
	public void fillSubListDescriptions() {
		sHeader.setName("ATOM_VOLTAGE_OBJECT_HEADER_V3");
		ucLeakageCntlId.setName("LeakageCntlId");
		ucLeakageEntryNum.setName("LeakageEntryNum");
		ucReserved1.setName("Reserved2");
		ucReserved2.setName("Reserved2");
		ulMaxVoltageLevel.setName("MaxVoltageLevel");
		asLeakageIdLut.setName("LeakageIdLut");
		super.fillSubListDescriptions();
	}
}
