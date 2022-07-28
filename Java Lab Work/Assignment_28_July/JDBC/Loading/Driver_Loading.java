package loading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver_Loading 
{

	public static void main(String[] args) 
	{
		
			String url="jdbc:mysql://localhost:3306/lab";
			String driver="com.mysql.cj.jdbc.Driver";
			Connection cn=null;
			try
			{
				Class.forName(driver);
				System.out.println("Driver loaded successfully");
				cn=DriverManager.getConnection(url,"root", "bahubali");
				System.out.println("Connection Established");
			}
			catch(ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try {
					cn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
		

}


