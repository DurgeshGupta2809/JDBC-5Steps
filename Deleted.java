package StepsOfConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleted {

	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/student?user=postgres&password=root";
		String driver="org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			
			Connection con= DriverManager.getConnection(url);
			
			Statement stm=con.createStatement();
			
			String sql="DELETE FROM student_info WHERE sid=3001";
			
			stm.execute(sql);
			
			con.close();
			System.out.println("Record Deleted...");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}

