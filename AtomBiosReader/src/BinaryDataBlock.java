import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class BinaryDataBlock {

	private ByteBuffer body;
	public List<BinaryDataBlock> childList = new ArrayList<BinaryDataBlock>();
	private String name;
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
	
}
