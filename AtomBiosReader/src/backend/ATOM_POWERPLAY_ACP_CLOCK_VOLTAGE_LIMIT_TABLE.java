package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_TABLE extends ADynamicContainer {
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT ACPClockVoltageLimitsObject1 =  new ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT ACPClockVoltageLimitsObject2 =  new ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT ACPClockVoltageLimitsObject3 =  new ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT ACPClockVoltageLimitsObject4 =  new ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT ACPClockVoltageLimitsObject5 =  new ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT ACPClockVoltageLimitsObject6 =  new ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT ACPClockVoltageLimitsObject7 =  new ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT ACPClockVoltageLimitsObject8 =  new ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ACPClockVoltageLimitsObject8);
			case 7:	list.add(ACPClockVoltageLimitsObject7);	
			case 6:	list.add(ACPClockVoltageLimitsObject6);
			case 5:	list.add(ACPClockVoltageLimitsObject5);
			case 4:	list.add(ACPClockVoltageLimitsObject4);
			case 3:	list.add(ACPClockVoltageLimitsObject3);
			case 2:	list.add(ACPClockVoltageLimitsObject2);
			case 1:	list.add(ACPClockVoltageLimitsObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("ucNumEntries");
		ACPClockVoltageLimitsObject1.setName("ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT_1");
	    ACPClockVoltageLimitsObject2.setName("ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT_2");
	    ACPClockVoltageLimitsObject3.setName("ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT_3");
	    ACPClockVoltageLimitsObject4.setName("ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT_4");
	    ACPClockVoltageLimitsObject5.setName("ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT_5");
	    ACPClockVoltageLimitsObject6.setName("ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT_6");
	    ACPClockVoltageLimitsObject7.setName("ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT_7");
	    ACPClockVoltageLimitsObject8.setName("ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
