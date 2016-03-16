package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_FAN_TABLE extends ADynamicContainer {
	
	ByteStructure ucRevId = new ByteStructure();/* Change this if the table format changes or version changes so that the other fields are not the same. */
	ATOM_POWERPLAY_FAN_OBJECT_V5 ppFanObject5 = new ATOM_POWERPLAY_FAN_OBJECT_V5();
	ATOM_POWERPLAY_FAN_OBJECT_V3 ppFanObject3 = new ATOM_POWERPLAY_FAN_OBJECT_V3();
	ATOM_POWERPLAY_FAN_OBJECT_V2 ppFanObject2 = new ATOM_POWERPLAY_FAN_OBJECT_V2();
	ATOM_POWERPLAY_FAN_OBJECT_V1 ppFanObject1 = new ATOM_POWERPLAY_FAN_OBJECT_V1();



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucRevId);
		if(ucRevId.getBinaryDataBlock()!=null){
			int tableVersion = ucRevId.getBinaryDataBlock().getIntegerLE();
			switch (tableVersion) {
	
			case 5:	list.add(ppFanObject5);break;
			case 4:	list.add(ppFanObject5);break;
			case 3:	list.add(ppFanObject3);break;
			case 2:	list.add(ppFanObject2);break;
			case 1:	list.add(ppFanObject1);break;
			default: list.add(ppFanObject5);break;
				
			}
		}

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucRevId.setName("ucRevId");
		ppFanObject5.setName("ppFanObject5");
		ppFanObject3.setName("ppFanObject3");
		ppFanObject2.setName("ppFanObject2");
		ppFanObject1.setName("ppFanObject1");



		
		super.fillSubListDescriptions();
	}

}
