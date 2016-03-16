package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_PHASESHEDDING_LIMITS_TABLE extends ADynamicContainer {
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT PhaseSheddingLimitsObject1 =  new ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT();
	ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT PhaseSheddingLimitsObject2 =  new ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT();
	ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT PhaseSheddingLimitsObject3 =  new ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT();
	ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT PhaseSheddingLimitsObject4 =  new ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT();
	ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT PhaseSheddingLimitsObject5 =  new ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT();
	ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT PhaseSheddingLimitsObject6 =  new ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT();
	ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT PhaseSheddingLimitsObject7 =  new ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT();
	ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT PhaseSheddingLimitsObject8 =  new ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(PhaseSheddingLimitsObject8);
			case 7:	list.add(PhaseSheddingLimitsObject7);	
			case 6:	list.add(PhaseSheddingLimitsObject6);
			case 5:	list.add(PhaseSheddingLimitsObject5);
			case 4:	list.add(PhaseSheddingLimitsObject4);
			case 3:	list.add(PhaseSheddingLimitsObject3);
			case 2:	list.add(PhaseSheddingLimitsObject2);
			case 1:	list.add(PhaseSheddingLimitsObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("ucNumEntries");
		PhaseSheddingLimitsObject1.setName("ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT_1");
	    PhaseSheddingLimitsObject2.setName("ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT_2");
	    PhaseSheddingLimitsObject3.setName("ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT_3");
	    PhaseSheddingLimitsObject4.setName("ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT_4");
	    PhaseSheddingLimitsObject5.setName("ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT_5");
	    PhaseSheddingLimitsObject6.setName("ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT_6");
	    PhaseSheddingLimitsObject7.setName("ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT_7");
	    PhaseSheddingLimitsObject8.setName("ATOM_POWERPLAY_PHASESHEDDING_LIMITS_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
