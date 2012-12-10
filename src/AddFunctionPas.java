
public class AddFunctionPas {
	
	//used for inserting or changing data.
	//String i2 is FirstName
	//String i3 is LastName
	//String i4 is BirthDate in format yyyy-mm-dd
	//int i5 is PhoneNumber in format xxxxxxxxxx
	//String i6 is StreetAddress
	//int i7 is ZipCode
	//int i8 is FlightNumber
	//String i9 DepartureDate in format yyyy-mm-dd
	//int i10 is NumberOfSeats
	//String i11 is SeatNumber
	//empty strings not allowed!
	public void setEntry(String i2, String i3, String i4, int i5, String i6, int i7, int i8, String i9, int i10, String i11) throws Exception {
		
		Database.getInstance().execute("INSERT INTO passengers (FirstName, LastName, BirthDate, PhoneNumber, StreetAddress, ZipCode, FlightNumber, DepDate, NumberOfSeats, SeatNumber, BookingNumber) VALUES ("+ i2 +","+ i3 +","+ i4 +","+ i5 +","+ i6 +","+ i7 +","+ i8 +","+ i9 +","+ i10 +","+ i11 +","+ bookingNrGen(i3, i4, i5) +")");
	}
	
	private static int bookingNrGen(String curLast, String curBirth, int curPhone){
		int hash = 1;
		hash = hash + curLast.hashCode();
		hash = hash + curBirth.hashCode();
		hash = hash + curPhone;
		
		System.out.println(hash);
		
		return hash;
	}
}
