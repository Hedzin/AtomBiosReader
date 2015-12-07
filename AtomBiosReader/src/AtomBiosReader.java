import java.awt.Window.Type;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.codec.binary.Hex;

public class AtomBiosReader {
	
	static String[] index_command_table = {
		    "ASIC_Init", "GetDisplaySurfaceSize", "ASIC_RegistersInit",
		    "VRAM_BlockVenderDetection", "SetClocksRatio/DIGxEncoderControl", "MemoryControllerInit",
		    "EnableCRTCMemReq", "MemoryParamAdjust", "DVOEncoderControl",
		    "GPIOPinControl", "SetEngineClock", "SetMemoryClock",
		    "SetPixelClock", "DynamicClockGating", "ResetMemoryDLL",
		    "ResetMemoryDevice", "MemoryPLLInit", "AdjustDisplayPll",
		    "AdjustMemoryController", "EnableASIC_StaticPwrMgt", "ASIC_StaticPwrMgtStatusChange/SetUniphyInstance",
		    "DAC_LoadDetection", "LVTMAEncoderControl", "LCD1OutputControl",
		    "DAC1EncoderControl", "DAC2EncoderControl", "DVOOutputControl",
		    "CV1OutputControl", "GetConditionalGoldenSetting/SetCRTC_DPM_State", "TVEncoderControl",
		    "TMDSAEncoderControl", "LVDSEncoderControl", "TV1OutputControl",
		    "EnableScaler", "BlankCRTC", "EnableCRTC",
		    "GetPixelClock", "EnableVGA_Render", "EnableVGA_Access/GetSCLKOverMCLKRatio",
		    "SetCRTC_Timing", "SetCRTC_OverScan", "SetCRTC_Replication",
		    "SelectCRTC_Source", "EnableGraphSurfaces", "UpdateCRTC_DoubleBufferRegisters",
		    "LUT_AutoFill", "EnableHW_IconCursor", "GetMemoryClock",
		    "GetEngineClock", "SetCRTC_UsingDTDTiming", "ExternalEncoderControl",
		    "LVTMAOutputControl", "VRAM_BlockDetectionByStrap", "MemoryCleanUp",
		    "ReadEDIDFromHWAssistedI2C/ProcessI2cChannelTransaction",
		    "WriteOneByteToHWAssistedI2C", "ReadHWAssistedI2CStatus/HPDInterruptService",
		    "SpeedFanControl", "PowerConnectorDetection", "MC_Synchronization",
		    "ComputeMemoryEnginePLL", "MemoryRefreshConversion", "VRAM_GetCurrentInfoBlock",
		    "DynamicMemorySettings", "MemoryTraining", "EnableSpreadSpectrumOnPPLL",
		    "TMDSAOutputControl", "SetVoltage", "DAC1OutputControl",
		    "DAC2OutputControl", "SetupHWAssistedI2CStatus", "ClockSource",
		    "MemoryDeviceInit", "EnableYUV", "DIG1EncoderControl",
		    "DIG2EncoderControl", "DIG1TransmitterControl/UNIPHYTransmitterControl",
		    "DIG2TransmitterControl/LVTMATransmitterControl",
		    "ProcessAuxChannelTransaction", "DPEncoderService"
		} ;

		static String[] index_data_table ={
		    "UtilityPipeLine", "MultimediaCapabilityInfo", "MultimediaConfigInfo",
		    "StandardVESA_Timing", "FirmwareInfo", "DAC_Info",
		    "LVDS_Info", "TMDS_Info", "AnalogTV_Info",
		    "SupportedDevicesInfo", "GPIO_I2C_Info", "VRAM_UsageByFirmware",
		    "GPIO_Pin_LUT", "VESA_ToInternalModeLUT", "ComponentVideoInfo",
		    "PowerPlayInfo", "CompassionateData", "SaveRestoreInfo/DispDevicePriorityInfo",
		    "PPLL_SS_Info/SS_Info", "OemInfo", "XTMDS_Info",
		    "MclkSS_Info", "Object_Info/Object_Header", "IndirectIOAccess",
		    "MC_InitParameter/AdjustARB_SEQ", "ASIC_VDDC_Info", "ASIC_InternalSS_Info/ASIC_MVDDC_Info",
		    "TV_VideoMode/DispOutInfo", "VRAM_Info", "MemoryTrainingInfo/ASIC_MVDDQ_Info",
		    "IntegratedSystemInfo", "ASIC_ProfilingInfo/ASIC_VDDCI_Info",
		    "VoltageObjectInfo/VRAM_GPIO_DetectionInfo",
		    "PowerSourceInfo"
		} ;

	
	
	
	
