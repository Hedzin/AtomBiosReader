package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_INFO_HEADER_V2 extends AContainer{
	ATOM_POWERPLAY_INFO_HEADER_V1 basicTable = new ATOM_POWERPLAY_INFO_HEADER_V1();
    ByteStructure ucNumCustomThermalPolicy = new ByteStructure();
    ShortStructure usCustomThermalPolicyArrayOffset = new ShortStructure();

	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();

		list.add(basicTable);
		list.add(ucNumCustomThermalPolicy);
		list.add(usCustomThermalPolicyArrayOffset);

		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {

		basicTable.setName("basicTable");
		ucNumCustomThermalPolicy.setName("ucNumCustomThermalPolicy");
		usCustomThermalPolicyArrayOffset.setName("usCustomThermalPolicyArrayOffset");
		
		super.fillSubListDescriptions();
	}
}
