
public class LEAKAGE_VOLTAGE_LUT_ENTRY_V2 implements IStructure {
	  Short	usVoltageLevel; 							  // The Voltage ID which is used to program GPIO register
	  Short  usVoltageId;                    
	  Short	usLeakageId;
	@Override
	public int getLength() {
		int length = 6;

		return length;
	}
}
