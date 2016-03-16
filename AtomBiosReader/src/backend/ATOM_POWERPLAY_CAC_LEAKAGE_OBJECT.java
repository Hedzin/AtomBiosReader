package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT extends AContainer {


	
	ShortStructure usVddc1 = new ShortStructure();
	ShortStructure  usVddc2 = new ShortStructure();
	ShortStructure usVddc3 = new ShortStructure();



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usVddc1);
		list.add(usVddc2);
		list.add(usVddc3);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usVddc1.setName("usVddc1");

		usVddc2.setName("usVddc2");

		usVddc3.setName("usVddc3");


		super.fillSubListDescriptions();
	}

}
