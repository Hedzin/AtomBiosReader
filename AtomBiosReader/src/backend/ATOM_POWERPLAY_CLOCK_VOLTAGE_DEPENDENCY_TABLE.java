package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_TABLE extends ADynamicContainer {
	ByteStructure ucNumEntries =  new ByteStructure();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT ppClockVoltageDependencyObject1 =  new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT ppClockVoltageDependencyObject2 =  new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT ppClockVoltageDependencyObject3 =  new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT ppClockVoltageDependencyObject4 =  new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT ppClockVoltageDependencyObject5 =  new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT ppClockVoltageDependencyObject6 =  new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT ppClockVoltageDependencyObject7 =  new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT ppClockVoltageDependencyObject8 =  new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumEntries);
		if(ucNumEntries.getBinaryDataBlock()!=null){
			int objectCounter = ucNumEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppClockVoltageDependencyObject8);
			case 7:	list.add(ppClockVoltageDependencyObject7);	
			case 6:	list.add(ppClockVoltageDependencyObject6);
			case 5:	list.add(ppClockVoltageDependencyObject5);
			case 4:	list.add(ppClockVoltageDependencyObject4);
			case 3:	list.add(ppClockVoltageDependencyObject3);
			case 2:	list.add(ppClockVoltageDependencyObject2);
			case 1:	list.add(ppClockVoltageDependencyObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumEntries.setName("ucNumEntries");
		ppClockVoltageDependencyObject1.setName("ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT_1");
	    ppClockVoltageDependencyObject2.setName("ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT_2");
	    ppClockVoltageDependencyObject3.setName("ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT_3");
	    ppClockVoltageDependencyObject4.setName("ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT_4");
	    ppClockVoltageDependencyObject5.setName("ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT_5");
	    ppClockVoltageDependencyObject6.setName("ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT_6");
	    ppClockVoltageDependencyObject7.setName("ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT_7");
	    ppClockVoltageDependencyObject8.setName("ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
