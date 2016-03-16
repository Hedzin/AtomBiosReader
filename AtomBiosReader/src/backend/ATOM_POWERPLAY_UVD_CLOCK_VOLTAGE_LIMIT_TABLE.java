package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_TABLE extends ADynamicContainer {
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT UVDClockVoltageLimitsObject1 =  new ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT UVDClockVoltageLimitsObject2 =  new ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT UVDClockVoltageLimitsObject3 =  new ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT UVDClockVoltageLimitsObject4 =  new ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT UVDClockVoltageLimitsObject5 =  new ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT UVDClockVoltageLimitsObject6 =  new ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT UVDClockVoltageLimitsObject7 =  new ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT();
	ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT UVDClockVoltageLimitsObject8 =  new ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(UVDClockVoltageLimitsObject8);
			case 7:	list.add(UVDClockVoltageLimitsObject7);	
			case 6:	list.add(UVDClockVoltageLimitsObject6);
			case 5:	list.add(UVDClockVoltageLimitsObject5);
			case 4:	list.add(UVDClockVoltageLimitsObject4);
			case 3:	list.add(UVDClockVoltageLimitsObject3);
			case 2:	list.add(UVDClockVoltageLimitsObject2);
			case 1:	list.add(UVDClockVoltageLimitsObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("ucNumEntries");
		UVDClockVoltageLimitsObject1.setName("ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT_1");
	    UVDClockVoltageLimitsObject2.setName("ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT_2");
	    UVDClockVoltageLimitsObject3.setName("ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT_3");
	    UVDClockVoltageLimitsObject4.setName("ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT_4");
	    UVDClockVoltageLimitsObject5.setName("ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT_5");
	    UVDClockVoltageLimitsObject6.setName("ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT_6");
	    UVDClockVoltageLimitsObject7.setName("ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT_7");
	    UVDClockVoltageLimitsObject8.setName("ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
