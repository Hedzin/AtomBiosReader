package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT extends AContainer {



	ShortStructure usVoltage = new ShortStructure();
	ShortStructure  usSclkLow = new ShortStructure();
	ByteStructure ucSclkHigh = new ByteStructure();
	ShortStructure usMclkLow = new ShortStructure();
	ByteStructure ucMclkHigh = new ByteStructure();



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usVoltage);
		list.add(usSclkLow);
		list.add(ucSclkHigh);
		list.add(usMclkLow);
		list.add(ucMclkHigh);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usVoltage.setName("usVoltage");
		usSclkLow.setName("usSclkLow");
		ucSclkHigh.setName("ucSclkHigh");
		usMclkLow.setName("usMclkLow");
		ucMclkHigh.setName("ucMclkHigh");

		super.fillSubListDescriptions();
	}

}
