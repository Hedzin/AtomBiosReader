package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_MASTER_LIST_OF_COMMAND_TABLES extends AContainer implements IContainer {

	 ShortStructure ASIC_Init = new ShortStructure();                              //Function Table, used by various SW components,latest version 1.1
	 ShortStructure GetDisplaySurfaceSize = new ShortStructure();                  //Atomic Table,  Used by Bios when enabling HW ICON
	 ShortStructure ASIC_RegistersInit = new ShortStructure();                     //Atomic Table,  indirectly used by various SW components,called from ASIC_Init
	 ShortStructure VRAM_BlockVenderDetection = new ShortStructure();              //Atomic Table,  used only by Bios
	 ShortStructure DIGxEncoderControl = new ShortStructure();                     //Only used by Bios
	 ShortStructure MemoryControllerInit = new ShortStructure();                   //Atomic Table,  indirectly used by various SW components,called from ASIC_Init
	 ShortStructure EnableCRTCMemReq = new ShortStructure();                       //Function Table,directly used by various SW components,latest version 2.1
	 ShortStructure MemoryParamAdjust = new ShortStructure();                      //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock if needed
	 ShortStructure DVOEncoderControl = new ShortStructure();                      //Function Table,directly used by various SW components,latest version 1.2
	 ShortStructure GPIOPinControl = new ShortStructure();                         //Atomic Table,  only used by Bios
	 ShortStructure SetEngineClock = new ShortStructure();                         //Function Table,directly used by various SW components,latest version 1.1
	 ShortStructure SetMemoryClock = new ShortStructure();                         //Function Table,directly used by various SW components,latest version 1.1
	 ShortStructure SetPixelClock = new ShortStructure();                          //Function Table,directly used by various SW components,latest version 1.2
	 ShortStructure EnableDispPowerGating = new ShortStructure();                  //Atomic Table,  indirectly used by various SW components,called from ASIC_Init
	 ShortStructure ResetMemoryDLL = new ShortStructure();                         //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	 ShortStructure ResetMemoryDevice = new ShortStructure();                      //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	 ShortStructure MemoryPLLInit = new ShortStructure();                          //Atomic Table,  used only by Bios
	 ShortStructure AdjustDisplayPll = new ShortStructure();                       //Atomic Table,  used by various SW componentes.
	 ShortStructure AdjustMemoryController = new ShortStructure();                 //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	 ShortStructure EnableASIC_StaticPwrMgt = new ShortStructure();                //Atomic Table,  only used by Bios
	 ShortStructure SetUniphyInstance = new ShortStructure();                      //Atomic Table,  only used by Bios
	 ShortStructure DAC_LoadDetection = new ShortStructure();                      //Atomic Table,  directly used by various SW components,latest version 1.2
	 ShortStructure LVTMAEncoderControl = new ShortStructure();                    //Atomic Table,directly used by various SW components,latest version 1.3
	 ShortStructure HW_Misc_Operation = new ShortStructure();                      //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure DAC1EncoderControl = new ShortStructure();                     //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure DAC2EncoderControl = new ShortStructure();                     //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure DVOOutputControl = new ShortStructure();                       //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure CV1OutputControl = new ShortStructure();                       //Atomic Table,  Atomic Table,  Obsolete from Ry6xx, use DAC2 Output instead
	 ShortStructure GetConditionalGoldenSetting = new ShortStructure();            //Only used by Bios
	 ShortStructure SMC_Init = new ShortStructure();                               //Function Table,directly used by various SW components,latest version 1.1
	 ShortStructure PatchMCSetting = new ShortStructure();                         //only used by BIOS
	 ShortStructure MC_SEQ_Control = new ShortStructure();                         //only used by BIOS
	 ShortStructure Gfx_Harvesting = new ShortStructure();                         //Atomic Table,  Obsolete from Ry6xx, Now only used by BIOS for GFX harvesting
	 ShortStructure EnableScaler = new ShortStructure();                           //Atomic Table,  used only by Bios
	 ShortStructure BlankCRTC = new ShortStructure();                              //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure EnableCRTC = new ShortStructure();                             //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure GetPixelClock = new ShortStructure();                          //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure EnableVGA_Render = new ShortStructure();                       //Function Table,directly used by various SW components,latest version 1.1
	 ShortStructure GetSCLKOverMCLKRatio = new ShortStructure();                   //Atomic Table,  only used by Bios
	 ShortStructure SetCRTC_Timing = new ShortStructure();                         //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure SetCRTC_OverScan = new ShortStructure();                       //Atomic Table,  used by various SW components,latest version 1.1
	 ShortStructure SetCRTC_Replication = new ShortStructure();                    //Atomic Table,  used only by Bios
	 ShortStructure SelectCRTC_Source = new ShortStructure();                      //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure EnableGraphSurfaces = new ShortStructure();                    //Atomic Table,  used only by Bios
	 ShortStructure UpdateCRTC_DoubleBufferRegisters = new ShortStructure();       //Atomic Table,  used only by Bios
	 ShortStructure LUT_AutoFill = new ShortStructure();                           //Atomic Table,  only used by Bios
	 ShortStructure EnableHW_IconCursor = new ShortStructure();                    //Atomic Table,  only used by Bios
	 ShortStructure GetMemoryClock = new ShortStructure();                         //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure GetEngineClock = new ShortStructure();                         //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure SetCRTC_UsingDTDTiming = new ShortStructure();                 //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure ExternalEncoderControl = new ShortStructure();                 //Atomic Table,  directly used by various SW components,latest version 2.1
	 ShortStructure LVTMAOutputControl = new ShortStructure();                     //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure VRAM_BlockDetectionByStrap = new ShortStructure();             //Atomic Table,  used only by Bios
	 ShortStructure MemoryCleanUp = new ShortStructure();                          //Atomic Table,  only used by Bios
	 ShortStructure ProcessI2cChannelTransaction = new ShortStructure();           //Function Table,only used by Bios
	 ShortStructure WriteOneByteToHWAssistedI2C = new ShortStructure();            //Function Table,indirectly used by various SW components
	 ShortStructure ReadHWAssistedI2CStatus = new ShortStructure();                //Atomic Table,  indirectly used by various SW components
	 ShortStructure SpeedFanControl = new ShortStructure();                        //Function Table,indirectly used by various SW components,called from ASIC_Init
	 ShortStructure PowerConnectorDetection = new ShortStructure();                //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure MC_Synchronization = new ShortStructure();                     //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	 ShortStructure ComputeMemoryEnginePLL = new ShortStructure();                 //Atomic Table,  indirectly used by various SW components,called from SetMemory/EngineClock
	 ShortStructure MemoryRefreshConversion = new ShortStructure();                //Atomic Table,  indirectly used by various SW components,called from SetMemory or SetEngineClock
	 ShortStructure VRAM_GetCurrentInfoBlock = new ShortStructure();               //Atomic Table,  used only by Bios
	 ShortStructure DynamicMemorySettings = new ShortStructure();                  //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	 ShortStructure MemoryTraining = new ShortStructure();                         //Atomic Table,  used only by Bios
	 ShortStructure EnableSpreadSpectrumOnPPLL = new ShortStructure();             //Atomic Table,  directly used by various SW components,latest version 1.2
	 ShortStructure TMDSAOutputControl = new ShortStructure();                     //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure SetVoltage = new ShortStructure();                             //Function Table,directly and/or indirectly used by various SW components,latest version 1.1
	 ShortStructure DAC1OutputControl = new ShortStructure();                      //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure ReadEfuseValue = new ShortStructure();                         //Atomic Table,  directly used by various SW components,latest version 1.1
	 ShortStructure ComputeMemoryClockParam = new ShortStructure();                //Function Table,only used by Bios, obsolete soon.Switch to use "ReadEDIDFromHWAssistedI2C"
	 ShortStructure ClockSource = new ShortStructure();                            //Atomic Table,  indirectly used by various SW components,called from ASIC_Init
	 ShortStructure MemoryDeviceInit = new ShortStructure();                       //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	 ShortStructure GetDispObjectInfo = new ShortStructure();                      //Atomic Table,  indirectly used by various SW components,called from EnableVGARender
	 ShortStructure DIG1EncoderControl = new ShortStructure();                     //Atomic Table,directly used by various SW components,latest version 1.1
	 ShortStructure DIG2EncoderControl = new ShortStructure();                     //Atomic Table,directly used by various SW components,latest version 1.1
	 ShortStructure DIG1TransmitterControl = new ShortStructure();                 //Atomic Table,directly used by various SW components,latest version 1.1
	 ShortStructure DIG2TransmitterControl = new ShortStructure();                 //Atomic Table,directly used by various SW components,latest version 1.1
	 ShortStructure ProcessAuxChannelTransaction = new ShortStructure();           //Function Table,only used by Bios
	 ShortStructure DPEncoderService = new ShortStructure();                       //Function Table,only used by Bios
	 ShortStructure GetVoltageInfo = new ShortStructure();                         //Function Table,only used by Bios since SI
	 
		@Override
		public List<IStructure> getSubStructureList() {
			List<IStructure> list = new  ArrayList<IStructure>();
			list.add(ASIC_Init);
			list.add(GetDisplaySurfaceSize);
			list.add(ASIC_RegistersInit);
			list.add(VRAM_BlockVenderDetection);
			list.add(DIGxEncoderControl);
			list.add(MemoryControllerInit);
			list.add(EnableCRTCMemReq);
			list.add(MemoryParamAdjust);
			list.add(DVOEncoderControl);
			list.add(GPIOPinControl);
			list.add(SetEngineClock);
			list.add(SetMemoryClock);
			list.add(SetPixelClock);
			list.add(EnableDispPowerGating);
			list.add(ResetMemoryDLL);
			list.add(ResetMemoryDevice);
			list.add(MemoryPLLInit);
			list.add(AdjustDisplayPll);
			list.add(AdjustMemoryController);
			list.add(EnableASIC_StaticPwrMgt);
			list.add(SetUniphyInstance);
			list.add(DAC_LoadDetection);
			list.add(LVTMAEncoderControl);
			list.add(HW_Misc_Operation);
			list.add(DAC1EncoderControl);
			list.add(DAC2EncoderControl);
			list.add(DVOOutputControl);
			list.add(CV1OutputControl);
			list.add(GetConditionalGoldenSetting);
			list.add(SMC_Init);
			list.add(PatchMCSetting);
			list.add(MC_SEQ_Control);
			list.add(Gfx_Harvesting);
			list.add(EnableScaler);
			list.add(BlankCRTC);
			list.add(EnableCRTC);
			list.add(GetPixelClock);
			list.add(EnableVGA_Render);
			list.add(GetSCLKOverMCLKRatio);
			list.add(SetCRTC_Timing);
			list.add(SetCRTC_OverScan);
			list.add(SetCRTC_Replication);
			list.add(SelectCRTC_Source);
			list.add(EnableGraphSurfaces);
			list.add(UpdateCRTC_DoubleBufferRegisters);
			list.add(LUT_AutoFill);
			list.add(EnableHW_IconCursor);
			list.add(GetMemoryClock);
			list.add(GetEngineClock);
			list.add(SetCRTC_UsingDTDTiming);
			list.add(ExternalEncoderControl);
			list.add(LVTMAOutputControl);
			list.add(VRAM_BlockDetectionByStrap);
			list.add(MemoryCleanUp);
			list.add(ProcessI2cChannelTransaction);
			list.add(WriteOneByteToHWAssistedI2C);
			list.add(ReadHWAssistedI2CStatus);
			list.add(SpeedFanControl);
			list.add(PowerConnectorDetection);
			list.add(MC_Synchronization);
			list.add(ComputeMemoryEnginePLL);
			list.add(MemoryRefreshConversion);
			list.add(VRAM_GetCurrentInfoBlock);
			list.add(DynamicMemorySettings);
			list.add(MemoryTraining);
			list.add(EnableSpreadSpectrumOnPPLL);
			list.add(TMDSAOutputControl);
			list.add(SetVoltage);
			list.add(DAC1OutputControl);
			list.add(ReadEfuseValue);
			list.add(ComputeMemoryClockParam);
			list.add(ClockSource);
			list.add(MemoryDeviceInit);
			list.add(GetDispObjectInfo);
			list.add(DIG1EncoderControl);
			list.add(DIG2EncoderControl);
			list.add(DIG1TransmitterControl);
			list.add(DIG2TransmitterControl);
			list.add(ProcessAuxChannelTransaction);
			list.add(DPEncoderService);
			list.add(GetVoltageInfo);

			return list;
		}
		@Override
		public void fillSubListDescriptions() {
			ASIC_Init.setName("ASIC_Init");
					GetDisplaySurfaceSize.setName("GetDisplaySurfaceSize");
					ASIC_RegistersInit.setName("ASIC_RegistersInit");
					VRAM_BlockVenderDetection.setName("VRAM_BlockVenderDetection");
					DIGxEncoderControl.setName("DIGxEncoderControl");
					MemoryControllerInit.setName("MemoryControllerInit");
					EnableCRTCMemReq.setName("EnableCRTCMemReq");
					MemoryParamAdjust.setName("MemoryParamAdjust");
					DVOEncoderControl.setName("DVOEncoderControl");
					GPIOPinControl.setName("GPIOPinControl");
					SetEngineClock.setName("SetEngineClock");
					SetMemoryClock.setName("SetMemoryClock");
					SetPixelClock.setName("SetPixelClock");
					EnableDispPowerGating.setName("EnableDispPowerGating");
					ResetMemoryDLL.setName("ResetMemoryDLL");
					ResetMemoryDevice.setName("ResetMemoryDevice");
					MemoryPLLInit.setName("MemoryPLLInit");
					AdjustDisplayPll.setName("AdjustDisplayPll");
					AdjustMemoryController.setName("AdjustMemoryController");
					EnableASIC_StaticPwrMgt.setName("EnableASIC_StaticPwrMgt");
					SetUniphyInstance.setName("SetUniphyInstance");
					DAC_LoadDetection.setName("DAC_LoadDetection");
					LVTMAEncoderControl.setName("LVTMAEncoderControl");
					HW_Misc_Operation.setName("HW_Misc_Operation");
					DAC1EncoderControl.setName("DAC1EncoderControl");
					DAC2EncoderControl.setName("DAC2EncoderControl");
					DVOOutputControl.setName("DVOOutputControl");
					CV1OutputControl.setName("CV1OutputControl");
					GetConditionalGoldenSetting.setName("GetConditionalGoldenSetting");
					SMC_Init.setName("SMC_Init");
					PatchMCSetting.setName("PatchMCSetting");
					MC_SEQ_Control.setName("MC_SEQ_Control");
					Gfx_Harvesting.setName("Gfx_Harvesting");
					EnableScaler.setName("EnableScaler");
					BlankCRTC.setName("BlankCRTC");
					EnableCRTC.setName("EnableCRTC");
					GetPixelClock.setName("GetPixelClock");
					EnableVGA_Render.setName("EnableVGA_Render");
					GetSCLKOverMCLKRatio.setName("GetSCLKOverMCLKRatio");
					SetCRTC_Timing.setName("SetCRTC_Timing");
					SetCRTC_OverScan.setName("SetCRTC_OverScan");
					SetCRTC_Replication.setName("SetCRTC_Replication");
					SelectCRTC_Source.setName("SelectCRTC_Source");
					EnableGraphSurfaces.setName("EnableGraphSurfaces");
					UpdateCRTC_DoubleBufferRegisters.setName("UpdateCRTC_DoubleBufferRegisters");
					LUT_AutoFill.setName("LUT_AutoFill");
					EnableHW_IconCursor.setName("EnableHW_IconCursor");
					GetMemoryClock.setName("GetMemoryClock");
					GetEngineClock.setName("GetEngineClock");
					SetCRTC_UsingDTDTiming.setName("SetCRTC_UsingDTDTiming");
					ExternalEncoderControl.setName("ExternalEncoderControl");
					LVTMAOutputControl.setName("LVTMAOutputControl");
					VRAM_BlockDetectionByStrap.setName("VRAM_BlockDetectionByStrap");
					MemoryCleanUp.setName("MemoryCleanUp");
					ProcessI2cChannelTransaction.setName("ProcessI2cChannelTransaction");
					WriteOneByteToHWAssistedI2C.setName("WriteOneByteToHWAssistedI2C");
					ReadHWAssistedI2CStatus.setName("ReadHWAssistedI2CStatus");
					SpeedFanControl.setName("SpeedFanControl");
					PowerConnectorDetection.setName("PowerConnectorDetection");
					MC_Synchronization.setName("MC_Synchronization");
					ComputeMemoryEnginePLL.setName("ComputeMemoryEnginePLL");
					MemoryRefreshConversion.setName("MemoryRefreshConversion");
					VRAM_GetCurrentInfoBlock.setName("VRAM_GetCurrentInfoBlock");
					DynamicMemorySettings.setName("DynamicMemorySettings");
					MemoryTraining.setName("MemoryTraining");
					EnableSpreadSpectrumOnPPLL.setName("EnableSpreadSpectrumOnPPLL");
					TMDSAOutputControl.setName("TMDSAOutputControl");
					SetVoltage.setName("SetVoltage");
					DAC1OutputControl.setName("DAC1OutputControl");
					ReadEfuseValue.setName("ReadEfuseValue");
					ComputeMemoryClockParam.setName("ComputeMemoryClockParam");
					ClockSource.setName("ClockSource");
					MemoryDeviceInit.setName("MemoryDeviceInit");
					GetDispObjectInfo.setName("GetDispObjectInfo");
					DIG1EncoderControl.setName("DIG1EncoderControl");
					DIG2EncoderControl.setName("DIG2EncoderControl");
					DIG1TransmitterControl.setName("DIG1TransmitterControl");
					DIG2TransmitterControl.setName("DIG2TransmitterControl");
					ProcessAuxChannelTransaction.setName("ProcessAuxChannelTransaction");
					DPEncoderService.setName("DPEncoderService");
					GetVoltageInfo.setName("GetVoltageInfo");

			ASIC_Init.setDescription("Function Table, used by various SW components,latest version 1.1");
					GetDisplaySurfaceSize.setDescription("Atomic Table, Used by Bios when enabling HW ICON");
					ASIC_RegistersInit.setDescription("Atomic Table, indirectly used by various SW components,called from ASIC_Init");
					VRAM_BlockVenderDetection.setDescription("Atomic Table, used only by Bios");
					DIGxEncoderControl.setDescription("Only used by Bios");
					MemoryControllerInit.setDescription("Atomic Table, indirectly used by various SW components,called from ASIC_Init");
					EnableCRTCMemReq.setDescription("Function Table,directly used by various SW components,latest version 2.1");
					MemoryParamAdjust.setDescription("Atomic Table, indirectly used by various SW components,called from SetMemoryClock if needed");
					DVOEncoderControl.setDescription("Function Table,directly used by various SW components,latest version 1.2");
					GPIOPinControl.setDescription("Atomic Table, only used by Bios");
					SetEngineClock.setDescription("Function Table,directly used by various SW components,latest version 1.1");
					SetMemoryClock.setDescription("Function Table,directly used by various SW components,latest version 1.1");
					SetPixelClock.setDescription("Function Table,directly used by various SW components,latest version 1.2");
					EnableDispPowerGating.setDescription("Atomic Table, indirectly used by various SW components,called from ASIC_Init");
					ResetMemoryDLL.setDescription("Atomic Table, indirectly used by various SW components,called from SetMemoryClock");
					ResetMemoryDevice.setDescription("Atomic Table, indirectly used by various SW components,called from SetMemoryClock");
					MemoryPLLInit.setDescription("Atomic Table, used only by Bios");
					AdjustDisplayPll.setDescription("Atomic Table, used by various SW componentes.");
					AdjustMemoryController.setDescription("Atomic Table, indirectly used by various SW components,called from SetMemoryClock");
					EnableASIC_StaticPwrMgt.setDescription("Atomic Table, only used by Bios");
					SetUniphyInstance.setDescription("Atomic Table, only used by Bios");
					DAC_LoadDetection.setDescription("Atomic Table, directly used by various SW components,latest version 1.2");
					LVTMAEncoderControl.setDescription("Atomic Table,directly used by various SW components,latest version 1.3");
					HW_Misc_Operation.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					DAC1EncoderControl.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					DAC2EncoderControl.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					DVOOutputControl.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					CV1OutputControl.setDescription("Atomic Table, Atomic Table, Obsolete from Ry6xx, use DAC2 Output instead");
					GetConditionalGoldenSetting.setDescription("Only used by Bios");
					SMC_Init.setDescription("Function Table,directly used by various SW components,latest version 1.1");
					PatchMCSetting.setDescription("only used by BIOS");
					MC_SEQ_Control.setDescription("only used by BIOS");
					Gfx_Harvesting.setDescription("Atomic Table, Obsolete from Ry6xx, Now only used by BIOS for GFX harvesting");
					EnableScaler.setDescription("Atomic Table, used only by Bios");
					BlankCRTC.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					EnableCRTC.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					GetPixelClock.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					EnableVGA_Render.setDescription("Function Table,directly used by various SW components,latest version 1.1");
					GetSCLKOverMCLKRatio.setDescription("Atomic Table, only used by Bios");
					SetCRTC_Timing.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					SetCRTC_OverScan.setDescription("Atomic Table, used by various SW components,latest version 1.1");
					SetCRTC_Replication.setDescription("Atomic Table, used only by Bios");
					SelectCRTC_Source.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					EnableGraphSurfaces.setDescription("Atomic Table, used only by Bios");
					UpdateCRTC_DoubleBufferRegisters.setDescription("Atomic Table, used only by Bios");
					LUT_AutoFill.setDescription("Atomic Table, only used by Bios");
					EnableHW_IconCursor.setDescription("Atomic Table, only used by Bios");
					GetMemoryClock.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					GetEngineClock.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					SetCRTC_UsingDTDTiming.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					ExternalEncoderControl.setDescription("Atomic Table, directly used by various SW components,latest version 2.1");
					LVTMAOutputControl.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					VRAM_BlockDetectionByStrap.setDescription("Atomic Table, used only by Bios");
					MemoryCleanUp.setDescription("Atomic Table, only used by Bios");
					ProcessI2cChannelTransaction.setDescription("Function Table,only used by Bios");
					WriteOneByteToHWAssistedI2C.setDescription("Function Table,indirectly used by various SW components");
					ReadHWAssistedI2CStatus.setDescription("Atomic Table, indirectly used by various SW components");
					SpeedFanControl.setDescription("Function Table,indirectly used by various SW components,called from ASIC_Init");
					PowerConnectorDetection.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					MC_Synchronization.setDescription("Atomic Table, indirectly used by various SW components,called from SetMemoryClock");
					ComputeMemoryEnginePLL.setDescription("Atomic Table, indirectly used by various SW components,called from SetMemory");
					MemoryRefreshConversion.setDescription("Atomic Table, indirectly used by various SW components,called from SetMemory or SetEngineClock");
					VRAM_GetCurrentInfoBlock.setDescription("Atomic Table, used only by Bios");
					DynamicMemorySettings.setDescription("Atomic Table, indirectly used by various SW components,called from SetMemoryClock");
					MemoryTraining.setDescription("Atomic Table, used only by Bios");
					EnableSpreadSpectrumOnPPLL.setDescription("Atomic Table, directly used by various SW components,latest version 1.2");
					TMDSAOutputControl.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					SetVoltage.setDescription("Function Table,directly and");
					DAC1OutputControl.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					ReadEfuseValue.setDescription("Atomic Table, directly used by various SW components,latest version 1.1");
					ComputeMemoryClockParam.setDescription("Function Table,only used by Bios, obsolete soon.Switch to use 'ReadEDIDFromHWAssistedI2C'");
					ClockSource.setDescription("Atomic Table, indirectly used by various SW components,called from ASIC_Init");
					MemoryDeviceInit.setDescription("Atomic Table, indirectly used by various SW components,called from SetMemoryClock");
					GetDispObjectInfo.setDescription("Atomic Table, indirectly used by various SW components,called from EnableVGARender");
					DIG1EncoderControl.setDescription("Atomic Table,directly used by various SW components,latest version 1.1");
					DIG2EncoderControl.setDescription("Atomic Table,directly used by various SW components,latest version 1.1");
					DIG1TransmitterControl.setDescription("Atomic Table,directly used by various SW components,latest version 1.1");
					DIG2TransmitterControl.setDescription("Atomic Table,directly used by various SW components,latest version 1.1");
					ProcessAuxChannelTransaction.setDescription("Function Table,only used by Bios");
					DPEncoderService.setDescription("Function Table,only used by Bios");
					GetVoltageInfo.setDescription("Function Table,only used by Bios since SI");

			super.fillSubListDescriptions();
		}
	 
}
