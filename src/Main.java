
public class Main {

	public static void main(String[] args) {
		new ReservedSeats();
		try {
			ReservedSeats.getReservedSeats(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
