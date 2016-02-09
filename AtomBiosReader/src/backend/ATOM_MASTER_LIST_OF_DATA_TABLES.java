package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_MASTER_LIST_OF_DATA_TABLES extends AContainer implements IContainer {
	ShortStructure		UtilityPipeLine	 = new ShortStructure();	//	Offest for the utility to get parser info,Don't change this position!
	ShortStructure		MultimediaCapabilityInfo	 = new ShortStructure();	//	Only used by MM Lib,latest version 1.1, not configuable from Bios, need to include the table to build Bios
	ShortStructure		MultimediaConfigInfo	 = new ShortStructure();	//	Only used by MM Lib,latest version 2.1, not configuable from Bios, need to include the table to build Bios
	ShortStructure		StandardVESA_Timing	 = new ShortStructure();	//	Only used by Bios
	ShortStructure		FirmwareInfo	 = new ShortStructure();	//	Shared by various SW components,latest version 1.4
	ShortStructure		PaletteData	 = new ShortStructure();	//	Only used by BIOS
	ShortStructure		LCD_Info	 = new ShortStructure();	//	Shared by various SW components,latest version 1.3, was called LVDS_Info
	ShortStructure		DIGTransmitterInfo	 = new ShortStructure();	//	Internal used by VBIOS only version 3.1
	ShortStructure		AnalogTV_Info	 = new ShortStructure();	//	Shared by various SW components,latest version 1.1
	ShortStructure		SupportedDevicesInfo	 = new ShortStructure();	//	Will be obsolete from R600
	ShortStructure		GPIO_I2C_Info	 = new ShortStructure();	//	Shared by various SW components,latest version 1.2 will be used from R600
	ShortStructure		VRAM_UsageByFirmware	 = new ShortStructure();	//	Shared by various SW components,latest version 1.3 will be used from R600
	ShortStructure		GPIO_Pin_LUT	 = new ShortStructure();	//	Shared by various SW components,latest version 1.1
	ShortStructure		VESA_ToInternalModeLUT	 = new ShortStructure();	//	Only used by Bios
	ShortStructure		ComponentVideoInfo	 = new ShortStructure();	//	Shared by various SW components,latest version 2.1 will be used from R600
	ShortStructure		PowerPlayInfo	 = new ShortStructure();	//	Shared by various SW components,latest version 2.1,new design from R600
	ShortStructure		GPUVirtualizationInfo	 = new ShortStructure();	//	Will be obsolete from R600
	ShortStructure		SaveRestoreInfo	 = new ShortStructure();	//	Only used by Bios
	ShortStructure		PPLL_SS_Info	 = new ShortStructure();	//	Shared by various SW components,latest version 1.2, used to call SS_Info, change to new name because of int ASIC SS info
	ShortStructure		OemInfo	 = new ShortStructure();	//	Defined and used by external SW, should be obsolete soon
	ShortStructure		XTMDS_Info	 = new ShortStructure();	//	Will be obsolete from R600
	ShortStructure		MclkSS_Info	 = new ShortStructure();	//	Shared by various SW components,latest version 1.1, only enabled when ext SS chip is used
	ShortStructure		Object_Header	 = new ShortStructure();	//	Shared by various SW components,latest version 1.1
	ShortStructure		IndirectIOAccess	 = new ShortStructure();	//	Only used by Bios,this table position can't change at all!!
	ShortStructure		MC_InitParameter	 = new ShortStructure();	//	Only used by command table
	ShortStructure		ASIC_VDDC_Info	 = new ShortStructure();	//	Will be obsolete from R600
	ShortStructure		ASIC_InternalSS_Info	 = new ShortStructure();	//	New tabel name from R600, used to be called "ASIC_MVDDC_Info"
	ShortStructure		TV_VideoMode	 = new ShortStructure();	//	Only used by command table
	ShortStructure		VRAM_Info	 = new ShortStructure();	//	Only used by command table, latest version 1.3
	ShortStructure		MemoryTrainingInfo	 = new ShortStructure();	//	Used for VBIOS and Diag utility for memory training purpose since R600. the new table rev start from 2.1
	ShortStructure		IntegratedSystemInfo	 = new ShortStructure();	//	Shared by various SW components
	ShortStructure		ASIC_ProfilingInfo	 = new ShortStructure();	//	New table name from R600, used to be called "ASIC_VDDCI_Info" for pre-R600
	ShortStructure		VoltageObjectInfo	 = new ShortStructure();	//	Shared by various SW components, latest version 1.1
	ShortStructure		PowerSourceInfo	 = new ShortStructure();	//	Shared by various SW components, latest versoin 1.1
	ShortStructure		ServiceInfo	 = new ShortStructure();		
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(UtilityPipeLine);
		list.add(MultimediaCapabilityInfo);
		list.add(MultimediaConfigInfo);
		list.add(StandardVESA_Timing);
		list.add(FirmwareInfo);
		list.add(PaletteData);
		list.add(LCD_Info);
		list.add(DIGTransmitterInfo);
		list.add(AnalogTV_Info);
		list.add(SupportedDevicesInfo);
		list.add(GPIO_I2C_Info);
		list.add(VRAM_UsageByFirmware);
		list.add(GPIO_Pin_LUT);
		list.add(VESA_ToInternalModeLUT);
		list.add(ComponentVideoInfo);
		list.add(PowerPlayInfo);
		list.add(GPUVirtualizationInfo);
		list.add(SaveRestoreInfo);
		list.add(PPLL_SS_Info);
		list.add(OemInfo);
		list.add(XTMDS_Info);
		list.add(MclkSS_Info);
		list.add(Object_Header);
		list.add(IndirectIOAccess);
		list.add(MC_InitParameter);
		list.add(ASIC_VDDC_Info);
		list.add(ASIC_InternalSS_Info);
		list.add(TV_VideoMode);
		list.add(VRAM_Info);
		list.add(MemoryTrainingInfo);
		list.add(IntegratedSystemInfo);
		list.add(ASIC_ProfilingInfo);
		list.add(VoltageObjectInfo);
		list.add(PowerSourceInfo);
		list.add(ServiceInfo);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		UtilityPipeLine.setDescription("Offest for the utility to get parser info,Don't change this position!");
		MultimediaCapabilityInfo.setDescription("Only used by MM Lib,latest version 1.1, not configuable from Bios, need to include the table to build Bios");
		MultimediaConfigInfo.setDescription("Only used by MM Lib,latest version 2.1, not configuable from Bios, need to include the table to build Bios");
		StandardVESA_Timing.setDescription("Only used by Bios");
		FirmwareInfo.setDescription("Shared by various SW components,latest version 1.4");
		PaletteData.setDescription("Only used by BIOS");
		LCD_Info.setDescription("Shared by various SW components,latest version 1.3, was called LVDS_Info");
		DIGTransmitterInfo.setDescription("Internal used by VBIOS only version 3.1");
		AnalogTV_Info.setDescription("Shared by various SW components,latest version 1.1");
		SupportedDevicesInfo.setDescription("Will be obsolete from R600");
		GPIO_I2C_Info.setDescription("Shared by various SW components,latest version 1.2 will be used from R600");
		VRAM_UsageByFirmware.setDescription("Shared by various SW components,latest version 1.3 will be used from R600");
		GPIO_Pin_LUT.setDescription("Shared by various SW components,latest version 1.1");
		VESA_ToInternalModeLUT.setDescription("Only used by Bios");
		ComponentVideoInfo.setDescription("Shared by various SW components,latest version 2.1 will be used from R600");
		PowerPlayInfo.setDescription("Shared by various SW components,latest version 2.1,new design from R600");
		GPUVirtualizationInfo.setDescription("Will be obsolete from R600");
		SaveRestoreInfo.setDescription("Only used by Bios");
		PPLL_SS_Info.setDescription("Shared by various SW components,latest version 1.2, used to call SS_Info, change to new name because of int ASIC SS info");
		OemInfo.setDescription("Defined and used by external SW, should be obsolete soon");
		XTMDS_Info.setDescription("Will be obsolete from R600");
		MclkSS_Info.setDescription("Shared by various SW components,latest version 1.1, only enabled when ext SS chip is used");
		Object_Header.setDescription("Shared by various SW components,latest version 1.1");
		IndirectIOAccess.setDescription("Only used by Bios,this table position can't change at all!!");
		MC_InitParameter.setDescription("Only used by command table");
		ASIC_VDDC_Info.setDescription("Will be obsolete from R600");
		ASIC_InternalSS_Info.setDescription("New tabel name from R600, used to be called 'ASIC_MVDDC_Info'");
		TV_VideoMode.setDescription("Only used by command table");
		VRAM_Info.setDescription("Only used by command table, latest version 1.3");
		MemoryTrainingInfo.setDescription("Used for VBIOS and Diag utility for memory training purpose since R600. the new table rev start from 2.1");
		IntegratedSystemInfo.setDescription("Shared by various SW components");
		ASIC_ProfilingInfo.setDescription("New table name from R600, used to be called 'ASIC_VDDCI_Info' for pre-R600");
		VoltageObjectInfo.setDescription("Shared by various SW components, latest version 1.1");
		PowerSourceInfo.setDescription("Shared by various SW components, latest versoin 1.1");
		ServiceInfo.setDescription("???");

		UtilityPipeLine.setName("UtilityPipeLine");
		MultimediaCapabilityInfo.setName("MultimediaCapabilityInfo");
		MultimediaConfigInfo.setName("MultimediaConfigInfo");
		StandardVESA_Timing.setName("StandardVESA_Timing");
		FirmwareInfo.setName("FirmwareInfo");
		PaletteData.setName("PaletteData");
		LCD_Info.setName("LCD_Info");
		DIGTransmitterInfo.setName("DIGTransmitterInfo");
		AnalogTV_Info.setName("AnalogTV_Info");
		SupportedDevicesInfo.setName("SupportedDevicesInfo");
		GPIO_I2C_Info.setName("GPIO_I2C_Info");
		VRAM_UsageByFirmware.setName("VRAM_UsageByFirmware");
		GPIO_Pin_LUT.setName("GPIO_Pin_LUT");
		VESA_ToInternalModeLUT.setName("VESA_ToInternalModeLUT");
		ComponentVideoInfo.setName("ComponentVideoInfo");
		PowerPlayInfo.setName("PowerPlayInfo");
		GPUVirtualizationInfo.setName("GPUVirtualizationInfo");
		SaveRestoreInfo.setName("SaveRestoreInfo");
		PPLL_SS_Info.setName("PPLL_SS_Info");
		OemInfo.setName("OemInfo");
		XTMDS_Info.setName("XTMDS_Info");
		MclkSS_Info.setName("MclkSS_Info");
		Object_Header.setName("Object_Header");
		IndirectIOAccess.setName("IndirectIOAccess");
		MC_InitParameter.setName("MC_InitParameter");
		ASIC_VDDC_Info.setName("ASIC_VDDC_Info");
		ASIC_InternalSS_Info.setName("ASIC_InternalSS_Info");
		TV_VideoMode.setName("TV_VideoMode");
		VRAM_Info.setName("VRAM_Info");
		MemoryTrainingInfo.setName("MemoryTrainingInfo");
		IntegratedSystemInfo.setName("IntegratedSystemInfo");
		ASIC_ProfilingInfo.setName("ASIC_ProfilingInfo");
		VoltageObjectInfo.setName("VoltageObjectInfo");
		PowerSourceInfo.setName("PowerSourceInfo");
		ServiceInfo.setName("ServiceInfo");


		super.fillSubListDescriptions();
	}
}
