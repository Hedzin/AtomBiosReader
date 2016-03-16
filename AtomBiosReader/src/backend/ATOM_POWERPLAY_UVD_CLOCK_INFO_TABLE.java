package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_UVD_CLOCK_INFO_TABLE extends ADynamicContainer {
	
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject1 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject2 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject3 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject4 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject5 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject6 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject7 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject8 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject9 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject10 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject11 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject12 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject13 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject14 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject15 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT ppUVDClockInfoObject16 =  new ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 16:	list.add(ppUVDClockInfoObject16);
			case 15:	list.add(ppUVDClockInfoObject15);	
			case 14:	list.add(ppUVDClockInfoObject14);
			case 13:	list.add(ppUVDClockInfoObject13);
			case 12:	list.add(ppUVDClockInfoObject12);
			case 11:	list.add(ppUVDClockInfoObject11);
			case 10:	list.add(ppUVDClockInfoObject10);
			case 9:	list.add(ppUVDClockInfoObject9);
			case 8:	list.add(ppUVDClockInfoObject8);
			case 7:	list.add(ppUVDClockInfoObject7);	
			case 6:	list.add(ppUVDClockInfoObject6);
			case 5:	list.add(ppUVDClockInfoObject5);
			case 4:	list.add(ppUVDClockInfoObject4);
			case 3:	list.add(ppUVDClockInfoObject3);
			case 2:	list.add(ppUVDClockInfoObject2);
			case 1:	list.add(ppUVDClockInfoObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("ucNumEntries");
		ppUVDClockInfoObject1.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_1");
	    ppUVDClockInfoObject2.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_2");
	    ppUVDClockInfoObject3.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_3");
	    ppUVDClockInfoObject4.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_4");
	    ppUVDClockInfoObject5.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_5");
	    ppUVDClockInfoObject6.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_6");
	    ppUVDClockInfoObject7.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_7");
	    ppUVDClockInfoObject8.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_8");
		ppUVDClockInfoObject9.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_9");
	    ppUVDClockInfoObject10.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_10");
	    ppUVDClockInfoObject11.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_11");
	    ppUVDClockInfoObject12.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_12");
	    ppUVDClockInfoObject13.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_13");
	    ppUVDClockInfoObject14.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_14");
	    ppUVDClockInfoObject15.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_15");
	    ppUVDClockInfoObject16.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_OBJECT_16");
		super.fillSubListDescriptions();
	}


}
