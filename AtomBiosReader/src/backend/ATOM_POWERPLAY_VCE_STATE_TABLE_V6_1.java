package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VCE_STATE_TABLE_V6_1 extends ADynamicContainer {
	
	
	ByteStructure numEntries =  new ByteStructure();
	ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1 ppVceStateObject1 =  new ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1();
	ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1 ppVceStateObject2 =  new ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1();
	ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1 ppVceStateObject3 =  new ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1();
	ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1 ppVceStateObject4 =  new ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1();
	ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1 ppVceStateObject5 =  new ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1();
	ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1 ppVceStateObject6 =  new ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1();
	ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1 ppVceStateObject7 =  new ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1();
	ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1 ppVceStateObject8 =  new ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(numEntries);
		if(numEntries.getBinaryDataBlock()!=null){
			int objectCounter = numEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppVceStateObject8);
			case 7:	list.add(ppVceStateObject7);	
			case 6:	list.add(ppVceStateObject6);
			case 5:	list.add(ppVceStateObject5);
			case 4:	list.add(ppVceStateObject4);
			case 3:	list.add(ppVceStateObject3);
			case 2:	list.add(ppVceStateObject2);
			case 1:	list.add(ppVceStateObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		numEntries.setName("numEntries");
		ppVceStateObject1.setName("ATOM_POWERPLAY_VCE_STATE_OBJECT_1");
	    ppVceStateObject2.setName("ATOM_POWERPLAY_VCE_STATE_OBJECT_2");
	    ppVceStateObject3.setName("ATOM_POWERPLAY_VCE_STATE_OBJECT_3");
	    ppVceStateObject4.setName("ATOM_POWERPLAY_VCE_STATE_OBJECT_4");
	    ppVceStateObject5.setName("ATOM_POWERPLAY_VCE_STATE_OBJECT_5");
	    ppVceStateObject6.setName("ATOM_POWERPLAY_VCE_STATE_OBJECT_6");
	    ppVceStateObject7.setName("ATOM_POWERPLAY_VCE_STATE_OBJECT_7");
	    ppVceStateObject8.setName("ATOM_POWERPLAY_VCE_STATE_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
