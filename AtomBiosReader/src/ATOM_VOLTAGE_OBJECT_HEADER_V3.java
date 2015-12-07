
public class ATOM_VOLTAGE_OBJECT_HEADER_V3 implements IStructure {
	 Byte		ucVoltageType;									//Indicate Voltage Source: VDDC, MVDDC, MVDDQ or MVDDCI	 
	   Byte		ucVoltageMode;							    //Indicate voltage control mode: Init/Set/Leakage/Set phase 
		 Short		usSize;													//Size of Object
		@Override
		public int getLength() {
			int length = 4;

			return length;
		}
}
