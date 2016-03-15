package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_CLOCK_INFO_TABLE extends ADynamicContainer {
	
    
	ByteStructure ucNumEntries =  new ByteStructure(); //how many clock levels we have
   	ByteStructure ucEntrySize =  new ByteStructure();  //sizeof(ATOM_PPLIB_CLOCK_INFO)
   	
   	ATOM_POWERPLAY_CI_CLOCK_INFO ppClockInfo1 =  new ATOM_POWERPLAY_CI_CLOCK_INFO();
   	ATOM_POWERPLAY_CI_CLOCK_INFO ppClockInfo2 =  new ATOM_POWERPLAY_CI_CLOCK_INFO();
   	ATOM_POWERPLAY_CI_CLOCK_INFO ppClockInfo3 =  new ATOM_POWERPLAY_CI_CLOCK_INFO();
   	ATOM_POWERPLAY_CI_CLOCK_INFO ppClockInfo4 =  new ATOM_POWERPLAY_CI_CLOCK_INFO();
   	ATOM_POWERPLAY_CI_CLOCK_INFO ppClockInfo5 =  new ATOM_POWERPLAY_CI_CLOCK_INFO();
   	ATOM_POWERPLAY_CI_CLOCK_INFO ppClockInfo6 =  new ATOM_POWERPLAY_CI_CLOCK_INFO();
   	ATOM_POWERPLAY_CI_CLOCK_INFO ppClockInfo7 =  new ATOM_POWERPLAY_CI_CLOCK_INFO();
   	ATOM_POWERPLAY_CI_CLOCK_INFO ppClockInfo8 =  new ATOM_POWERPLAY_CI_CLOCK_INFO();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		list.add(ucEntrySize);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppClockInfo8);
			case 7:	list.add(ppClockInfo7);	
			case 6:	list.add(ppClockInfo6);
			case 5:	list.add(ppClockInfo5);
			case 4:	list.add(ppClockInfo4);
			case 3:	list.add(ppClockInfo3);
			case 2:	list.add(ppClockInfo2);
			case 1:	list.add(ppClockInfo1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("NumEntries");
		ucEntrySize.setName("ucEntrySize");
		ucNumEntries.setDescription("how many clock levels we have");
		ppClockInfo1.setName("ATOM_POWERPLAY_CI_CLOCK_INFO_1");
	    ppClockInfo2.setName("ATOM_POWERPLAY_CI_CLOCK_INFO_2");
	    ppClockInfo3.setName("ATOM_POWERPLAY_CI_CLOCK_INFO_3");
	    ppClockInfo4.setName("ATOM_POWERPLAY_CI_CLOCK_INFO_4");
	    ppClockInfo5.setName("ATOM_POWERPLAY_CI_CLOCK_INFO_5");
	    ppClockInfo6.setName("ATOM_POWERPLAY_CI_CLOCK_INFO_6");
	    ppClockInfo7.setName("ATOM_POWERPLAY_CI_CLOCK_INFO_7");
	    ppClockInfo8.setName("ATOM_POWERPLAY_CI_CLOCK_INFO_8");
		super.fillSubListDescriptions();
	}
}
