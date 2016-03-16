package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT extends AContainer {

	ShortStructure  usVoltage = new ShortStructure();
	ShortStructure  usSAMClockLow = new ShortStructure();

	ByteStructure ucSAMClockHigh = new ByteStructure();


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usVoltage);
		list.add(usSAMClockLow);
		list.add(ucSAMClockHigh);


		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usVoltage.setName("usVoltage");
		usSAMClockLow.setName("usSAMClockLow");
		ucSAMClockHigh.setName("ucSAMClockHigh");



		super.fillSubListDescriptions();
	}

}
