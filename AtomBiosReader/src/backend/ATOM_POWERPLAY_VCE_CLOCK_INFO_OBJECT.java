package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT extends AContainer {

	ShortStructure  usEVClkLow = new ShortStructure();
	ByteStructure  ucEVClkHigh = new ByteStructure();
	ShortStructure  usECClkLow = new ShortStructure();
	ByteStructure  ucECClkHigh = new ByteStructure();
	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usEVClkLow);
		list.add(ucEVClkHigh);
		list.add(usECClkLow);
		list.add(ucECClkHigh);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usEVClkLow.setName("usEVClkLow");
		ucEVClkHigh.setName("ucEVClkHigh");
		usECClkLow.setName("usECClkLow");
		ucECClkHigh.setName("ucECClkHigh");


		
		super.fillSubListDescriptions();
	}

}
