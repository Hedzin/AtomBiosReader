package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_FAN_OBJECT_V2 extends AContainer {
	
	ATOM_POWERPLAY_FAN_OBJECT_V1 ppFan1 =  new ATOM_POWERPLAY_FAN_OBJECT_V1();
	ShortStructure  usTMax = new ShortStructure(); /* The max temperature */



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();

		list.add(ppFan1);
		list.add(usTMax);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppFan1.setName("FAN_TABLE_V1");
		usTMax.setName("usTMax");


		

		usTMax.setDescription("The max temperature");



		
		super.fillSubListDescriptions();
	}

}
