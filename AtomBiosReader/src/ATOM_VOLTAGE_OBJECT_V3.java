import java.util.List;

public class ATOM_VOLTAGE_OBJECT_V3 implements IFantomContainer {
	  ATOM_GPIO_VOLTAGE_OBJECT_V3 asGpioVoltageObj;
	  ATOM_I2C_VOLTAGE_OBJECT_V3 asI2cVoltageObj;
	  ATOM_LEAKAGE_VOLTAGE_OBJECT_V3 asLeakageObj;
	  ATOM_SVID2_VOLTAGE_OBJECT_V3 asSVID2Obj;
	  //StructureDataType dataType = StructureDataType.fantomContainer;
	  IStructure keyHeader = new ATOM_VOLTAGE_OBJECT_HEADER_V3();
	@Override
	public int getLength() {
		int length = 0;
		length += new ATOM_GPIO_VOLTAGE_OBJECT_V3().getLength();
		length += new ATOM_I2C_VOLTAGE_OBJECT_V3().getLength();
		length += new ATOM_LEAKAGE_VOLTAGE_OBJECT_V3().getLength();
		length += new ATOM_SVID2_VOLTAGE_OBJECT_V3().getLength();
		return length;
	}
	@Override
	public List<IStructure> getSubStructureList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IStructure getKeyStructure() {
		return keyHeader;
	}
}
