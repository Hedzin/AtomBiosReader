package backend;
import java.util.List;

public class Slicer {
	public static void slice(IStructure scructure) {
		BinaryDataBlock bdb = scructure.getBinaryDataBlock();
		StructureType type = scructure.getType();
		List<IStructure> sList = scructure.getSubStructureList();
		for (IStructure subStructure : sList) {
			if (subStructure.getDataType() == StructureDataType.container)/*TODO*/ ;
			else if (subStructure instanceof IFantomContainer)process((IFantomContainer)subStructure, bdb);
			else if (subStructure.getDataType() == StructureDataType.editableValue)/*TODO*/;
			else {
				/*
				 * TODO error
				 */
			}	
		}
		
	}
	private static void process(IFantomContainer structure, BinaryDataBlock bdb) {
		IContainer keyHeader =  structure.getKey();
		process
	}
	private static void process(IContainer structure, BinaryDataBlock bdb) {
		IStructure keyHeader =  structure.getKey();
		
	}

}
