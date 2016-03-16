package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_CAC_LEAKAGE_TABLE extends ADynamicContainer {
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT ppCacLeakageObject1 =  new ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT();
	ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT ppCacLeakageObject2 =  new ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT();
	ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT ppCacLeakageObject3 =  new ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT();
	ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT ppCacLeakageObject4 =  new ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT();
	ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT ppCacLeakageObject5 =  new ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT();
	ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT ppCacLeakageObject6 =  new ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT();
	ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT ppCacLeakageObject7 =  new ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT();
	ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT ppCacLeakageObject8 =  new ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppCacLeakageObject8);
			case 7:	list.add(ppCacLeakageObject7);	
			case 6:	list.add(ppCacLeakageObject6);
			case 5:	list.add(ppCacLeakageObject5);
			case 4:	list.add(ppCacLeakageObject4);
			case 3:	list.add(ppCacLeakageObject3);
			case 2:	list.add(ppCacLeakageObject2);
			case 1:	list.add(ppCacLeakageObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("ucNumEntries");
		ppCacLeakageObject1.setName("ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT_1");
	    ppCacLeakageObject2.setName("ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT_2");
	    ppCacLeakageObject3.setName("ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT_3");
	    ppCacLeakageObject4.setName("ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT_4");
	    ppCacLeakageObject5.setName("ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT_5");
	    ppCacLeakageObject6.setName("ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT_6");
	    ppCacLeakageObject7.setName("ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT_7");
	    ppCacLeakageObject8.setName("ATOM_POWERPLAY_CAC_LEAKAGE_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
