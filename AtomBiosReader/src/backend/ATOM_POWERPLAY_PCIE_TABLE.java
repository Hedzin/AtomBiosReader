package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_PCIE_TABLE extends ADynamicContainer {
	ATOM_POWERPLAY_HEADER ppHeader =  new ATOM_POWERPLAY_HEADER();
	ATOM_POWERPLAY_PCIE_OBJECT ppPCIEObject1 =  new ATOM_POWERPLAY_PCIE_OBJECT();
	ATOM_POWERPLAY_PCIE_OBJECT ppPCIEObject2 =  new ATOM_POWERPLAY_PCIE_OBJECT();
	ATOM_POWERPLAY_PCIE_OBJECT ppPCIEObject3 =  new ATOM_POWERPLAY_PCIE_OBJECT();
	ATOM_POWERPLAY_PCIE_OBJECT ppPCIEObject4 =  new ATOM_POWERPLAY_PCIE_OBJECT();
	ATOM_POWERPLAY_PCIE_OBJECT ppPCIEObject5 =  new ATOM_POWERPLAY_PCIE_OBJECT();
	ATOM_POWERPLAY_PCIE_OBJECT ppPCIEObject6 =  new ATOM_POWERPLAY_PCIE_OBJECT();
	ATOM_POWERPLAY_PCIE_OBJECT ppPCIEObject7 =  new ATOM_POWERPLAY_PCIE_OBJECT();
	ATOM_POWERPLAY_PCIE_OBJECT ppPCIEObject8 =  new ATOM_POWERPLAY_PCIE_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppHeader);
		if(ppHeader.getBinaryDataBlock()!=null){
			int objectCounter = ppHeader.numEntries.getBinaryDataBlock().getIntegerLE();
			switch (objectCounter) {
			case 8:	list.add(ppPCIEObject8);
			case 7:	list.add(ppPCIEObject7);	
			case 6:	list.add(ppPCIEObject6);
			case 5:	list.add(ppPCIEObject5);
			case 4:	list.add(ppPCIEObject4);
			case 3:	list.add(ppPCIEObject3);
			case 2:	list.add(ppPCIEObject2);
			case 1:	list.add(ppPCIEObject1);
			default:
				break;
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppHeader.setName("ATOM_POWERPLAY_HEADER");
		ppPCIEObject1.setName("ATOM_POWERPLAY_PCIE_OBJECT_1");
	    ppPCIEObject2.setName("ATOM_POWERPLAY_PCIE_OBJECT_2");
	    ppPCIEObject3.setName("ATOM_POWERPLAY_PCIE_OBJECT_3");
	    ppPCIEObject4.setName("ATOM_POWERPLAY_PCIE_OBJECT_4");
	    ppPCIEObject5.setName("ATOM_POWERPLAY_PCIE_OBJECT_5");
	    ppPCIEObject6.setName("ATOM_POWERPLAY_PCIE_OBJECT_6");
	    ppPCIEObject7.setName("ATOM_POWERPLAY_PCIE_OBJECT_7");
	    ppPCIEObject8.setName("ATOM_POWERPLAY_PCIE_OBJECT_8");
		super.fillSubListDescriptions();
	}


}
