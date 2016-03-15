package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_INFO_HEADER_V4 extends AContainer{
	ATOM_POWERPLAY_INFO_HEADER_V3 basicTable3 = new ATOM_POWERPLAY_INFO_HEADER_V3();
    LongStructure ulGoldenPPID = new LongStructure();// PPGen use only     
    LongStructure ulGoldenRevision = new LongStructure();// PPGen use only
    ShortStructure usVddcDependencyOnSCLKOffset = new ShortStructure();
    ShortStructure usVddciDependencyOnMCLKOffset = new ShortStructure();
    ShortStructure usVddcDependencyOnMCLKOffset = new ShortStructure();
    ShortStructure usMaxClockVoltageOnDCOffset = new ShortStructure();
    ShortStructure usVddcPhaseShedLimitsTableOffset = new ShortStructure();// Points to ATOM_PPLIB_PhaseSheddingLimits_Table
    ShortStructure usMvddDependencyOnMCLKOffset = new ShortStructure();
	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();

		list.add(basicTable3);
		list.add(ulGoldenPPID);
		list.add(ulGoldenRevision);
		list.add(usVddcDependencyOnSCLKOffset);
		list.add(usVddciDependencyOnMCLKOffset);
		list.add(usVddcDependencyOnMCLKOffset);
		list.add(usMaxClockVoltageOnDCOffset);
		list.add(usVddcPhaseShedLimitsTableOffset);
		list.add(usMvddDependencyOnMCLKOffset);
		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {

		basicTable3.setName("basicTable3");
		ulGoldenPPID.setName("ulGoldenPPID");
		ulGoldenRevision.setName("ulGoldenRevision");
		usVddcDependencyOnSCLKOffset.setName("usVddcDependencyOnSCLKOffset");
		usVddciDependencyOnMCLKOffset.setName("usVddciDependencyOnMCLKOffset");
		usVddcDependencyOnMCLKOffset.setName("usVddcDependencyOnMCLKOffset");
		usMaxClockVoltageOnDCOffset.setName("usMaxClockVoltageOnDCOffset");
		usVddcPhaseShedLimitsTableOffset.setName("usVddcPhaseShedLimitsTableOffset");
		usMvddDependencyOnMCLKOffset.setName("usMvddDependencyOnMCLKOffset");
		
		ulGoldenPPID.setDescription("PPGen use only");
		ulGoldenRevision.setDescription("PPGen use only");
		usVddcPhaseShedLimitsTableOffset.setDescription("Points to ATOM_PPLIB_PhaseSheddingLimits_Table");
		super.fillSubListDescriptions();
	}
}
