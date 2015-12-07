import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class AtomCommonTableHeader {
	public AtomCommonTableHeader(byte[] data, short headerOffset) {
		ByteBuffer bb = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		//System.out.println(headerOffset);
		bb.position((int)headerOffset & 0xFFF);
		usStructureSize = bb.getShort();
		ucTableFormatRevision = bb.get();
		ucTableContentRevision = bb.get();
	}
	public AtomCommonTableHeader() {
		// TODO Auto-generated constructor stub
	}
	final short size =  4;
	short usStructureSize;
	byte  ucTableFormatRevision;   /*Change it when the Parser is not backward compatible */
	byte  ucTableContentRevision;  /*Change it only when the table needs to change but the firmware */
	                                  /*Image can't be updated, while Driver needs to carry the new table! */
}
