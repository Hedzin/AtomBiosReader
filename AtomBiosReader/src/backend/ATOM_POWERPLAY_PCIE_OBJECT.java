package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_PCIE_OBJECT extends AContainer {
	
	ByteStructure ucPCIEGenSpeed =  new ByteStructure();
	ByteStructure usPCIELaneWidth =  new ByteStructure();
	ByteStructure ucReserved1 =  new ByteStructure();
	ByteStructure ucReserved2 =  new ByteStructure();
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucPCIEGenSpeed);
		list.add(usPCIELaneWidth);
		list.add(ucReserved1);
		list.add(ucReserved2);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucPCIEGenSpeed.setName("ucPCIEGenSpeed");
		usPCIELaneWidth.setName("usPCIELaneWidth");
		ucReserved1.setName("ucReserved");
		ucReserved2.setName("ucReserved");


		
		super.fillSubListDescriptions();
	}

}