	static String OFFSET_TO_POINTER_TO_ATOM_ROM_HEADER = "0x00000048";
	static String OFFSET_TO_ATOM_ROM_IMAGE_SIZE = "0x00000002";
	public static void main(String[] args) {
		int            c;
		int            opt_off = 0;
		String    opt_addrformat = "%04x: ";
		int            fdmem;
		byte[] data = null;
		BiosTables 		tabs;
		int            off, start, len, last;
		int opterr = 0;
		Path path = FileSystems.getDefault().getPath("D:", "Tonga.rom");
		try {
			data = Files.readAllBytes(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tabs = get_pointers(data);
		//do_info(tabs);
		//do_list(tabs);
		newtest(tabs.base);
	}
	private static void newtest(byte[] base) {
		String offset = "0xb6ea";
		String lenght = "0x40";
		int offsetI = Integer.decode(offset);
		int lenghtI = Integer.decode(lenght);
		System.out.println("off:'"+offsetI+"' len:'"+lenghtI+"'");
		ByteBuffer bb = ByteBuffer.wrap(base);
		BinaryDataBlock voltageObjectInfoBB = new BinaryDataBlock();
		BinaryDataBlock voltageObjectInfoHeaderBB = new BinaryDataBlock();
		bb.position(offsetI);
		ByteBuffer vBB = bb.slice();
		ByteBuffer vhBB = vBB.duplicate();
		vhBB.limit(4);
		
		voltageObjectInfoHeaderBB.setBody(vhBB);
		voltageObjectInfoHeaderBB.setLength(4);
		voltageObjectInfoHeaderBB.setOffset(0);
		voltageObjectInfoHeaderBB.setName("VoltageObjectInfoHeader");
		ATOM_COMMON_TABLE_HEADER  voltageTableHeader = new ATOM_COMMON_TABLE_HEADER(voltageObjectInfoHeaderBB);
		
		
		vBB.limit(lenghtI);
		byte[] array =  new byte[64];
		vBB.get(array);
		System.out.println(Hex.encodeHexString(array));
		
		
		voltageObjectInfoBB.setBody(vBB);
		voltageObjectInfoBB.setLengthHexString(lenght);
		voltageObjectInfoBB.setOffsetHexString(offset);
		voltageObjectInfoBB.setName("VoltageObjectInfo");
		
		ATOM_VOLTAGE_OBJECT_INFO_V3_1 voltageObjectInfoS = new ATOM_VOLTAGE_OBJECT_INFO_V3_1(voltageObjectInfoBB);
		
	}
	private static int get_table_offset(AtomMasterListOfCommandTables table, int idx)
	{
		int i;
		int last = 0;
		int offset = 0;

		if (table.tableList.size() == 0 || (table.tableList.size()<idx))
		{		
			System.out.println("table.tableList.size():"+table.tableList.size());
			System.err.println("in 0");
			return 0;
		}
		
		//System.out.println("idx:"+idx);
		int off = table.tableList.get(idx)&0xFFFF;
		//System.out.println("off:"+off);
		
/*
		for (i = 0; i <= idx; i++)
		{	
			System.out.println("idx:"+idx);
			int off = table.tableList.get(i)&0xFFFF;
			System.out.println("off:"+off);
			if (off != 0)
			{
				if (off < last)
				{
					offset += 0x10000;
				}
				last = off - 0x8000;
			}
		}
*/
		return off + offset;
	}

	private static void do_list(BiosTables tabs) {
		int i;
		int len;
		String ind;
		System.out.println("Command Tables:");
		for (i = 0; i <= new AtomMasterListOfCommandTables().size; i++) {
			int off = get_table_offset(tabs.masterCommandTables, i);
			if (off != 0){
				 ;
				 System.out.println("  ");
				 System.out.print(Integer.toHexString(i&0xFFFF));
				System.out.print(":   ");
				System.out.print(Integer.toHexString(off));
				System.out.print("  Len " +
				Integer.toHexString(ByteBuffer.wrap(tabs.base).order(ByteOrder.LITTLE_ENDIAN).getShort(off)&0xFFFF));
			}
			else{
				System.out.println("  ");
			 System.out.print(Integer.toHexString(i&0xFFFF));
			System.out.print(":   -             ");
			}
			if ((ind = index_command_table[i])!= null)
			{
				System.out.print("  ("+ind+")");
		}
		}
		
		System.out.println("Data Tables:");
			for (i = 0; i < new AtomMasterListOfDataTables().size; i++)
			{
				//data_dumper_t dt = null;
				String comment = null;
				int off = get_table_offset(tabs.masterDataTables, i);
				if (off != 0)
				{
					ByteBuffer bb = ByteBuffer.wrap(tabs.base);
					//bb.position(off);
					int frev = bb.get(off+2);
					int crev = bb.get(off+3);
					System.out.println("  ");
					 System.out.print(Integer.toHexString(i&0xFFFF));
						System.out.print(":   ");
						System.out.print(Integer.toHexString(off));
						System.out.print("  Len " +
						Integer.toHexString(ByteBuffer.wrap(tabs.base).order(ByteOrder.LITTLE_ENDIAN).getShort(off)&0xFFFF));
					System.out.print("   Rev "+frev+":"+crev+" ");
					//dt = get_data_dumper(i, frev, crev, comment);
				}
				else
				{
					System.out.println("  ");
					 System.out.print(Integer.toHexString(i&0xFFFF));
					System.out.print(":   -             ");
				}
				if ((ind = index_data_table[i])!= null)
				{
					System.out.print("  ("+ind+")");
			}
//				if (dt != null && (len = dt.invoke(null, null, 0)))
//				{
//					fprintf(stdout, "    (struct size %04x)", len);
//				}
			}
			

		
		
		
	}

	private static int get_table_offset(AtomMasterListOfDataTables table, int idx) {
		int off = table.tableList.get(idx)&0xFFFF;
		return off;
	}
	private static void do_info(BiosTables tabs) {
		ByteBuffer bb = ByteBuffer.wrap(tabs.base);
		bb.position(tabs.atomRomHeader.usBIOS_BootupMessageOffset);
		int length =  0;
		while(true){
			byte b = bb.get();
			if (b==0x00)break;
			length++;
		}
		bb.position(tabs.atomRomHeader.usBIOS_BootupMessageOffset);
		byte[] bootline = new byte[length];
		bb.get(bootline, 0, length);
		
		tabs.atomRomHeader.print();
		System.out.println("Table Format Rev.   "+Hex.encodeHexString(new byte[]{tabs.atomRomHeader.sHeader.ucTableFormatRevision}));
		System.out.println("Table Content Rev.  "+Hex.encodeHexString(new byte[]{tabs.atomRomHeader.sHeader.ucTableContentRevision}));
		System.out.println("BIOS Boot Message:  '"+new String(bootline)+"'");
		System.out.println("Subsystem Vendor ID "+Integer.toHexString(tabs.atomRomHeader.usSubsystemVendorID&0xFFFF));
		System.out.println("Subsystem ID        "+Integer.toHexString(tabs.atomRomHeader.usSubsystemID&0xFFFF));



		
	}

	static BiosTables get_pointers(byte[] data)
	{
		BiosTables tabs =  new BiosTables();		

		tabs.base = data;
		short headerPointerOffset = Short.decode(OFFSET_TO_POINTER_TO_ATOM_ROM_HEADER);
		ByteBuffer headerPointer = ByteBuffer.wrap(data,headerPointerOffset,2);
		short headerOffset = headerPointer.order(ByteOrder.LITTLE_ENDIAN).getShort();
		tabs.atomRomHeader = new AtomRomHeader(data, headerOffset);
		
		
		if (! new String(tabs.atomRomHeader.uaFirmWareSignature).equals("ATOM")) {
			System.err.println("No AtomBIOS\n");
			System.exit(0);
		}
		System.out.println("tabs.atomRomHeader.usMasterCommandTableOffset:"+(int)((tabs.atomRomHeader.usMasterCommandTableOffset)&0xFFFF));
		AtomMasterCommandTable amct = new AtomMasterCommandTable(data, tabs.atomRomHeader.usMasterCommandTableOffset);
		AtomMasterDataTable amdt = new AtomMasterDataTable(data, tabs.atomRomHeader.usMasterDataTableOffset);
		
		tabs.masterCommandTables = amct.listOfCommandTables;
		tabs.masterDataTables = amdt.listOfDataTables;

		return tabs;
	}
	

}
