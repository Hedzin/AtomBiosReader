
public class DataStructs {
	static DataDumperT get_data_dumper (int ind, int version, int revision, String comment){
		data_dumper_struct_t *dt, *found = null;
		for (dt = data_dumpers; dt->id >= 0 && dt->id <= ind; dt++) {
			if (dt->id != ind)
			    continue;
			if ((dt.vers != version) && (dt.vers > 0))
			    continue;
			if (dt.rev > revision)
			    continue;
			found     = dt;
		}
		if (found) {
			version  = found.vers;
			revision = found.rev;
			if (comment!=null)
			    comment = found.comment;
			return found.dumper;
		}
		return null;
	}
}
