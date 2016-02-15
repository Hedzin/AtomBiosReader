package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_INFO_HEADER_V7_1 extends AContainer{
	ByteStructure  ucTableRevision =  new ByteStructure();
	ByteStructure usTableSize =  new ByteStructure();
	ShortStructure	ulGoldenPPID =  new ShortStructure();
	LongStructure	ulGoldenRevision =  new LongStructure();
	ByteStructure	usFormatID =  new ByteStructure();

	ShortStructure	usVoltageTime =  new ShortStructure();				 /*in microseconds */

	LongStructure	ulPlatformCaps =  new LongStructure();				  /*See ATOM_Tonga_CAPS_* */


		
	LongStructure	ulMaxODEngineClock =  new LongStructure(); 			   /*For Overdrive.  */
	LongStructure	ulMaxODMemoryClock =  new LongStructure(); 			   /*For Overdrive. */


	ShortStructure	usPowerControlLimit =  new ShortStructure();
	ShortStructure	usUlvVoltageOffset =  new ShortStructure();	


	ShortStructure	usStateArrayOffset =  new ShortStructure();				  /*points to ATOM_Tonga_State_Array */
	ShortStructure	usFanTableOffset =  new ShortStructure();				  /*points to ATOM_Tonga_Fan_Table */
	ShortStructure	usThermalControllerOffset =  new ShortStructure();		   /*points to ATOM_Tonga_Thermal_Controller */
	ShortStructure	usReserv =  new ShortStructure();						   /*CustomThermalPolicy removed for Tonga. Keep this filed as reserved. */


	ShortStructure	usMclkDependencyTableOffset =  new ShortStructure();	   /*points to ATOM_Tonga_MCLK_Dependency_Table */
	ShortStructure	usSclkDependencyTableOffset =  new ShortStructure();	   /*points to ATOM_Tonga_SCLK_Dependency_Table */
	ShortStructure	usVddcLookupTableOffset =  new ShortStructure();		   /*points to ATOM_Tonga_Voltage_Lookup_Table */
	ShortStructure	usVddgfxLookupTableOffset =  new ShortStructure(); 		/*points to ATOM_Tonga_Voltage_Lookup_Table */

	ShortStructure	usMMDependencyTableOffset =  new ShortStructure();		  /*points to ATOM_Tonga_MM_Dependency_Table */
	ShortStructure	usVCEStateTableOffset =  new ShortStructure();			   /*points to ATOM_Tonga_VCE_State_Table; */
	ShortStructure	usPPMTableOffset =  new ShortStructure();				  /*points to ATOM_Tonga_PPM_Table */
	ShortStructure	usPowerTuneTableOffset =  new ShortStructure();			  /*points to ATOM_PowerTune_Table */
	ShortStructure	usHardLimitTableOffset =  new ShortStructure(); 		   /*points to ATOM_Tonga_Hard_Limit_Table */
	ShortStructure	usPCIETableOffset =  new ShortStructure();				  /*points to ATOM_Tonga_PCIE_Table */
	ShortStructure	usGPIOTableOffset =  new ShortStructure();				  /*points to ATOM_Tonga_GPIO_Table */

	ShortStructure	usReserved1 =  new ShortStructure();					   /*TODO: modify reserved size to fit structure aligning */
	ShortStructure	usReserved2 =  new ShortStructure();
	ShortStructure	usReserved3 =  new ShortStructure();
	ShortStructure	usReserved4 =  new ShortStructure();
	ShortStructure	usReserved5 =  new ShortStructure();
	ShortStructure	usReserved6 =  new ShortStructure();
	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucTableRevision);
		list.add(usTableSize);
		list.add(ulGoldenPPID);
		list.add(ulGoldenRevision);
		list.add(usFormatID);
		list.add(usVoltageTime);
		list.add(ulPlatformCaps);
		list.add(ulMaxODEngineClock);
		list.add(ulMaxODMemoryClock);
		list.add(usPowerControlLimit);
		list.add(usUlvVoltageOffset);
		list.add(usStateArrayOffset);
		list.add(usFanTableOffset);
		list.add(usThermalControllerOffset);
		list.add(usReserv);
		list.add(usMclkDependencyTableOffset);
		list.add(usSclkDependencyTableOffset);
		list.add(usVddcLookupTableOffset);
		list.add(usVddgfxLookupTableOffset);
		list.add(usMMDependencyTableOffset);
		list.add(usVCEStateTableOffset);
		list.add(usPPMTableOffset);
		list.add(usPowerTuneTableOffset);
		list.add(usHardLimitTableOffset);
		list.add(usPCIETableOffset);
		list.add(usGPIOTableOffset);
		list.add(usReserved1);
		list.add(usReserved2);
		list.add(usReserved3);
		list.add(usReserved4);
		list.add(usReserved5);
		list.add(usReserved6);
		
		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {
		ucTableRevision.setName("TableRevision");
		usTableSize.setName("TableSize");
		ulGoldenPPID.setName("GoldenPPID");
		ulGoldenRevision.setName("GoldenRevision");
		usFormatID.setName("FormatID");
		usVoltageTime.setName("VoltageTime");
		ulPlatformCaps.setName("PlatformCaps");
		ulMaxODEngineClock.setName("MaxODEngineClock");
		ulMaxODMemoryClock.setName("MaxODMemoryClock");
		usPowerControlLimit.setName("PowerControlLimit");
		usUlvVoltageOffset.setName("UlvVoltageOffset");
		usStateArrayOffset.setName("StateArrayOffset");
		usFanTableOffset.setName("FanTableOffset");
		usThermalControllerOffset.setName("ThermalControllerOffset");
		usReserv.setName("Reserv");
		usMclkDependencyTableOffset.setName("MclkDependencyTableOffset");
		usSclkDependencyTableOffset.setName("SclkDependencyTableOffset");
		usVddcLookupTableOffset.setName("VddcLookupTableOffset");
		usVddgfxLookupTableOffset.setName("VddgfxLookupTableOffset");
		usMMDependencyTableOffset.setName("MMDependencyTableOffset");
		usVCEStateTableOffset.setName("VCEStateTableOffset");
		usPPMTableOffset.setName("PPMTableOffset");
		usPowerTuneTableOffset.setName("PowerTuneTableOffset");
		usHardLimitTableOffset.setName("HardLimitTableOffset");
		usPCIETableOffset.setName("PCIETableOffset");
		usGPIOTableOffset.setName("GPIOTableOffset");
		usReserved1.setName("Reserved");
		usReserved2.setName("Reserved");
		usReserved3.setName("Reserved");
		usReserved4.setName("Reserved");
		usReserved5.setName("Reserved");
		usReserved6.setName("Reserved");
		ucTableRevision.setDescription("");
		usTableSize.setDescription("");
		ulGoldenPPID.setDescription("");
		ulGoldenRevision.setDescription("");
		usFormatID.setDescription("");
		usVoltageTime.setDescription("in microseconds");
		ulPlatformCaps.setDescription("See ATOM_Tonga_CAPS_");
		ulMaxODEngineClock.setDescription("For Overdrive.");
		ulMaxODMemoryClock.setDescription("For Overdrive.");
		usPowerControlLimit.setDescription("");
		usUlvVoltageOffset.setDescription("");
		usStateArrayOffset.setDescription("points to ATOM_Tonga_State_Array");
		usFanTableOffset.setDescription("points to ATOM_Tonga_Fan_Table");
		usThermalControllerOffset.setDescription("points to ATOM_Tonga_Thermal_Controller");
		usReserv.setDescription("CustomThermalPolicy removed for Tonga. Keep this filed as reserved.");
		usMclkDependencyTableOffset.setDescription("points to ATOM_Tonga_MCLK_Dependency_Table");
		usSclkDependencyTableOffset.setDescription("points to ATOM_Tonga_SCLK_Dependency_Table");
		usVddcLookupTableOffset.setDescription("points to ATOM_Tonga_Voltage_Lookup_Table");
		usVddgfxLookupTableOffset.setDescription("points to ATOM_Tonga_Voltage_Lookup_Table");
		usMMDependencyTableOffset.setDescription("points to ATOM_Tonga_MM_Dependency_Table");
		usVCEStateTableOffset.setDescription("points to ATOM_Tonga_VCE_State_Table");
		usPPMTableOffset.setDescription("points to ATOM_Tonga_PPM_Table");
		usPowerTuneTableOffset.setDescription("points to ATOM_PowerTune_Table");
		usHardLimitTableOffset.setDescription("points to ATOM_Tonga_Hard_Limit_Table");
		usPCIETableOffset.setDescription("points to ATOM_Tonga_PCIE_Table");
		usGPIOTableOffset.setDescription("points to ATOM_Tonga_GPIO_Table");
		usReserved1.setDescription("");
		usReserved2.setDescription("");
		usReserved3.setDescription("");
		usReserved4.setDescription("");
		usReserved5.setDescription("");
		usReserved6.setDescription("");
		super.fillSubListDescriptions();
	}
}
