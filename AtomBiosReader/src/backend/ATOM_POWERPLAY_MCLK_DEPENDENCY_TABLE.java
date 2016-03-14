package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_MCLK_DEPENDENCY_TABLE extends ADynamicContainer {
	ATOM_POWERPLAY_HEADER ppHeader =  new ATOM_POWERPLAY_HEADER();
	ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT ppMclkDependencyObject1 =  new ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT ppMclkDependencyObject2 =  new ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT ppMclkDependencyObject3 =  new ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT ppMclkDependencyObject4 =  new ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT ppMclkDependencyObject5 =  new ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT ppMclkDependencyObject6 =  new ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT ppMclkDependencyObject7 =  new ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT();
	ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT ppMclkDependencyObject8 =  new ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppHeader);
		if(ppHeader.getBinaryDataBlock()!=null){
			int objectCounter = ppHeader.numEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppMclkDependencyObject8);
			case 7:	list.add(ppMclkDependencyObject7);	
			case 6:	list.add(ppMclkDependencyObject6);
			case 5:	list.add(ppMclkDependencyObject5);
			case 4:	list.add(ppMclkDependencyObject4);
			case 3:	list.add(ppMclkDependencyObject3);
			case 2:	list.add(ppMclkDependencyObject2);
			case 1:	list.add(ppMclkDependencyObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppHeader.setName("ATOM_POWERPLAY_HEADER");
		ppMclkDependencyObject1.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT_1");
	    ppMclkDependencyObject2.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT_2");
	    ppMclkDependencyObject3.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT_3");
	    ppMclkDependencyObject4.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT_4");
	    ppMclkDependencyObject5.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT_5");
	    ppMclkDependencyObject6.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT_6");
	    ppMclkDependencyObject7.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT_7");
	    ppMclkDependencyObject8.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
