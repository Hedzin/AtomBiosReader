
public class VOLTAGE_LUT_ENTRY  implements IStructure{
	 Short		usVoltageCode;									// The Voltage ID, either GPIO or I2C code
	 Short		usVoltageValue;									// The corresponding Voltage Value, in mV
	@Override
	public int getLength() {
		int length = 4;
		return length;
	}

}
