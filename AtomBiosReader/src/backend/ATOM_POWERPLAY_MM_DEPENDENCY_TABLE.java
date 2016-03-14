package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_MM_DEPENDENCY_TABLE extends ADynamicContainer {
	ATOM_POWERPLAY_HEADER ppHeader =  new ATOM_POWERPLAY_HEADER();
	ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT ppMMDependencyObject1 =  new ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT ppMMDependencyObject2 =  new ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT ppMMDependencyObject3 =  new ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT ppMMDependencyObject4 =  new ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT ppMMDependencyObject5 =  new ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT ppMMDependencyObject6 =  new ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT ppMMDependencyObject7 =  new ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT ppMMDependencyObject8 =  new ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppHeader);
		if(ppHeader.getBinaryDataBlock()!=null){
			int objectCounter = ppHeader.numEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppMMDependencyObject8);
			case 7:	list.add(ppMMDependencyObject7);	
			case 6:	list.add(ppMMDependencyObject6);
			case 5:	list.add(ppMMDependencyObject5);
			case 4:	list.add(ppMMDependencyObject4);
			case 3:	list.add(ppMMDependencyObject3);
			case 2:	list.add(ppMMDependencyObject2);
			case 1:	list.add(ppMMDependencyObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppHeader.setName("ATOM_POWERPLAY_HEADER");
		ppMMDependencyObject1.setName("ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT_1");
	    ppMMDependencyObject2.setName("ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT_2");
	    ppMMDependencyObject3.setName("ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT_3");
	    ppMMDependencyObject4.setName("ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT_4");
	    ppMMDependencyObject5.setName("ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT_5");
	    ppMMDependencyObject6.setName("ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT_6");
	    ppMMDependencyObject7.setName("ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT_7");
	    ppMMDependencyObject8.setName("ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
