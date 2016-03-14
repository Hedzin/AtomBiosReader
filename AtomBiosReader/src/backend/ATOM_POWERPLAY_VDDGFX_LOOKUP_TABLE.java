package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VDDGFX_LOOKUP_TABLE extends ADynamicContainer {
	ATOM_POWERPLAY_HEADER ppHeader =  new ATOM_POWERPLAY_HEADER();
	ATOM_POWERPLAY_VDDGFX_OBJECT ppVddGfxObject1 =  new ATOM_POWERPLAY_VDDGFX_OBJECT();
	ATOM_POWERPLAY_VDDGFX_OBJECT ppVddGfxObject2 =  new ATOM_POWERPLAY_VDDGFX_OBJECT();
	ATOM_POWERPLAY_VDDGFX_OBJECT ppVddGfxObject3 =  new ATOM_POWERPLAY_VDDGFX_OBJECT();
	ATOM_POWERPLAY_VDDGFX_OBJECT ppVddGfxObject4 =  new ATOM_POWERPLAY_VDDGFX_OBJECT();
	ATOM_POWERPLAY_VDDGFX_OBJECT ppVddGfxObject5 =  new ATOM_POWERPLAY_VDDGFX_OBJECT();
	ATOM_POWERPLAY_VDDGFX_OBJECT ppVddGfxObject6 =  new ATOM_POWERPLAY_VDDGFX_OBJECT();
	ATOM_POWERPLAY_VDDGFX_OBJECT ppVddGfxObject7 =  new ATOM_POWERPLAY_VDDGFX_OBJECT();
	ATOM_POWERPLAY_VDDGFX_OBJECT ppVddGfxObject8 =  new ATOM_POWERPLAY_VDDGFX_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppHeader);
		if(ppHeader.getBinaryDataBlock()!=null){
			int objectCounter = ppHeader.numEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppVddGfxObject8);
			case 7:	list.add(ppVddGfxObject7);	
			case 6:	list.add(ppVddGfxObject6);
			case 5:	list.add(ppVddGfxObject5);
			case 4:	list.add(ppVddGfxObject4);
			case 3:	list.add(ppVddGfxObject3);
			case 2:	list.add(ppVddGfxObject2);
			case 1:	list.add(ppVddGfxObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppHeader.setName("ATOM_POWERPLAY_HEADER");
		ppVddGfxObject1.setName("ATOM_POWERPLAY_VDDGFX_OBJECT_1");
	    ppVddGfxObject2.setName("ATOM_POWERPLAY_VDDGFX_OBJECT_2");
	    ppVddGfxObject3.setName("ATOM_POWERPLAY_VDDGFX_OBJECT_3");
	    ppVddGfxObject4.setName("ATOM_POWERPLAY_VDDGFX_OBJECT_4");
	    ppVddGfxObject5.setName("ATOM_POWERPLAY_VDDGFX_OBJECT_5");
	    ppVddGfxObject6.setName("ATOM_POWERPLAY_VDDGFX_OBJECT_6");
	    ppVddGfxObject7.setName("ATOM_POWERPLAY_VDDGFX_OBJECT_7");
	    ppVddGfxObject8.setName("ATOM_POWERPLAY_VDDGFX_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
