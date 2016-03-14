package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_SCLK_DEPENDENCY_TABLE extends ADynamicContainer {
	ATOM_POWERPLAY_HEADER ppHeader =  new ATOM_POWERPLAY_HEADER();
	ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT ppSclkDependencyObject1 =  new ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT ppSclkDependencyObject2 =  new ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT ppSclkDependencyObject3 =  new ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT ppSclkDependencyObject4 =  new ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT ppSclkDependencyObject5 =  new ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT ppSclkDependencyObject6 =  new ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT ppSclkDependencyObject7 =  new ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT ppSclkDependencyObject8 =  new ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppHeader);
		if(ppHeader.getBinaryDataBlock()!=null){
			int objectCounter = ppHeader.numEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppSclkDependencyObject8);
			case 7:	list.add(ppSclkDependencyObject7);	
			case 6:	list.add(ppSclkDependencyObject6);
			case 5:	list.add(ppSclkDependencyObject5);
			case 4:	list.add(ppSclkDependencyObject4);
			case 3:	list.add(ppSclkDependencyObject3);
			case 2:	list.add(ppSclkDependencyObject2);
			case 1:	list.add(ppSclkDependencyObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppHeader.setName("ATOM_POWERPLAY_HEADER");
		ppSclkDependencyObject1.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT_1");
	    ppSclkDependencyObject2.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT_2");
	    ppSclkDependencyObject3.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT_3");
	    ppSclkDependencyObject4.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT_4");
	    ppSclkDependencyObject5.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT_5");
	    ppSclkDependencyObject6.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT_6");
	    ppSclkDependencyObject7.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT_7");
	    ppSclkDependencyObject8.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
