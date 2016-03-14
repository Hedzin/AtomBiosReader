package backend;

import java.util.ArrayList;
import java.util.List;

public class VOLTAGE_LUT_ENTRY  extends AContainer{
	 ShortStructure		usVoltageCode = new ShortStructure();									// The Voltage ID, either GPIO or I2C code
	 ShortStructure		usVoltageValue = new ShortStructure();								// The corresponding Voltage Value, in mV
	@Override
	public int getLength() {
		int length = 4;
		return length;
	}
	@Override
	public List<IStructure> getSubStructureList() {
		System.out.println("VOLTAGE_LUT_ENTRY_V2 getSubStructureList()");
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usVoltageCode);
		list.add(usVoltageValue);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usVoltageCode.setName("usVoltageCode");
		usVoltageCode.setDescription("The Voltage ID, either GPIO or I2C code");
		usVoltageValue.setName("VoltageValue");  
		usVoltageValue.setDescription("The corresponding Voltage Value, in mV");



		super.fillSubListDescriptions();
	}
}
