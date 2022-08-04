import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_Data_Factory 
{
	void updateData()
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		Util d=new Util();
		Connection con= d.driverLoading();
		String update_marks="update lab.Students set Marks=? where Student_id=? ;";
		String update_fn="update lab.Students set First_Name=? where Student_id=?;";
		String update_ln="update lab.Students set Last_Name=? where Student_id=?;";
		String update_sub="update lab.Students set subject=? where Student_id=?;";
		PreparedStatement pstmt=null;
		try
		{
			System.out.println("Enter Student's id whose data you want to update: ");
			int id=s.nextInt();
			System.out.println("Enter the data you want to update: ");
			System.out.println("1: First Name ");
			System.out.println("2: Last Name ");
			System.out.println("3: Subject ");
			System.out.println("4: Marks ");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1: pstmt = update_First_Name(sc, update_fn, con, id);
					break;
					
			case 2: pstmt = update_Last_Name(sc, update_ln, con, id);
					break;
					
			case 3: pstmt = update_subject(sc, update_sub, con, id);
					break;
					
			case 4: pstmt = update_marks(s, update_marks, con, id);
					break;
					
			}
			
			System.out.println("Data Updated");
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
			s.close();
		}

	}

	private PreparedStatement update_First_Name(Scanner sc, String update_fn, Connection con, int id)
			throws SQLException {
		PreparedStatement pstmt;
		System.out.println("Enter First Name: ");
				String fn=sc.nextLine();
				pstmt=con.prepareStatement(update_fn);
				pstmt.setInt(2, id);
				pstmt.setString(1, fn);
				pstmt.executeUpdate();
		return pstmt;
	}

	private PreparedStatement update_Last_Name(Scanner sc, String update_ln, Connection con, int id)
			throws SQLException {
		PreparedStatement pstmt;
		System.out.println("Enter Last Name: ");
				String ln=sc.nextLine();
				pstmt=con.prepareStatement(update_ln);
				pstmt.setInt(2, id);
				pstmt.setString(1, ln);
				pstmt.executeUpdate();
		return pstmt;
	}

	private PreparedStatement update_subject(Scanner sc, String update_sub, Connection con, int id)
			throws SQLException {
		PreparedStatement pstmt;
		System.out.println("Enter subject: ");
				String sub=sc.nextLine();
				pstmt=con.prepareStatement(update_sub);
				pstmt.setInt(2, id);
				pstmt.setString(1, sub);
				pstmt.executeUpdate();
		return pstmt;
	}

	private PreparedStatement update_marks(Scanner s, String update_marks, Connection con, int id) throws SQLException {
		PreparedStatement pstmt;
		System.out.println("Enter marks: ");
				int m=s.nextInt();
				pstmt=con.prepareStatement(update_marks);
				pstmt.setInt(2, id);
				pstmt.setInt(1, m);
				pstmt.executeUpdate();
		return pstmt;
	}

}
