

public class DelFunctionPas {
	Database db;
	//used for deleting rows.
	//int ID is the ID of the row to be deleted
	public void delEntry(int ID) throws Exception{
		String query = "DELETE FROM passengers WHERE ID = '" + ID + "'";
		Database.getInstance().execute(query);
	}
}
