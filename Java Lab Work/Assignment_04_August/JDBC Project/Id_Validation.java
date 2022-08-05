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
		int new_id = 0,count=0,i=0;
		try
		{
			pstmt=con.prepareStatement(select);
			ResultSet result=pstmt.executeQuery(select);
			while(result.next())
			{
				int did=result.getInt(1);
				if(id==did)
				{
					count++;
					System.out.println("Please enter unique id: ");
					new_id=sc.nextInt();
					validate(new_id);
					break;
				}
			}	
			i=check(id, new_id, count);
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
			sc.close();
			
		}
	return i;
	}
	public int check(int id, int new_id, int count) {
		if(count==0)
		{
			return id;
		}
		else
		{return new_id;}
	}
}
