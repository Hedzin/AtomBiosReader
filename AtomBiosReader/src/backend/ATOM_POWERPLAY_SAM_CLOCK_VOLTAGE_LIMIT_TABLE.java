package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_TABLE extends ADynamicContainer {
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT SAMClockVoltageLimitsObject1 =  new ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT SAMClockVoltageLimitsObject2 =  new ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT SAMClockVoltageLimitsObject3 =  new ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT SAMClockVoltageLimitsObject4 =  new ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT SAMClockVoltageLimitsObject5 =  new ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT SAMClockVoltageLimitsObject6 =  new ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT SAMClockVoltageLimitsObject7 =  new ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT SAMClockVoltageLimitsObject8 =  new ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(SAMClockVoltageLimitsObject8);
			case 7:	list.add(SAMClockVoltageLimitsObject7);	
			case 6:	list.add(SAMClockVoltageLimitsObject6);
			case 5:	list.add(SAMClockVoltageLimitsObject5);
			case 4:	list.add(SAMClockVoltageLimitsObject4);
			case 3:	list.add(SAMClockVoltageLimitsObject3);
			case 2:	list.add(SAMClockVoltageLimitsObject2);
			case 1:	list.add(SAMClockVoltageLimitsObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("ucNumEntries");
		SAMClockVoltageLimitsObject1.setName("ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT_1");
	    SAMClockVoltageLimitsObject2.setName("ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT_2");
	    SAMClockVoltageLimitsObject3.setName("ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT_3");
	    SAMClockVoltageLimitsObject4.setName("ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT_4");
	    SAMClockVoltageLimitsObject5.setName("ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT_5");
	    SAMClockVoltageLimitsObject6.setName("ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT_6");
	    SAMClockVoltageLimitsObject7.setName("ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT_7");
	    SAMClockVoltageLimitsObject8.setName("ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
