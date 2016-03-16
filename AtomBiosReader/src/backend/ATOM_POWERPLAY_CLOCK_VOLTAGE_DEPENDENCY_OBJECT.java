package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT extends AContainer {


	
	ShortStructure usClockLow = new ShortStructure();
	ByteStructure  ucClockHigh = new ByteStructure();
	ShortStructure usVoltage = new ShortStructure();



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usClockLow);
		list.add(ucClockHigh);
		list.add(usVoltage);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usClockLow.setName("usClockLow");

		ucClockHigh.setName("ucClockHigh");

		usVoltage.setName("usVoltage");


		super.fillSubListDescriptions();
	}

}
