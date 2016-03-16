package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VCE_TABLE_V6_1 extends ADynamicContainer {
	ByteStructure revid = new ByteStructure();
	ATOM_POWERPLAY_VCE_CLOCK_INFO_TABLE vceClockInfo = new ATOM_POWERPLAY_VCE_CLOCK_INFO_TABLE();
	ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_TABLE vceClockVoltageLimits = new ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_TABLE();
	ATOM_POWERPLAY_VCE_STATE_TABLE_V6_1 vceStates = new ATOM_POWERPLAY_VCE_STATE_TABLE_V6_1();
	


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(revid);
		list.add(vceClockInfo);
		list.add(vceClockVoltageLimits);
		list.add(vceStates);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		revid.setName("revid");
		vceClockInfo.setName("ATOM_POWERPLAY_VCE_CLOCK_INFO_TABLE");
		vceClockVoltageLimits.setName("ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_TABLE");
		vceStates.setName("ATOM_POWERPLAY_VCE_STATE_TABLE");
		super.fillSubListDescriptions();
	}


}
