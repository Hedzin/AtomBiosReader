
public class AtomMasterCommandTable {

	AtomCommonTableHeader commandTable;
	  AtomMasterListOfCommandTables listOfCommandTables;
	  
	  public AtomMasterCommandTable(byte[] data, short usMasterCommandTableOffset) {
		  commandTable = new AtomCommonTableHeader(data, usMasterCommandTableOffset);
		  listOfCommandTables =  new AtomMasterListOfCommandTables(data, usMasterCommandTableOffset + commandTable.size);
	}
	  
}
