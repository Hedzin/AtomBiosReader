package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_POWERTUNE_TABLE_V2 extends AContainer {
	
	ByteStructure  ucRevId = new ByteStructure();
	ShortStructure usTDP = new ShortStructure();
	ShortStructure usConfigurableTDP = new ShortStructure();
	ShortStructure usTDC = new ShortStructure();
	ShortStructure usBatteryPowerLimit = new ShortStructure();
	ShortStructure usSmallPowerLimit = new ShortStructure();
	ShortStructure usLowCACLeakage = new ShortStructure();
	ShortStructure usHighCACLeakage = new ShortStructure();
	ShortStructure usMaximumPowerDeliveryLimit = new ShortStructure();
	ShortStructure usTjMax = new ShortStructure();
	ShortStructure usPowerTuneDataSetID = new ShortStructure();
	ShortStructure usEDCLimit = new ShortStructure();
	ShortStructure usSoftwareShutdownTemp = new ShortStructure();
	ShortStructure usClockStretchAmount = new ShortStructure();
	ShortStructure usReserve1 = new ShortStructure();
	ShortStructure usReserve2 = new ShortStructure();
	


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucRevId);
		list.add(usTDP);
		list.add(usConfigurableTDP);
		list.add(usTDC);
		list.add(usBatteryPowerLimit);
		list.add(usSmallPowerLimit);
		list.add(usLowCACLeakage);
		list.add(usHighCACLeakage);
		list.add(usMaximumPowerDeliveryLimit);
		list.add(usTjMax);
		list.add(usPowerTuneDataSetID);
		list.add(usEDCLimit);
		list.add(usSoftwareShutdownTemp);
		list.add(usClockStretchAmount);
		list.add(usReserve1);
		list.add(usReserve2);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucRevId.setName("ucRevId");
		usTDP.setName("usTDP");
		usConfigurableTDP.setName("usConfigurableTDP");
		usTDC.setName("usTDC");
		usBatteryPowerLimit.setName("usBatteryPowerLimit");
		usSmallPowerLimit.setName("usSmallPowerLimit");
		usLowCACLeakage.setName("usLowCACLeakage");
		usHighCACLeakage.setName("usHighCACLeakage");
		usMaximumPowerDeliveryLimit.setName("usMaximumPowerDeliveryLimit");
		usTjMax.setName("usTjMax");
		usPowerTuneDataSetID.setName("usPowerTuneDataSetID");
		usEDCLimit.setName("usEDCLimit");
		usSoftwareShutdownTemp.setName("usSoftwareShutdownTemp");
		usClockStretchAmount.setName("usClockStretchAmount");
		usReserve1.setName("usReserve1");
		usReserve2.setName("usReserve2");

		
		super.fillSubListDescriptions();
	}

}
