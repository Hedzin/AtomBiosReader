package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_ACP_TABLE_V6_1 extends ADynamicContainer {
	ByteStructure revid = new ByteStructure();
	ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_TABLE aspClockVoltageLimits = new ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_TABLE();
	


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(revid);
		list.add(aspClockVoltageLimits);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		revid.setName("revid");
		aspClockVoltageLimits.setName("ATOM_POWERPLAY_ACP_CLOCK_VOLTAGE_LIMIT_TABLE");
		super.fillSubListDescriptions();
	}


}
