package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_TABLE extends ADynamicContainer {
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT vceClockVoltageLimitsObject1 =  new ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT vceClockVoltageLimitsObject2 =  new ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT vceClockVoltageLimitsObject3 =  new ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT vceClockVoltageLimitsObject4 =  new ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT vceClockVoltageLimitsObject5 =  new ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT vceClockVoltageLimitsObject6 =  new ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT vceClockVoltageLimitsObject7 =  new ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT vceClockVoltageLimitsObject8 =  new ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(vceClockVoltageLimitsObject8);
			case 7:	list.add(vceClockVoltageLimitsObject7);	
			case 6:	list.add(vceClockVoltageLimitsObject6);
			case 5:	list.add(vceClockVoltageLimitsObject5);
			case 4:	list.add(vceClockVoltageLimitsObject4);
			case 3:	list.add(vceClockVoltageLimitsObject3);
			case 2:	list.add(vceClockVoltageLimitsObject2);
			case 1:	list.add(vceClockVoltageLimitsObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("ucNumEntries");
		vceClockVoltageLimitsObject1.setName("ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT_1");
	    vceClockVoltageLimitsObject2.setName("ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT_2");
	    vceClockVoltageLimitsObject3.setName("ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT_3");
	    vceClockVoltageLimitsObject4.setName("ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT_4");
	    vceClockVoltageLimitsObject5.setName("ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT_5");
	    vceClockVoltageLimitsObject6.setName("ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT_6");
	    vceClockVoltageLimitsObject7.setName("ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT_7");
	    vceClockVoltageLimitsObject8.setName("ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
