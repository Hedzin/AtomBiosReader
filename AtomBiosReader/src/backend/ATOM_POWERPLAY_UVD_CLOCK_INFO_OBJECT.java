package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT extends AContainer {

	ShortStructure  usVClkLow = new ShortStructure();
	ByteStructure  ucVClkHigh = new ByteStructure();
	ShortStructure  usDClkLow = new ShortStructure();
	ByteStructure  ucDClkHigh = new ByteStructure();
	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usVClkLow);
		list.add(ucVClkHigh);
		list.add(usDClkLow);
		list.add(ucDClkHigh);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usVClkLow.setName("usVClkLow");
		ucVClkHigh.setName("ucVClkHigh");
		usDClkLow.setName("usDClkLow");
		ucDClkHigh.setName("ucDClkHigh");


		
		super.fillSubListDescriptions();
	}

}
