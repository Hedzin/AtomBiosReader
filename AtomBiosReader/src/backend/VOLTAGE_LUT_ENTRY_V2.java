package backend;
import java.util.ArrayList;
import java.util.List;

public class VOLTAGE_LUT_ENTRY_V2 extends  AContainer {
	 LongStructure		ulVoltageId =  new LongStructure();									  // The Voltage ID which is used to program GPIO register
	 ShortStructure		usVoltageValue = new ShortStructure();									// The corresponding Voltage Value, in mV
	@Override
	public List<IStructure> getSubStructureList() {
		System.out.println("VOLTAGE_LUT_ENTRY_V2 getSubStructureList()");
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ulVoltageId);
		list.add(usVoltageValue);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ulVoltageId.setName("VoltageId");
		ulVoltageId.setDescription("The Voltage ID which is used to program GPIO register");
		usVoltageValue.setName("VoltageValue");  
		usVoltageValue.setDescription("The corresponding Voltage Value, in mV");



		super.fillSubListDescriptions();
	}
}
