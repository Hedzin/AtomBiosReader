package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_NONCLOCK_INFO_TABLE extends ADynamicContainer {
	
    
	ByteStructure ucNumEntries =  new ByteStructure(); //how many non-clock levels we have. normally should be same as number of states
   	ByteStructure ucEntrySize =  new ByteStructure();  ////sizeof(ATOM_PPLIB_NONCLOCK_INFO)

    
    
   	ATOM_POWERPLAY_NONCLOCK_INFO ppNonClockInfo1 =  new ATOM_POWERPLAY_NONCLOCK_INFO();
   	ATOM_POWERPLAY_NONCLOCK_INFO ppNonClockInfo2 =  new ATOM_POWERPLAY_NONCLOCK_INFO();
   	ATOM_POWERPLAY_NONCLOCK_INFO ppNonClockInfo3 =  new ATOM_POWERPLAY_NONCLOCK_INFO();
   	ATOM_POWERPLAY_NONCLOCK_INFO ppNonClockInfo4 =  new ATOM_POWERPLAY_NONCLOCK_INFO();
   	ATOM_POWERPLAY_NONCLOCK_INFO ppNonClockInfo5 =  new ATOM_POWERPLAY_NONCLOCK_INFO();
   	ATOM_POWERPLAY_NONCLOCK_INFO ppNonClockInfo6 =  new ATOM_POWERPLAY_NONCLOCK_INFO();
   	ATOM_POWERPLAY_NONCLOCK_INFO ppNonClockInfo7 =  new ATOM_POWERPLAY_NONCLOCK_INFO();
   	ATOM_POWERPLAY_NONCLOCK_INFO ppNonClockInfo8 =  new ATOM_POWERPLAY_NONCLOCK_INFO();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		list.add(ucEntrySize);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppNonClockInfo8);
			case 7:	list.add(ppNonClockInfo7);	
			case 6:	list.add(ppNonClockInfo6);
			case 5:	list.add(ppNonClockInfo5);
			case 4:	list.add(ppNonClockInfo4);
			case 3:	list.add(ppNonClockInfo3);
			case 2:	list.add(ppNonClockInfo2);
			case 1:	list.add(ppNonClockInfo1);
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
		ucNumEntries.setDescription("how many non-clock levels we have. normally should be same as number of states");
		ppNonClockInfo1.setName("ATOM_POWERPLAY_NONCLOCK_INFO_1");
	    ppNonClockInfo2.setName("ATOM_POWERPLAY_NONCLOCK_INFO_2");
	    ppNonClockInfo3.setName("ATOM_POWERPLAY_NONCLOCK_INFO_3");
	    ppNonClockInfo4.setName("ATOM_POWERPLAY_NONCLOCK_INFO_4");
	    ppNonClockInfo5.setName("ATOM_POWERPLAY_NONCLOCK_INFO_5");
	    ppNonClockInfo6.setName("ATOM_POWERPLAY_NONCLOCK_INFO_6");
	    ppNonClockInfo7.setName("ATOM_POWERPLAY_NONCLOCK_INFO_7");
	    ppNonClockInfo8.setName("ATOM_POWERPLAY_NONCLOCK_INFO_8");
		super.fillSubListDescriptions();
	}
}
