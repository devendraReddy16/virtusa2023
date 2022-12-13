package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","tiger");
			System.out.println("success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.err.println("not drived");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("drived");
		}
		
		
	}

}
