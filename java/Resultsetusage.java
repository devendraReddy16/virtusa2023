package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system", "tiger");
			Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=smt.executeQuery("select rollno,name,marks from student");
			rs.absolute(2);
			rs.updateInt(1, Integer.parseInt(args[0]));
			rs.updateString(2, args[1]);
			rs.updateInt(3, Integer.parseInt(args[2]));
			rs.updateRow();
			System.out.println("one record succesfully updated");
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
