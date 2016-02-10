package backend;
import java.util.ArrayList;
import java.util.List;

public class ATOM_SVID2_VOLTAGE_OBJECT_V3 extends AContainer {
	   ATOM_VOLTAGE_OBJECT_HEADER_V3 sHeader = new ATOM_VOLTAGE_OBJECT_HEADER_V3();    // voltage mode = VOLTAGE_OBJ_SVID2
	// 14:7  PSI0_VID
	// 5  PSI1
	// 4:2  load line slope trim. 
	// 1:0  offset trim, 
	   ShortStructure   usLoadLine_PSI = new ShortStructure();    
	// GPU GPIO pin Id to SVID2 regulator VRHot pin. possible value 0~31. 0 means GPIO0, 31 means GPIO31
	   ByteStructure    ucSVDGpioId = new ByteStructure();     //0~31 indicate GPIO0~31
	   ByteStructure    ucSVCGpioId = new ByteStructure();     //0~31 indicate GPIO0~31
	   LongStructure    ulReserved = new LongStructure();
	@Override
	public List<IStructure> getSubStructureList() {
		System.out.println("ATOM_SVID2_VOLTAGE_OBJECT_V3 getSubStructureList()");
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(sHeader);
		list.add(usLoadLine_PSI);
		list.add(ucSVDGpioId);
		list.add(ucSVCGpioId);
		list.add(ulReserved);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		sHeader.setName("ATOM_VOLTAGE_OBJECT_HEADER_V3");
		sHeader.setDescription("voltage mode = VOLTAGE_OBJ_SVID2");
		usLoadLine_PSI.setName("LoadLine_PSI");
		ucSVDGpioId.setName("SVDGpioId");
		ucSVDGpioId.setDescription("GPU GPIO pin Id to SVID2 regulator VRHot pin. possible value 0~31. 0 means GPIO0, 31 means GPIO31");

		ucSVCGpioId.setName("SVCGpioId");
		ucSVCGpioId.setDescription("GPU GPIO pin Id to SVID2 regulator VRHot pin. possible value 0~31. 0 means GPIO0, 31 means GPIO31");

		ulReserved.setName("Reserved");
		super.fillSubListDescriptions();
	}
}
