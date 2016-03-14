package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_STATE_OBJECT extends AContainer {

	ByteStructure EngineClockIndexHigh = new ByteStructure();
	ByteStructure EngineClockIndexLow = new ByteStructure();
	ByteStructure MemoryClockIndexHigh = new ByteStructure();
	ByteStructure MemoryClockIndexLow = new ByteStructure();
	ByteStructure PCIEGenLow = new ByteStructure();
	ByteStructure PCIEGenHigh = new ByteStructure();
	ByteStructure PCIELaneLow = new ByteStructure();
	ByteStructure PCIELaneHigh = new ByteStructure();
	ShortStructure Classification = new ShortStructure();
	LongStructure CapsAndSettings = new LongStructure();
	ShortStructure Classification2 = new ShortStructure();
	ByteStructure Unused1 = new ByteStructure();
	ByteStructure Unused2 = new ByteStructure();
	ByteStructure Unused3 = new ByteStructure();
	ByteStructure Unused4 = new ByteStructure();


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(EngineClockIndexHigh);
		list.add(EngineClockIndexLow);
		list.add(MemoryClockIndexHigh);
		list.add(MemoryClockIndexLow);
		list.add(PCIEGenLow);
		list.add(PCIEGenHigh);
		list.add(PCIELaneLow);
		list.add(PCIELaneHigh);
		list.add(Classification);
		list.add(CapsAndSettings);
		list.add(Classification2);
		list.add(Unused1);
		list.add(Unused2);
		list.add(Unused3);
		list.add(Unused4);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		EngineClockIndexHigh.setName("EngineClockIndexHigh");
		EngineClockIndexLow.setName("EngineClockIndexLow");
		MemoryClockIndexHigh.setName("MemoryClockIndexHigh");
		MemoryClockIndexLow.setName("MemoryClockIndexLow");
		PCIEGenLow.setName("PCIEGenLow");
		PCIEGenHigh.setName("PCIEGenHigh");
		PCIELaneLow.setName("PCIELaneLow");
		PCIELaneHigh.setName("PCIELaneHigh");
		Classification.setName("usClassification");
		CapsAndSettings.setName("ulCapsAndSettings");
		Classification2.setName("usClassification2");
		Unused1.setName("Unused1");
		Unused2.setName("Unused2");
		Unused3.setName("Unused3");
		Unused4.setName("Unused4");

		super.fillSubListDescriptions();
	}

}
