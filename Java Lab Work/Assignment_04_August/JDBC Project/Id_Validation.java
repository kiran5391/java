import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Id_Validation 
{
	int count;
	int validate(int id)
	{
		Scanner sc=new Scanner(System.in);
		Util d=new Util();
		Connection con= d.driverLoading();
		String select="select * from lab.Students;";
		PreparedStatement pstmt=null;
		int i = 0;
		try
		{
			pstmt=con.prepareStatement(select);
			ResultSet result=pstmt.executeQuery(select);
			while(result.next())
			{
				int did=result.getInt(1);
				i= val(sc, did, id);
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
		return i;
	}

	public int val(Scanner sc, int did, int id) {
		
		if(id==did)
		{
			System.out.println("This id already exixts!!");
			System.out.println("Please enter unique id: ");
			id=sc.nextInt();
			validate(id);
			return id;
		}
		else
		{
			return id;
		}
	}
}
