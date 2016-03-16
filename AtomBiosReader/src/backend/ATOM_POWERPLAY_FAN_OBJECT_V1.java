package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_FAN_OBJECT_V1 extends AContainer {
	
	ByteStructure ucTHyst = new ByteStructure();/* Temperature hysteresis. Integer. */
	ShortStructure  usTMin = new ShortStructure(); /* The temperature, in 0.01 centigrades, below which we just run at a minimal PWM. */
	ShortStructure  usTMed = new ShortStructure(); /* The middle temperature where we change slopes. */
	ShortStructure  usTHigh = new ShortStructure();/* The high point above TMed for adjusting the second slope. */
	ShortStructure  usPWMMin = new ShortStructure();/* The minimum PWM value in percent (0.01% increments). */
	ShortStructure  usPWMMed = new ShortStructure();/* The PWM value (in percent) at TMed. */
	ShortStructure  usPWMHigh = new ShortStructure();/* The PWM value at THigh. */



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucTHyst);
		list.add(usTMin);
		list.add(usTMed);
		list.add(usTHigh);
		list.add(usPWMMin);
		list.add(usPWMMed);
		list.add(usPWMHigh);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucTHyst.setName("ucTHyst");
		usTMin.setName("usTMin");
		usTMed.setName("usTMed");
		usTHigh.setName("usTHigh");
		usPWMMin.setName("usPWMMin");
		usPWMMed.setName("usPWMMed");
		usPWMHigh.setName("usPWMHigh");


		
		ucTHyst.setDescription("Temperature hysteresis. Integer.");
		usTMin.setDescription("The temperature, in 0.01 centigrades, below which we just run at a minimal PWM.");
		usTMed.setDescription("The middle temperature where we change slopes.");
		usTHigh.setDescription("The high point above TMed for adjusting the second slope.");
		usPWMMin.setDescription("The minimum PWM value in percent (0.01% increments).");
		usPWMMed.setDescription("The PWM value (in percent) at TMed.");
		usPWMHigh.setDescription("The PWM value at THigh.");



		
		super.fillSubListDescriptions();
	}

}
