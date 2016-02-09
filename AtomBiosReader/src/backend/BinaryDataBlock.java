package backend;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Hex;

public class BinaryDataBlock {

	private ByteBuffer body;
	public List<BinaryDataBlock> childList = new ArrayList<BinaryDataBlock>();
	private String name;
	private String type;
	private String comment;
	private int length;
	private int offset;
	private int version;

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setLengthHexString(String hexStringLength) {
		this.length = Integer.decode(hexStringLength);
	}
	public int getIntegerLE() {
		body.position(0);
		switch (length) {
		case 0:
			try {
				throw new Exception("length = 0");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 1:
			Byte b = body.get();
			return b.intValue();
		case 2:
			Short s = body.order(ByteOrder.LITTLE_ENDIAN).getShort();
			return s&0xFFFF;
		case 4:
				return body.order(ByteOrder.LITTLE_ENDIAN).getInt();
		default:
			try {
				throw new Exception("unexpexted lenght:"+length);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(this.getName());
				e.printStackTrace();
			}
			break;
		}
		return 0;
	}
	public int getOffset() {
		
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public void setOffsetHexString(String hexStringOffset) {
		this.offset = Integer.decode(hexStringOffset);
	}
	public ByteBuffer getBody() {
		return body;
	}
	public void setBody(ByteBuffer body) {
		this.body = body;
		this.length = body.limit()-body.position();
	}
	public List<BinaryDataBlock> getChildList() {
		return childList;
	}
	public void setChildList(List<BinaryDataBlock> childList) {
		this.childList = childList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public BinaryDataBlock() {
		
	}
	public BinaryDataBlock(ByteBuffer bb) {
		setBody(bb);
	}
	public String getHexString() {
		body.rewind();
		//System.out.println("BinaryDataBlock  getHexString debugl: "+length);
		//System.out.println("BinaryDataBlock  getHexString body.limit: "+body.limit());
		//System.out.println("BinaryDataBlock  getHexString body.pos: "+body.position());
		byte[] bytearray = new byte[length];
		body.get(bytearray);
		return Hex.encodeHexString(bytearray);
	}
	public void printHexString() {
		System.out.println(getHexString());
	}
	public void reset() {
		body.rewind();
	}
	public void setType(String type) {
		this.type = type;
		
	}
}
