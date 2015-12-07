
public class VOLTAGE_LUT_ENTRY_V2 implements IStructure {
	 Long		ulVoltageId;									  // The Voltage ID which is used to program GPIO register
	 Short		usVoltageValue;									// The corresponding Voltage Value, in mV
	@Override
	public int getLength() {
		int length = 10;

		return length;
	}

}
