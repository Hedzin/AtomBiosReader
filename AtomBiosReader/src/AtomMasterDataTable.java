
public class AtomMasterDataTable {
	  public AtomCommonTableHeader sHeader;
	  public AtomMasterListOfDataTables listOfDataTables;
	  
	  public AtomMasterDataTable(byte[] data, short usMasterDataTableOffset) {
		  sHeader = new AtomCommonTableHeader(data, usMasterDataTableOffset);
		  listOfDataTables =  new AtomMasterListOfDataTables(data, usMasterDataTableOffset+sHeader.size);
	}
	  
}
