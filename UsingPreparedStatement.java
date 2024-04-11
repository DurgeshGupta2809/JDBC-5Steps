package StepsOfConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsingPreparedStatement {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/student?user=postgres&password=root";
			Connection con = DriverManager.getConnection(url);
			
			String sql1 = "Insert into student_info values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql1);
			ps.setInt(1, 1001);
			ps.setString(2, "Karan");
			ps.setString(3, "karra@gmail.com");
			ps.setLong(4, 5678765);
			
			ps.execute();
			
			String sql2 = "Insert into student_info values(?,?,?,?)";
			PreparedStatement ps1=con.prepareStatement(sql2);
			ps1.setInt(1, 2001);
			ps1.setString(2, "Arjun");
			ps1.setString(3, "arru@gmail.com");
			ps1.setLong(4, 65434567);
			
			ps1.execute();
			
			con.close();
			System.out.println("Data Inserted...");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
