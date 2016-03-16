package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_UVD_CLOCK_VOLTAGE_LIMIT_OBJECT extends AContainer {

	ShortStructure  usVoltage = new ShortStructure();
	ByteStructure ucUVDClockInfoIndex = new ByteStructure();



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usVoltage);
		list.add(ucUVDClockInfoIndex);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usVoltage.setName("usVoltage");
		ucUVDClockInfoIndex.setName("ucUVDClockInfoIndex");


		super.fillSubListDescriptions();
	}

}
