

public class ChangeFunctionPas {
	//used for changing info in rows.
	//String value is the replacing value.
	//String column is the column in which the value will be changed (y coordinate)
	//int ID is the ID for the value that will be changed (x coordinate)
	public void chaEntry(String value, String column, int ID) throws Exception{
		String query = "UPDATE passengers SET " + column + "='" + value + "' WHERE ID = " + ID + "";
		Database.getInstance().execute(query);
	}
}
