package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VOLTAGE_LOOKUP_TABLE extends ADynamicContainer {
	ATOM_POWERPLAY_HEADER ppHeader =  new ATOM_POWERPLAY_HEADER();
	ATOM_POWERPLAY_VOLTAGE_OBJECT ppVoltageObject1 =  new ATOM_POWERPLAY_VOLTAGE_OBJECT();
	ATOM_POWERPLAY_VOLTAGE_OBJECT ppVoltageObject2 =  new ATOM_POWERPLAY_VOLTAGE_OBJECT();
	ATOM_POWERPLAY_VOLTAGE_OBJECT ppVoltageObject3 =  new ATOM_POWERPLAY_VOLTAGE_OBJECT();
	ATOM_POWERPLAY_VOLTAGE_OBJECT ppVoltageObject4 =  new ATOM_POWERPLAY_VOLTAGE_OBJECT();
	ATOM_POWERPLAY_VOLTAGE_OBJECT ppVoltageObject5 =  new ATOM_POWERPLAY_VOLTAGE_OBJECT();
	ATOM_POWERPLAY_VOLTAGE_OBJECT ppVoltageObject6 =  new ATOM_POWERPLAY_VOLTAGE_OBJECT();
	ATOM_POWERPLAY_VOLTAGE_OBJECT ppVoltageObject7 =  new ATOM_POWERPLAY_VOLTAGE_OBJECT();
	ATOM_POWERPLAY_VOLTAGE_OBJECT ppVoltageObject8 =  new ATOM_POWERPLAY_VOLTAGE_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppHeader);
		if(ppHeader.getBinaryDataBlock()!=null){
			int objectCounter = ppHeader.numEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppVoltageObject8);
			case 7:	list.add(ppVoltageObject7);	
			case 6:	list.add(ppVoltageObject6);
			case 5:	list.add(ppVoltageObject5);
			case 4:	list.add(ppVoltageObject4);
			case 3:	list.add(ppVoltageObject3);
			case 2:	list.add(ppVoltageObject2);
			case 1:	list.add(ppVoltageObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppHeader.setName("ATOM_POWERPLAY_HEADER");
		ppVoltageObject1.setName("ATOM_POWERPLAY_VOLTAGE_OBJECT_1");
	    ppVoltageObject2.setName("ATOM_POWERPLAY_VOLTAGE_OBJECT_2");
	    ppVoltageObject3.setName("ATOM_POWERPLAY_VOLTAGE_OBJECT_3");
	    ppVoltageObject4.setName("ATOM_POWERPLAY_VOLTAGE_OBJECT_4");
	    ppVoltageObject5.setName("ATOM_POWERPLAY_VOLTAGE_OBJECT_5");
	    ppVoltageObject6.setName("ATOM_POWERPLAY_VOLTAGE_OBJECT_6");
	    ppVoltageObject7.setName("ATOM_POWERPLAY_VOLTAGE_OBJECT_7");
	    ppVoltageObject8.setName("ATOM_POWERPLAY_VOLTAGE_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
