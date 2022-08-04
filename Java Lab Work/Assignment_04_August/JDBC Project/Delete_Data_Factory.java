import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_Data_Factory 
{
	void deletingData()
	{
		Scanner sc=new Scanner(System.in);
		Util d=new Util();
		Connection con= d.driverLoading();
		String delete="delete from students where Student_id =?";
		PreparedStatement pstmt=null;
		try
		{
			pstmt=con.prepareStatement(delete);
			System.out.println("Enter the Student's id whose data you want to delete");
			int id=sc.nextInt();
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			System.out.println("Student's data with id "+id+" has been deleted from database");
			
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
	}
}
