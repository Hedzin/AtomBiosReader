package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_ROM_HEADER extends AContainer implements IContainer,IAtomTable {
	{
	name = "ATOM_ROM_HEADER";
	description = "ROM header";
	}
	ATOM_COMMON_TABLE_HEADER sHeader = new ATOM_COMMON_TABLE_HEADER();
	// Signature to distinguish between Atombios and non-atombios,
	// atombios should init it as "ATOM", don't change the position
	StringStructure uaFirmWareSignature = new StringStructure(4);
	ShortStructure usBiosRuntimeSegmentAddress = new ShortStructure();
	ShortStructure usProtectedModeInfoOffset = new ShortStructure();
	ShortStructure usConfigFilenameOffset = new ShortStructure();
	ShortStructure usCRC_BlockOffset = new ShortStructure();
	ShortStructure usBIOS_BootupMessageOffset = new ShortStructure();
	ShortStructure usInt10Offset = new ShortStructure();
	ShortStructure usPciBusDevInitCode = new ShortStructure();
	ShortStructure usIoBaseAddress = new ShortStructure();
	ShortStructure usSubsystemVendorID = new ShortStructure();
	ShortStructure usSubsystemID = new ShortStructure();
	ShortStructure usPCI_InfoOffset = new ShortStructure();
	ShortStructure usMasterCommandTableOffset = new ShortStructure();
	// Offset for SW to get all command table offsets, Don't change the position
	ShortStructure usMasterDataTableOffset = new ShortStructure();
	// Offset for SW to get all data table offsets, Don't change the position
	ByteStructure ucExtendedFunctionCode = new ByteStructure();
	ByteStructure ucReserved = new ByteStructure();
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(sHeader);
		list.add(uaFirmWareSignature);
		list.add(usBiosRuntimeSegmentAddress);
		list.add(usProtectedModeInfoOffset);
		list.add(usConfigFilenameOffset);
		list.add(usCRC_BlockOffset);
		list.add(usBIOS_BootupMessageOffset);
		list.add(usInt10Offset);
		list.add(usPciBusDevInitCode);
		list.add(usIoBaseAddress);
		list.add(usSubsystemVendorID);
		list.add(usSubsystemID);
		list.add(usPCI_InfoOffset);
		list.add(usMasterCommandTableOffset);
		list.add(usMasterDataTableOffset);
		list.add(ucExtendedFunctionCode);
		list.add(ucReserved);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		sHeader.setName("CommonTableHeader");
		uaFirmWareSignature.setName("FirmWareSignature");
		uaFirmWareSignature.setDescription("Signature to distinguish between Atombios and non-atombios,");
		uaFirmWareSignature.setDescription("atombios should init it as 'ATOM', don't change the position");
		usBiosRuntimeSegmentAddress.setName("BiosRuntimeSegmentAddress");
		usProtectedModeInfoOffset.setName("ProtectedModeInfoOffset");
		usConfigFilenameOffset.setName("ConfigFilenameOffset");
		usCRC_BlockOffset.setName("CRC_BlockOffset");
		usBIOS_BootupMessageOffset.setName("BIOS_BootupMessageOffset");
		usInt10Offset.setName("Int10Offset");
		usPciBusDevInitCode.setName("PciBusDevInitCode");
		usIoBaseAddress.setName("IoBaseAddress");
		usSubsystemVendorID.setName("SubsystemVendorID");
		usSubsystemID.setName("SubsystemID");
		usPCI_InfoOffset.setName("PCI_InfoOffset");
		usMasterCommandTableOffset.setName("MasterCommandTableOffset");
		usMasterCommandTableOffset.setDescription("Offset for SW to get all command table offsets, Don't change the position");
		usMasterDataTableOffset.setName("MasterDataTableOffset");
		usMasterDataTableOffset.setDescription("Offset for SW to get all data table offsets, Don't change the position");
		ucExtendedFunctionCode.setName("ExtendedFunctionCode");
		ucReserved.setName("Reserved");
		super.fillSubListDescriptions();
	}

}
