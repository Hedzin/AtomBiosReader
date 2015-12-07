import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class AtomMasterListOfCommandTables {
	List<Short> tableList =  new ArrayList<Short>();
	public short ASIC_Init; //Function Table, used by various SW components,latest version 1.1
	  public short GetDisplaySurfaceSize; //Atomic Table,  Used by Bios when enabling HW ICON
	  public short ASIC_RegistersInit; //Atomic Table,  indirectly used by various SW components,called from ASIC_Init
	  public short VRAM_BlockVenderDetection; //Atomic Table,  used only by Bios
	  public short DIGxEncoderControl; //Only used by Bios
	  public short MemoryControllerInit; //Atomic Table,  indirectly used by various SW components,called from ASIC_Init
	  public short EnableCRTCMemReq; //Function Table,directly used by various SW components,latest version 2.1
	  public short MemoryParamAdjust; //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock if needed
	  public short DVOEncoderControl; //Function Table,directly used by various SW components,latest version 1.2
	  public short GPIOPinControl; //Atomic Table,  only used by Bios
	  public short SetEngineClock; //Function Table,directly used by various SW components,latest version 1.1
	  public short SetMemoryClock; //Function Table,directly used by various SW components,latest version 1.1
	  public short SetPixelClock; //Function Table,directly used by various SW components,latest version 1.2
	  public short DynamicClockGating; //Atomic Table,  indirectly used by various SW components,called from ASIC_Init
	  public short ResetMemoryDLL; //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	  public short ResetMemoryDevice; //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	  public short MemoryPLLInit;
	  public short AdjustDisplayPll; //only used by Bios
	  public short AdjustMemoryController; //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	  public short EnableASIC_StaticPwrMgt; //Atomic Table,  only used by Bios
	  public short ASIC_StaticPwrMgtStatusChange; //Obsolete ,     only used by Bios
	  public short DAC_LoadDetection; //Atomic Table,  directly used by various SW components,latest version 1.2
	  public short LVTMAEncoderControl; //Atomic Table,directly used by various SW components,latest version 1.3
	  public short LCD1OutputControl; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short DAC1EncoderControl; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short DAC2EncoderControl; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short DVOOutputControl; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short CV1OutputControl; //Atomic Table,  Atomic Table,  Obsolete from Ry6xx, use DAC2 Output instead
	  public short GetConditionalGoldenSetting; //only used by Bios
	  public short TVEncoderControl; //Function Table,directly used by various SW components,latest version 1.1
	  public short TMDSAEncoderControl; //Atomic Table,  directly used by various SW components,latest version 1.3
	  public short LVDSEncoderControl; //Atomic Table,  directly used by various SW components,latest version 1.3
	  public short TV1OutputControl; //Atomic Table,  Obsolete from Ry6xx, use DAC2 Output instead
	  public short EnableScaler; //Atomic Table,  used only by Bios
	  public short BlankCRTC; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short EnableCRTC; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short GetPixelClock; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short EnableVGA_Render; //Function Table,directly used by various SW components,latest version 1.1
	  public short GetSCLKOverMCLKRatio; //Atomic Table,  only used by Bios
	  public short SetCRTC_Timing; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short SetCRTC_OverScan; //Atomic Table,  used by various SW components,latest version 1.1
	  public short SetCRTC_Replication; //Atomic Table,  used only by Bios
	  public short SelectCRTC_Source; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short EnableGraphSurfaces; //Atomic Table,  used only by Bios
	  public short UpdateCRTC_DoubleBufferRegisters;
	  public short LUT_AutoFill; //Atomic Table,  only used by Bios
	  public short EnableHW_IconCursor; //Atomic Table,  only used by Bios
	  public short GetMemoryClock; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short GetEngineClock; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short SetCRTC_UsingDTDTiming; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short ExternalEncoderControl; //Atomic Table,  directly used by various SW components,latest version 2.1
	  public short LVTMAOutputControl; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short VRAM_BlockDetectionByStrap; //Atomic Table,  used only by Bios
	  public short MemoryCleanUp; //Atomic Table,  only used by Bios
	  public short ProcessI2cChannelTransaction; //Function Table,only used by Bios
	  public short WriteOneByteToHWAssistedI2C; //Function Table,indirectly used by various SW components
	  public short ReadHWAssistedI2CStatus; //Atomic Table,  indirectly used by various SW components
	  public short SpeedFanControl; //Function Table,indirectly used by various SW components,called from ASIC_Init
	  public short PowerConnectorDetection; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short MC_Synchronization; //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	  public short ComputeMemoryEnginePLL; //Atomic Table,  indirectly used by various SW components,called from SetMemory/EngineClock
	  public short MemoryRefreshConversion; //Atomic Table,  indirectly used by various SW components,called from SetMemory or SetEngineClock
	  public short VRAM_GetCurrentInfoBlock; //Atomic Table,  used only by Bios
	  public short DynamicMemorySettings; //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	  public short MemoryTraining; //Atomic Table,  used only by Bios
	  public short EnableSpreadSpectrumOnPPLL; //Atomic Table,  directly used by various SW components,latest version 1.2
	  public short TMDSAOutputControl; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short SetVoltage; //Function Table,directly and/or indirectly used by various SW components,latest version 1.1
	  public short DAC1OutputControl; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short DAC2OutputControl; //Atomic Table,  directly used by various SW components,latest version 1.1
	  public short SetupHWAssistedI2CStatus; //Function Table,only used by Bios, obsolete soon.Switch to use "ReadEDIDFromHWAssistedI2C"
	  public short ClockSource; //Atomic Table,  indirectly used by various SW components,called from ASIC_Init
	  public short MemoryDeviceInit; //Atomic Table,  indirectly used by various SW components,called from SetMemoryClock
	  public short EnableYUV; //Atomic Table,  indirectly used by various SW components,called from EnableVGARender
	  public short DIG1EncoderControl; //Atomic Table,directly used by various SW components,latest version 1.1
	  public short DIG2EncoderControl; //Atomic Table,directly used by various SW components,latest version 1.1
	  public short DIG1TransmitterControl; //Atomic Table,directly used by various SW components,latest version 1.1
	  public short DIG2TransmitterControl; //Atomic Table,directly used by various SW components,latest version 1.1
	  public short ProcessAuxChannelTransaction; //Function Table,only used by Bios
	  public short DPEncoderService; //Function Table,only used by Bios
	  final int size = 79;
	  public AtomMasterListOfCommandTables(byte[] data, int position) {
			//System.out.println("pos:"+(int)(position&0xFFFF));
		  ByteBuffer bb = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
			bb.position(position & 0xFFFF);
		  
			tableList.add(ASIC_Init = bb.getShort()); 
			tableList.add(GetDisplaySurfaceSize = bb.getShort());
			tableList.add(ASIC_RegistersInit = bb.getShort()); 
			tableList.add(VRAM_BlockVenderDetection = bb.getShort()); 
			tableList.add(DIGxEncoderControl = bb.getShort());
			tableList.add(MemoryControllerInit = bb.getShort()); 
			tableList.add(EnableCRTCMemReq = bb.getShort()); 
			tableList.add(MemoryParamAdjust = bb.getShort());
			tableList.add(DVOEncoderControl = bb.getShort());
			tableList.add(GPIOPinControl = bb.getShort());
			  tableList.add(SetEngineClock = bb.getShort()); 
			  tableList.add(SetMemoryClock = bb.getShort()); 
			  tableList.add(SetPixelClock = bb.getShort()); 
			  tableList.add( DynamicClockGating = bb.getShort()); 
			  tableList.add(  ResetMemoryDLL = bb.getShort()); 
			  tableList.add(  ResetMemoryDevice = bb.getShort()); 
			  tableList.add(MemoryPLLInit = bb.getShort());
			  tableList.add( AdjustDisplayPll = bb.getShort());
			  tableList.add( AdjustMemoryController = bb.getShort());
			  tableList.add( EnableASIC_StaticPwrMgt = bb.getShort()); 
			  tableList.add( ASIC_StaticPwrMgtStatusChange = bb.getShort());
			  tableList.add(  DAC_LoadDetection = bb.getShort()); 
			  tableList.add(  LVTMAEncoderControl = bb.getShort());
			  tableList.add( LCD1OutputControl = bb.getShort());
			  tableList.add( DAC1EncoderControl = bb.getShort());
			  tableList.add( DAC2EncoderControl = bb.getShort());
			  tableList.add( DVOOutputControl = bb.getShort());
			  tableList.add( CV1OutputControl = bb.getShort()); 
			  tableList.add( GetConditionalGoldenSetting = bb.getShort());
			  tableList.add( TVEncoderControl = bb.getShort()); 
			  tableList.add( TMDSAEncoderControl = bb.getShort()); 
			  tableList.add(  LVDSEncoderControl = bb.getShort());
			  tableList.add(  TV1OutputControl = bb.getShort());
			  tableList.add( EnableScaler = bb.getShort()); 
			  tableList.add( BlankCRTC = bb.getShort());
			  tableList.add( EnableCRTC = bb.getShort());
			  tableList.add( GetPixelClock = bb.getShort());
			  tableList.add(  EnableVGA_Render = bb.getShort());
			  tableList.add( GetSCLKOverMCLKRatio = bb.getShort());
			  tableList.add(  SetCRTC_Timing = bb.getShort()); 
			  tableList.add( SetCRTC_OverScan = bb.getShort());
			  tableList.add( SetCRTC_Replication = bb.getShort());
			  tableList.add( SelectCRTC_Source = bb.getShort());
			  tableList.add( EnableGraphSurfaces = bb.getShort()); 
			  tableList.add( UpdateCRTC_DoubleBufferRegisters = bb.getShort());
			  tableList.add( LUT_AutoFill = bb.getShort());
			  tableList.add(  EnableHW_IconCursor = bb.getShort());
			  tableList.add( GetMemoryClock = bb.getShort());
			  tableList.add( GetEngineClock = bb.getShort()); 
			  tableList.add(  SetCRTC_UsingDTDTiming = bb.getShort());
			  tableList.add( ExternalEncoderControl = bb.getShort()); 
			  tableList.add( LVTMAOutputControl = bb.getShort());
			  tableList.add( VRAM_BlockDetectionByStrap = bb.getShort());
			  tableList.add( MemoryCleanUp = bb.getShort());
			  tableList.add(  ProcessI2cChannelTransaction = bb.getShort());
			  tableList.add(  WriteOneByteToHWAssistedI2C = bb.getShort()); 
			  tableList.add(  ReadHWAssistedI2CStatus = bb.getShort());
			  tableList.add( SpeedFanControl = bb.getShort());
			  tableList.add(  PowerConnectorDetection = bb.getShort());
			  tableList.add(  MC_Synchronization = bb.getShort()); 
			  tableList.add(  ComputeMemoryEnginePLL = bb.getShort());
			  tableList.add(  MemoryRefreshConversion = bb.getShort());
			  tableList.add( VRAM_GetCurrentInfoBlock = bb.getShort());
			  tableList.add( DynamicMemorySettings = bb.getShort());
			  tableList.add(  MemoryTraining = bb.getShort());
			  tableList.add(  EnableSpreadSpectrumOnPPLL = bb.getShort());
			  tableList.add(  TMDSAOutputControl = bb.getShort()); 
			  tableList.add(  SetVoltage = bb.getShort()); 
			  tableList.add(  DAC1OutputControl = bb.getShort()); 
			  tableList.add(  DAC2OutputControl = bb.getShort()); 
			  tableList.add(  SetupHWAssistedI2CStatus = bb.getShort()); 
			  tableList.add(  ClockSource = bb.getShort()); 
			  tableList.add(  MemoryDeviceInit = bb.getShort()); 
			  tableList.add( EnableYUV = bb.getShort());
			  tableList.add( DIG1EncoderControl = bb.getShort()); 
			  tableList.add(  DIG2EncoderControl = bb.getShort());
			  tableList.add( DIG1TransmitterControl = bb.getShort()); 
			  tableList.add( DIG2TransmitterControl = bb.getShort());
			  tableList.add( ProcessAuxChannelTransaction = bb.getShort());
			  tableList.add(DPEncoderService = bb.getShort());
	}
	public AtomMasterListOfCommandTables() {
		// TODO Auto-generated constructor stub
	}
}
