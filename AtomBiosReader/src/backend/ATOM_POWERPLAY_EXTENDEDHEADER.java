package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_EXTENDEDHEADER extends AContainer {
    ShortStructure  usSize = new ShortStructure();
    LongStructure   ulMaxEngineClock = new LongStructure();   // For Overdrive.
    LongStructure   ulMaxMemoryClock = new LongStructure();   // For Overdrive.
    ShortStructure  usVCETableOffset = new ShortStructure(); //points to ATOM_PPLIB_VCE_Table
    ShortStructure  usUVDTableOffset = new ShortStructure();   //points to ATOM_PPLIB_UVD_Table
    ShortStructure  usSAMUTableOffset = new ShortStructure();  //points to ATOM_PPLIB_SAMU_Table
    ShortStructure  usPPMTableOffset = new ShortStructure();   //points to ATOM_PPLIB_PPM_Table
    ShortStructure  usACPTableOffset = new ShortStructure();  //points to ATOM_PPLIB_ACP_Table   
    ShortStructure  usPowerTuneTableOffset = new ShortStructure(); /* points to ATOM_PPLIB_POWERTUNE_Table */
    ShortStructure  usSclkVddgfxTableOffset = new ShortStructure();  /* points to ATOM_PPLIB_CLOCK_Voltage_Dependency_Table for sclkVddgfxTable */

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(usSize);
		list.add(ulMaxEngineClock);
		list.add(ulMaxMemoryClock);
		list.add(usVCETableOffset);
		list.add(usUVDTableOffset);
		list.add(usSAMUTableOffset);
		list.add(usPPMTableOffset);
		list.add(usACPTableOffset);
		list.add(usPowerTuneTableOffset);
		list.add(usSclkVddgfxTableOffset);
		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {
		usSize.setName("usSize");
		ulMaxEngineClock.setName("ulMaxEngineClock");
		ulMaxMemoryClock.setName("ulMaxMemoryClock");
		usVCETableOffset.setName("usVCETableOffset");
		usUVDTableOffset.setName("usUVDTableOffset");
		usSAMUTableOffset.setName("usSAMUTableOffset");
		usPPMTableOffset.setName("usPPMTableOffset");
		usACPTableOffset.setName("usACPTableOffset");
		usPowerTuneTableOffset.setName("usPowerTuneTableOffset");
		usSclkVddgfxTableOffset.setName("usSclkVddgfxTableOffset");
		
		
		usSize.setDescription("");
		ulMaxEngineClock.setDescription("For Overdrive.");
		ulMaxMemoryClock.setDescription("For Overdrive.");
		usVCETableOffset.setDescription("points to ATOM_PPLIB_VCE_Table");
		usUVDTableOffset.setDescription("points to ATOM_PPLIB_UVD_Table");
		usSAMUTableOffset.setDescription("points to ATOM_PPLIB_SAMU_Table");
		usPPMTableOffset.setDescription("points to ATOM_PPLIB_PPM_Table");
		usACPTableOffset.setDescription("points to ATOM_PPLIB_ACP_Table");
		usPowerTuneTableOffset.setDescription("points to ATOM_PPLIB_POWERTUNE_Table");
		usSclkVddgfxTableOffset.setDescription("points to ATOM_PPLIB_CLOCK_Voltage_Dependency_Table for sclkVddgfxTable");
		super.fillSubListDescriptions();
	}
}
