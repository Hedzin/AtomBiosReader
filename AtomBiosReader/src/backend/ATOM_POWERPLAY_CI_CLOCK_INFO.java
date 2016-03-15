package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_CI_CLOCK_INFO extends AContainer {

	ShortStructure usEngineClockLow = new ShortStructure();
	ByteStructure ucEngineClockHigh = new ByteStructure();

	ShortStructure usMemoryClockLow = new ShortStructure();
	ByteStructure ucMemoryClockHigh = new ByteStructure();

	ByteStructure ucPCIEGen = new ByteStructure();
	ShortStructure usPCIELane = new ShortStructure();



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usEngineClockLow);
		list.add(ucEngineClockHigh);
		list.add(usMemoryClockLow);
		list.add(ucMemoryClockHigh);
		list.add(ucPCIEGen);
		list.add(usPCIELane);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usEngineClockLow.setName("usEngineClockLow");
		ucEngineClockHigh.setName("ucEngineClockHigh");
		usMemoryClockLow.setName("usMemoryClockLow");
		ucMemoryClockHigh.setName("ucMemoryClockHigh");
		ucPCIEGen.setName("ucPCIEGen");
		usPCIELane.setName("usPCIELane");
		


		
		super.fillSubListDescriptions();
	}

}
