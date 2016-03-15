package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_INFO_HEADER_V5 extends AContainer{
	ATOM_POWERPLAY_INFO_HEADER_V4 basicTable4 = new ATOM_POWERPLAY_INFO_HEADER_V4();
    LongStructure ulTDPLimit = new LongStructure();
    LongStructure ulNearTDPLimit = new LongStructure();
    LongStructure ulSQRampingThreshold = new LongStructure();
    ShortStructure usCACLeakageTableOffset = new ShortStructure();// Points to ATOM_PPLIB_CAC_Leakage_Table
    LongStructure ulCACLeakage = new LongStructure();// The iLeakage for driver calculated CAC leakage table
    ShortStructure usTDPODLimit = new ShortStructure();
    ShortStructure usLoadLineSlope = new ShortStructure();// in milliOhms * 100
	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();

		list.add(basicTable4);
		list.add(ulTDPLimit);
		list.add(ulNearTDPLimit);
		list.add(ulSQRampingThreshold);
		list.add(usCACLeakageTableOffset);
		list.add(ulCACLeakage);
		list.add(usTDPODLimit);
		list.add(usLoadLineSlope);
		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {

		basicTable4.setName("basicTable4");
		ulTDPLimit.setName("ulTDPLimit");
		ulNearTDPLimit.setName("ulNearTDPLimit");
		ulSQRampingThreshold.setName("ulSQRampingThreshold");
		usCACLeakageTableOffset.setName("usCACLeakageTableOffset");
		ulCACLeakage.setName("ulCACLeakage");
		usTDPODLimit.setName("usTDPODLimit");
		usLoadLineSlope.setName("usLoadLineSlope");
		
		usCACLeakageTableOffset.setDescription("Points to ATOM_PPLIB_CAC_Leakage_Table");
		ulCACLeakage.setDescription("The iLeakage for driver calculated CAC leakage table");
		usLoadLineSlope.setDescription("in milliOhms * 100");
		super.fillSubListDescriptions();
	}
}
