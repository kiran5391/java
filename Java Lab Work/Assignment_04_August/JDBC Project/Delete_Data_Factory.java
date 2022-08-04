import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_Data_Factory 
{
	void deletingData()
	{
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/lab";
		String driver="com.mysql.cj.jdbc.Driver";
		String delete="delete from student where Student_id =?";
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,"root", "bahubali");
			pstmt=con.prepareStatement(delete);
			System.out.println("Enter the Student's id whose data you want to delete");
			int id=sc.nextInt();
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			System.out.println("Student's data with id "+id+" has been deleted from database");
			
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
			sc.close();
		}
	}
}
