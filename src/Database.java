import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
	private static Database instance = null;
	private Connection con ;
	protected Statement stmt;

	protected Database(){
		try {
			connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Database getInstance(){
		if(instance == null)
			instance = new Database();
		return instance;
	}
	
	private void connect()throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://mysql.itu.dk/mlpj01","mlpj","GoofyMoo1");
		
		stmt = con.createStatement();
	}
	
	public ResultSet execute(String cmd) throws Exception {
		if(con.isClosed())
		
			System.out.println(cmd);
			boolean ok = stmt.execute(cmd);
			if (ok)
				return stmt.getResultSet();
			else
				return null;
	}
	public void close() throws Exception {
		con.close();
	}
}
