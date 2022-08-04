import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Data_Fetch 
{
	void fetching_Data()
	{
		String url="jdbc:mysql://localhost:3306/lab"	;
		String driver="com.mysql.cj.jdbc.Driver";
		String select="select * from lab.Student;";
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,"root", "bahubali");
			pstmt=con.prepareStatement(select);
			ResultSet result=pstmt.executeQuery(select);
			while(result.next())
			{
				int id=result.getInt(1);
				String fn=result.getString(2);
				String ln=result.getString(3);
				String sub=result.getString(4);
				int m=result.getInt(5);
				System.out.println(id+" "+fn+" "+ln+" "+sub+" "+m);
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				pstmt.close();
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
