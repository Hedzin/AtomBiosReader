package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_THERMAL_CONTROLLER_TABLE_V1 extends AContainer {
	
	ByteStructure ucRevId = new ByteStructure(); 
	ATOM_POWERPLAY_THERMAL_CONTROLLER_OBJECT_V1 termalControllerObject = new ATOM_POWERPLAY_THERMAL_CONTROLLER_OBJECT_V1();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucRevId);
		list.add(termalControllerObject);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucRevId.setName("ucRevId");
		termalControllerObject.setName("termalControllerObject");
		super.fillSubListDescriptions();
	}

}
