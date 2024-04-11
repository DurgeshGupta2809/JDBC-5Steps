package StepsOfConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BooleanExcuteMethod {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/student?user=postgres&password=root";
			Connection con=DriverManager.getConnection(url);
			
			Statement stm=con.createStatement();
			
			String sql1="INSERT INTO student_info VALUES(3001,'Chakori','chaku@gmail.com',45687654)";
			String sql2="SELECT * FROM student_info";
			
			boolean res1= stm.execute(sql1);
			boolean res2= stm.execute(sql2);
			
			System.out.println("Non-Select Query : "+res1);
			System.out.println("Select Query : "+res2);
			
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
