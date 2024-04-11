package StepsOfConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertion {

	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/student?user=postgres&password=root";
		String driver="org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			
			Connection con= DriverManager.getConnection(url);
			
			Statement stm=con.createStatement();
			
			String sql="Insert Into student_info values(221,'Ayush','ayush234@gmail.com',234567654)";
			
			stm.execute(sql);
			
			con.close();
			System.out.println("Record Inserted...");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
