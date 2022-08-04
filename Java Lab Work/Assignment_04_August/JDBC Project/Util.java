import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util 
{
	Connection driverLoading()
	{
		String url="jdbc:mysql://localhost:3306/lab"	;
		String driver="com.mysql.cj.jdbc.Driver";
		Connection cn=null;
		try
		{
			Class.forName(driver);
			cn=DriverManager.getConnection(url,"root", "bahubali");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("Problem while loading");
			e.printStackTrace();
		}
		return cn;
	}
}
