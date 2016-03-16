package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT extends AContainer {

	ShortStructure  usVoltage = new ShortStructure();
	ShortStructure  usACPClockLow = new ShortStructure();

	ByteStructure ucACPClockHigh = new ByteStructure();



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usVoltage);
		list.add(usACPClockLow);
		list.add(ucACPClockHigh);


		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usVoltage.setName("usVoltage");
		usACPClockLow.setName("usACPClockLow");
		ucACPClockHigh.setName("ucACPClockHigh");



		super.fillSubListDescriptions();
	}

}
