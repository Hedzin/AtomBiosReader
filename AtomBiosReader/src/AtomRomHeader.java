import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.apache.commons.codec.binary.Hex;

public class AtomRomHeader {

	public AtomCommonTableHeader sHeader = new AtomCommonTableHeader();
	  public byte[] uaFirmWareSignature = new byte[4];    /*Signature to distinguish between Atombios and non-atombios, 
	                                      atombios should init it as "ATOM", don't change the position */
	  short usBiosRuntimeSegmentAddress;
	  short usProtectedModeInfoOffset;
	  short usConfigFilenameOffset;
	  short usCRC_BlockOffset;
	  short usBIOS_BootupMessageOffset;
	  short usInt10Offset;
	  short usPciBusDevInitCode;
	  short usIoBaseAddress;
	  short usSubsystemVendorID;
	  short usSubsystemID;
	  short usPCI_InfoOffset; 
	  short usMasterCommandTableOffset; /*Offset for SW to get all command table offsets, Don't change the position */
	  short usMasterDataTableOffset;   /*Offset for SW to get all data table offsets, Don't change the position */
	  byte  ucExtendedFunctionCode;
	  byte  ucReserved;
	  int size = 32+sHeader.size;
	  public AtomRomHeader(byte[] data, short headerOffset) {
		  sHeader = new AtomCommonTableHeader(data,headerOffset);
		  ByteBuffer bb = ByteBuffer.wrap(data);
		  bb.position(headerOffset+4);
		  bb.get(uaFirmWareSignature,0,4);
		  bb.order(ByteOrder.LITTLE_ENDIAN);
		  usBiosRuntimeSegmentAddress = bb.getShort();
		   usProtectedModeInfoOffset = bb.getShort();
		   usConfigFilenameOffset = bb.getShort();
		   usCRC_BlockOffset = bb.getShort();
		   usBIOS_BootupMessageOffset = bb.getShort();
		   usInt10Offset = bb.getShort();
		   usPciBusDevInitCode = bb.getShort();
		   usIoBaseAddress = bb.getShort();
		   usSubsystemVendorID = bb.getShort();
		   usSubsystemID = bb.getShort();
		   usPCI_InfoOffset = bb.getShort(); 
		   usMasterCommandTableOffset = bb.getShort();
		   usMasterDataTableOffset = bb.getShort();
		   ucExtendedFunctionCode  = bb.get();
		   ucReserved  = bb.get();
	}
	public void print() {
		  System.out.println("usBiosRuntimeSegmentAddress: "+(usBiosRuntimeSegmentAddress&0xFFFF));
		  System.out.println("usProtectedModeInfoOffset: "+(usProtectedModeInfoOffset&0xFFFF));
		  System.out.println("usConfigFilenameOffset: "+(usConfigFilenameOffset&0xFFFF));
		  System.out.println("usCRC_BlockOffset: "+(usCRC_BlockOffset&0xFFFF));
		  System.out.println("usBIOS_BootupMessageOffset: "+(usBIOS_BootupMessageOffset&0xFFFF));
		  System.out.println("usInt10Offset: "+(usInt10Offset&0xFFFF));
		  System.out.println("usPciBusDevInitCode: "+( usPciBusDevInitCode&0xFFFF));
		  System.out.println("usIoBaseAddress: "+( usIoBaseAddress&0xFFFF));
		  System.out.println("usSubsystemVendorID: "+(usSubsystemVendorID&0xFFFF));
		  System.out.println("usSubsystemID: "+(usSubsystemID&0xFFFF));
		  System.out.println("usPCI_InfoOffset: "+(usPCI_InfoOffset&0xFFFF));
		  System.out.println("usMasterCommandTableOffset: "+(  usMasterCommandTableOffset&0xFFFF));
		  System.out.println("usMasterDataTableOffset: "+(  usMasterDataTableOffset&0xFFFF));
		  System.out.println("ucExtendedFunctionCode: "+  Hex.encodeHexString(new byte[]{ucExtendedFunctionCode}));
		  System.out.println("ucReserved: "+  Hex.encodeHexString(new byte[]{ucReserved}));
	} 
}
