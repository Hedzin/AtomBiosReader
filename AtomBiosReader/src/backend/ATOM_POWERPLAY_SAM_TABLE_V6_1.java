package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_SAM_TABLE_V6_1 extends ADynamicContainer {
	ByteStructure revid = new ByteStructure();
	ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_TABLE samClockVoltageLimits = new ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_TABLE();
	


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(revid);
		list.add(samClockVoltageLimits);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		revid.setName("revid");
		samClockVoltageLimits.setName("ATOM_POWERPLAY_SAM_CLOCK_VOLTAGE_LIMIT_TABLE");
		super.fillSubListDescriptions();
	}


}
