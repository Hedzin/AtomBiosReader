package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_UVD_TABLE_V6_1 extends ADynamicContainer {
	ByteStructure revid = new ByteStructure();
	ATOM_POWERPLAY_UVD_CLOCK_INFO_TABLE uvdClockInfo = new ATOM_POWERPLAY_UVD_CLOCK_INFO_TABLE();
	ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_TABLE uvdClockVoltageLimits = new ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_TABLE();
	


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(revid);
		list.add(uvdClockInfo);
		list.add(uvdClockVoltageLimits);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		revid.setName("revid");
		uvdClockInfo.setName("ATOM_POWERPLAY_UVD_CLOCK_INFO_TABLE");
		uvdClockVoltageLimits.setName("ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_TABLE");
		super.fillSubListDescriptions();
	}


}
