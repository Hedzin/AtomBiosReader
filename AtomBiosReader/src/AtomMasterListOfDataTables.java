import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class AtomMasterListOfDataTables {
	
	List<Short> tableList =  new ArrayList<Short>();
	public short UtilityPipeLine; // Offest for the utility to get parser info,Don't change this position!
	  public short MultimediaCapabilityInfo; // Only used by MM Lib,latest version 1.1, not configuable from Bios, need to include the table to build Bios
	  public short MultimediaConfigInfo; // Only used by MM Lib,latest version 2.1, not configuable from Bios, need to include the table to build Bios
	  public short StandardVESA_Timing; // Only used by Bios
	  public short FirmwareInfo; // Shared by various SW components,latest version 1.4
	  public short DAC_Info; // Will be obsolete from R600
	  public short LCD_Info; // Shared by various SW components,latest version 1.3, was called LVDS_Info
	  public short TMDS_Info; // Will be obsolete from R600
	  public short AnalogTV_Info; // Shared by various SW components,latest version 1.1
	  public short SupportedDevicesInfo; // Will be obsolete from R600
	  public short GPIO_I2C_Info; // Shared by various SW components,latest version 1.2 will be used from R600
	  public short VRAM_UsageByFirmware; // Shared by various SW components,latest version 1.3 will be used from R600
	  public short GPIO_Pin_LUT; // Shared by various SW components,latest version 1.1
	  public short VESA_ToInternalModeLUT; // Only used by Bios
	  public short ComponentVideoInfo; // Shared by various SW components,latest version 2.1 will be used from R600
	  public short PowerPlayInfo; // Shared by various SW components,latest version 2.1,new design from R600
	  public short CompassionateData; // Will be obsolete from R600
	  public short SaveRestoreInfo; // Only used by Bios
	  public short PPLL_SS_Info; // Shared by various SW components,latest version 1.2, used to call SS_Info, change to new name because of int ASIC SS info
	  public short OemInfo; // Defined and used by external SW, should be obsolete soon
	  public short XTMDS_Info; // Will be obsolete from R600
	  public short MclkSS_Info; // Shared by various SW components,latest version 1.1, only enabled when ext SS chip is used
	  public short Object_Header; // Shared by various SW components,latest version 1.1
	  public short IndirectIOAccess; // Only used by Bios,this table position can't change at all!!
	  public short MC_InitParameter; // Only used by command table
	  public short ASIC_VDDC_Info; // Will be obsolete from R600
	  public short ASIC_InternalSS_Info; // New tabel name from R600, used to be called "ASIC_MVDDC_Info"
	  public short TV_VideoMode; // Only used by command table
	  public short VRAM_Info; // Only used by command table, latest version 1.3
	  public short MemoryTrainingInfo; // Used for VBIOS and Diag utility for memory training purpose since R600. the new table rev start from 2.1
	  public short IntegratedSystemInfo; // Shared by various SW components
	  public short ASIC_ProfilingInfo; // New table name from R600, used to be called "ASIC_VDDCI_Info" for pre-R600
	  public short VoltageObjectInfo; // Shared by various SW components, latest version 1.1
	public short PowerSourceInfo; // Shared by various SW components, latest versoin 1.1
	int size = 33;
	public AtomMasterListOfDataTables(byte[] data, int pos) {
		ByteBuffer bb = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		bb.position(pos&0xFFFF);
		tableList.add(UtilityPipeLine = bb.getShort()); 
		tableList.add( MultimediaCapabilityInfo = bb.getShort()); 
		tableList.add(  MultimediaConfigInfo = bb.getShort()); 
		tableList.add(  StandardVESA_Timing = bb.getShort());  
		tableList.add(  FirmwareInfo = bb.getShort()); 
		tableList.add(  DAC_Info = bb.getShort());  
		tableList.add(  LCD_Info = bb.getShort()); 
		  tableList.add(  TMDS_Info = bb.getShort()); 
		  tableList.add( AnalogTV_Info = bb.getShort()); 
		  tableList.add(  SupportedDevicesInfo = bb.getShort()); 
		  tableList.add( GPIO_I2C_Info = bb.getShort()); 
		  tableList.add( VRAM_UsageByFirmware = bb.getShort()); 
		  tableList.add( GPIO_Pin_LUT = bb.getShort()); 
		  tableList.add(  VESA_ToInternalModeLUT = bb.getShort()); 
		  tableList.add(  ComponentVideoInfo = bb.getShort()); 
		  tableList.add(  PowerPlayInfo = bb.getShort()); 
		  tableList.add(  CompassionateData = bb.getShort()); 
		  tableList.add(  SaveRestoreInfo = bb.getShort()); 
		  tableList.add(  PPLL_SS_Info = bb.getShort()); 
		  tableList.add( OemInfo = bb.getShort()); 
		  tableList.add( XTMDS_Info = bb.getShort()); 
		  tableList.add( MclkSS_Info = bb.getShort()); 
		  tableList.add( Object_Header = bb.getShort()); 
		  tableList.add(  IndirectIOAccess = bb.getShort()); 
		  tableList.add(  MC_InitParameter = bb.getShort()); 
		  tableList.add(  ASIC_VDDC_Info = bb.getShort()); 
		  tableList.add(  ASIC_InternalSS_Info = bb.getShort()); 
		  tableList.add(  TV_VideoMode = bb.getShort()); 
		  tableList.add(  VRAM_Info = bb.getShort()); 
		  tableList.add(  MemoryTrainingInfo = bb.getShort());  
		  tableList.add( IntegratedSystemInfo = bb.getShort()); 
		  tableList.add(  ASIC_ProfilingInfo = bb.getShort()); 
		  tableList.add( VoltageObjectInfo = bb.getShort()); 
		  tableList.add(	PowerSourceInfo = bb.getShort()); 
			}
	public AtomMasterListOfDataTables() {
		// TODO Auto-generated constructor stub
	}
}
