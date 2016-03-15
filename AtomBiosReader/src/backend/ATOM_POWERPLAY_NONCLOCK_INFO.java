package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_NONCLOCK_INFO extends AContainer {

	ShortStructure usClassification = new ShortStructure();
	ByteStructure ucMinTemperature = new ByteStructure();
	ByteStructure ucMaxTemperature = new ByteStructure();
	LongStructure ulCapsAndSettings = new LongStructure();
	ByteStructure ucRequiredPower = new ByteStructure();
	ShortStructure usClassification2 = new ShortStructure();
	LongStructure ulVCLK = new LongStructure();
	LongStructure ulDCLK = new LongStructure();
	ByteStructure ucUnused1 = new ByteStructure();
	ByteStructure ucUnused2 = new ByteStructure();
	ByteStructure ucUnused3 = new ByteStructure();
	ByteStructure ucUnused4 = new ByteStructure();
	ByteStructure ucUnused5 = new ByteStructure();





	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add( usClassification);
		list.add( ucMinTemperature);
		list.add( ucMaxTemperature);
		list.add( ulCapsAndSettings);
		list.add( ucRequiredPower);
		list.add( usClassification2);
		list.add( ulVCLK);
		list.add( ulDCLK );
		list.add( ucUnused1);
		list.add( ucUnused2);
		list.add( ucUnused3);
		list.add( ucUnused4);
		list.add( ucUnused5);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		usClassification.setName("usClassification");
		ucMinTemperature.setName("ucMinTemperature");
		ucMaxTemperature.setName("ucMaxTemperature");
		ulCapsAndSettings.setName("ulCapsAndSettings");
		ucRequiredPower.setName("ucRequiredPower");
		usClassification2.setName("usClassification2");
		ulVCLK.setName("ulVCLK");
		ulDCLK.setName("ulDCLK");
		ucUnused1.setName("ucUnused1");
		ucUnused2.setName("ucUnused2");
		ucUnused3.setName("ucUnused3");
		ucUnused4.setName("ucUnused4");
		ucUnused5.setName("ucUnused5");
		


		
		super.fillSubListDescriptions();
	}

}
