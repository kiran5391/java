import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Data_Insertion_Factory 
{
	void insertData()
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/lab"	;
		String driver="com.mysql.cj.jdbc.Driver";
		String insert="INSERT INTO `lab`.`Student`(`Student_id`,`First_Name`,`Last_Name`,`Subject`,`Marks`)VALUES(?,?,?,?,?)";
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,"root", "bahubali");
			pstmt=con.prepareStatement(insert);
			System.out.println("Enter the number of data you want to insert:");
			int n=s.nextInt();
			for(int i=0;i<n;i++)
			{
			System.out.println("Enter Student Id:");
			int id=s.nextInt();
			System.out.println("Enter First name:");
			String fname=sc.nextLine();
			System.out.println("Enter Last name:");
			String lname=sc.nextLine();
			System.out.println("Enter Subject:");
			String sub=sc.nextLine();
			System.out.println("Enter Marks:");
			int m=s.nextInt();
			pstmt.setInt(1,id);
			pstmt.setString(2, fname);
			pstmt.setString(3, lname);
			pstmt.setString(4, sub);
			pstmt.setInt(5, m);
			pstmt.addBatch();
			}
			pstmt.executeBatch();
			System.out.println("Data Entered");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				pstmt.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			sc.close();
			s.close();
		}
	}
}
