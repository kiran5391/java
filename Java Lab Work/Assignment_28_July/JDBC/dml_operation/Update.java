package dml_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/lab"	;
		String driver="com.mysql.cj.jdbc.Driver";
		String update="update lab.employee set l_name=\"hello\" ;";
		Connection con=null;
		Statement stmt=null;
		try
		{
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			con=DriverManager.getConnection(url,"root", "bahubali");
			System.out.println("Connection Established");
			stmt=con.createStatement();
			System.out.println("Platform Created successfully");
			stmt.execute(update);
			System.out.println("Column Updated");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
