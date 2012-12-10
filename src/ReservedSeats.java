import java.awt.List;
import java.sql.ResultSet;


public class ReservedSeats {

	public static List getReservedSeats(int FlightNumber) throws Exception {
		String query = "SELECT res1, res2, res3, res4, res5 FROM Reservation WHERE fk_Flight_id ='" + FlightNumber + "'";

			ResultSet rs = Database.getInstance().execute(query);
			//String[] st = new String[10];
			List list = new List();
			
			while (rs.next()) {
				for( int i = 1; i < rs.getMetaData().getColumnCount(); i++)
				//System.out.println( ));
				list.add(rs.getString( rs.getMetaData().getColumnName(i)));
			}
			
			
		return list;
	}
	
	public String[] etEllerAndet( int iFlightNumber )
	{
		String query = "SELECT seats FROM Reservation WHERE fk_Flight_id ='" + iFlightNumber + "'";

		ResultSet rs;
		try {
			rs = Database.getInstance().execute(query);
			
			if( rs.next() )
				return( rs.getString("seats").split(",") );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
