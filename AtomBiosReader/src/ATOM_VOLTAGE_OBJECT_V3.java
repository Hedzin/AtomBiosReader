
public class ATOM_VOLTAGE_OBJECT_V3 implements IStructure {
	  ATOM_GPIO_VOLTAGE_OBJECT_V3 asGpioVoltageObj;
	  ATOM_I2C_VOLTAGE_OBJECT_V3 asI2cVoltageObj;
	  ATOM_LEAKAGE_VOLTAGE_OBJECT_V3 asLeakageObj;
	  ATOM_SVID2_VOLTAGE_OBJECT_V3 asSVID2Obj;
	@Override
	public int getLength() {
		int length = 0;
		length += new ATOM_GPIO_VOLTAGE_OBJECT_V3().getLength();
		length += new ATOM_I2C_VOLTAGE_OBJECT_V3().getLength();
		length += new ATOM_LEAKAGE_VOLTAGE_OBJECT_V3().getLength();
		length += new ATOM_SVID2_VOLTAGE_OBJECT_V3().getLength();
		return length;
	}
}
