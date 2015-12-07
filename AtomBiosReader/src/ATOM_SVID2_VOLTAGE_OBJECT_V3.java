
public class ATOM_SVID2_VOLTAGE_OBJECT_V3 implements IStructure {
	   ATOM_VOLTAGE_OBJECT_HEADER_V3 sHeader;    // voltage mode = VOLTAGE_OBJ_SVID2
	// 14:7  PSI0_VID
	// 5  PSI1
	// 4:2  load line slope trim. 
	// 1:0  offset trim, 
	   Short   usLoadLine_PSI;    
	// GPU GPIO pin Id to SVID2 regulator VRHot pin. possible value 0~31. 0 means GPIO0, 31 means GPIO31
	   Byte    ucSVDGpioId;     //0~31 indicate GPIO0~31
	   Byte    ucSVCGpioId;     //0~31 indicate GPIO0~31
	   Long    ulReserved;
	@Override
	public int getLength() {
		int length = 12;
		length += new ATOM_VOLTAGE_OBJECT_HEADER_V3().getLength();
		return length;
	}
}
