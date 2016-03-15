package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_STATE_TABLE_V6 extends ADynamicContainer {
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_STATE_OBJECT_V2 ppStateObject1 =  new ATOM_POWERPLAY_STATE_OBJECT_V2();
	ATOM_POWERPLAY_STATE_OBJECT_V2 ppStateObject2 =  new ATOM_POWERPLAY_STATE_OBJECT_V2();
	ATOM_POWERPLAY_STATE_OBJECT_V2 ppStateObject3 =  new ATOM_POWERPLAY_STATE_OBJECT_V2();
	ATOM_POWERPLAY_STATE_OBJECT_V2 ppStateObject4 =  new ATOM_POWERPLAY_STATE_OBJECT_V2();
	ATOM_POWERPLAY_STATE_OBJECT_V2 ppStateObject5 =  new ATOM_POWERPLAY_STATE_OBJECT_V2();
	ATOM_POWERPLAY_STATE_OBJECT_V2 ppStateObject6 =  new ATOM_POWERPLAY_STATE_OBJECT_V2();
	ATOM_POWERPLAY_STATE_OBJECT_V2 ppStateObject7 =  new ATOM_POWERPLAY_STATE_OBJECT_V2();
	ATOM_POWERPLAY_STATE_OBJECT_V2 ppStateObject8 =  new ATOM_POWERPLAY_STATE_OBJECT_V2();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppStateObject8);
			case 7:	list.add(ppStateObject7);	
			case 6:	list.add(ppStateObject6);
			case 5:	list.add(ppStateObject5);
			case 4:	list.add(ppStateObject4);
			case 3:	list.add(ppStateObject3);
			case 2:	list.add(ppStateObject2);
			case 1:	list.add(ppStateObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("NumEntries");
		
		ucNumEntries.setDescription("how many states we have ");
		ppStateObject1.setName("ATOM_POWERPLAY_STATE_OBJECT_1");
	    ppStateObject2.setName("ATOM_POWERPLAY_STATE_OBJECT_2");
	    ppStateObject3.setName("ATOM_POWERPLAY_STATE_OBJECT_3");
	    ppStateObject4.setName("ATOM_POWERPLAY_STATE_OBJECT_4");
	    ppStateObject5.setName("ATOM_POWERPLAY_STATE_OBJECT_5");
	    ppStateObject6.setName("ATOM_POWERPLAY_STATE_OBJECT_6");
	    ppStateObject7.setName("ATOM_POWERPLAY_STATE_OBJECT_7");
	    ppStateObject8.setName("ATOM_POWERPLAY_STATE_OBJECT_8");
		super.fillSubListDescriptions();
	}
}
