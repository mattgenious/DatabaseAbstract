import java.sql.ResultSet;

public class SearchFunctionPas {
	
	//used for searching the database.
	//takes DataBase.getEntry(string firstName, string lastName, string BirthDate, string ZipCode, string PhoneNumber, string BookingNumber)
	//empty strings allowed.
	public String[] getEntry(String qr1, String qr2, String qr3, String qr4) throws Exception {
		String query = 	"SELECT FirstName, LastName, BirthDate, PhoneNumber, StreetAddress, ZipCode, FlightNumber, NumberOfSeats, SeatNumber, BookingNumber, ID FROM passengers" +
				" WHERE FirstName LIKE '%" + qr1 + "%' OR LastName LIKE '%" + qr2 + "%' OR PhoneNumber LIKE '%" + qr3 + "%' OR BookingNumber LIKE '%" + qr4 + "%' ORDER BY ID";
		
		ResultSet rs = Database.getInstance().execute(query);
		String[] st = new String[11];
		while (rs.next()) {
										st[0] = rs.getString("ID");
										st[1] = rs.getString("FirstName");
										st[2] = rs.getString("LastName");
										st[3] = rs.getString("BirthDate");
										st[4] = rs.getString("PhoneNumber");
										st[5] = rs.getString("StreetAddress");
										st[6] = rs.getString("ZipCode");
										st[7] = rs.getString("FlightNumber");
										st[8] = rs.getString("NumberOfSeats");
										st[9] = rs.getString("SeatNumber");
										st[10] = rs.getString("BookingNumber");
			}
		return st;
	}
}