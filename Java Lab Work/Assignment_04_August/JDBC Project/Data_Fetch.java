import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Data_Fetch 
{
	void fetching_Data()
	{
		Util d=new Util();
		Connection con= d.driverLoading();
		String select="select * from lab.Students;";
		PreparedStatement pstmt=null;
		try
		{
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
		catch( SQLException e)
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
