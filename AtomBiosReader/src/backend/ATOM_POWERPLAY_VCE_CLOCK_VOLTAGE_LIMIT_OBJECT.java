package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VCE_CLOCK_VOLTAGE_LIMIT_OBJECT extends AContainer {

	ShortStructure  usVoltage = new ShortStructure();
	ByteStructure ucVCEClockInfoIndex = new ByteStructure();




	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usVoltage);
		list.add(ucVCEClockInfoIndex);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usVoltage.setName("usVoltage");
		ucVCEClockInfoIndex.setName("ucVCEClockInfoIndex");


		super.fillSubListDescriptions();
	}

}
