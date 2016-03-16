package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VCE_CLOCK_INFO_TABLE extends ADynamicContainer {
	
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject1 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject2 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject3 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject4 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject5 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject6 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject7 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject8 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject9 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject10 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject11 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject12 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject13 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject14 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject15 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT ppVceClockInfoObject16 =  new ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 16:	list.add(ppVceClockInfoObject16);
			case 15:	list.add(ppVceClockInfoObject15);	
			case 14:	list.add(ppVceClockInfoObject14);
			case 13:	list.add(ppVceClockInfoObject13);
			case 12:	list.add(ppVceClockInfoObject12);
			case 11:	list.add(ppVceClockInfoObject11);
			case 10:	list.add(ppVceClockInfoObject10);
			case 9:	list.add(ppVceClockInfoObject9);
			case 8:	list.add(ppVceClockInfoObject8);
			case 7:	list.add(ppVceClockInfoObject7);	
			case 6:	list.add(ppVceClockInfoObject6);
			case 5:	list.add(ppVceClockInfoObject5);
			case 4:	list.add(ppVceClockInfoObject4);
			case 3:	list.add(ppVceClockInfoObject3);
			case 2:	list.add(ppVceClockInfoObject2);
			case 1:	list.add(ppVceClockInfoObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("ucNumEntries");
		ppVceClockInfoObject1.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_1");
	    ppVceClockInfoObject2.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_2");
	    ppVceClockInfoObject3.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_3");
	    ppVceClockInfoObject4.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_4");
	    ppVceClockInfoObject5.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_5");
	    ppVceClockInfoObject6.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_6");
	    ppVceClockInfoObject7.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_7");
	    ppVceClockInfoObject8.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_8");
		ppVceClockInfoObject9.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_9");
	    ppVceClockInfoObject10.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_10");
	    ppVceClockInfoObject11.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_11");
	    ppVceClockInfoObject12.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_12");
	    ppVceClockInfoObject13.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_13");
	    ppVceClockInfoObject14.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_14");
	    ppVceClockInfoObject15.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_15");
	    ppVceClockInfoObject16.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_OBJECT_16");
		super.fillSubListDescriptions();
	}


}
