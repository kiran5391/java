import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table_Creation_Factory 
{
	void tableCreate()
	{
		String url="jdbc:mysql://localhost:3306/lab";
		String driver="com.mysql.cj.jdbc.Driver";
		String create="CREATE TABLE `lab`.`Student` (`Student_id` INT NOT NULL,`First_Name` CHAR(45) NOT NULL,`Last_Name` CHAR(45) NOT NULL, `Subject` CHAR(45) NOT NULL,`Marks` INT NOT NULL,PRIMARY KEY(`Student_id`), UNIQUE INDEX `Student_id_UNIQUE` (`Student_id` ASC) VISIBLE);";
		Connection con=null;
		Statement stmt=null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,"root", "bahubali");
			stmt=con.createStatement();
			stmt.execute(create);
			System.out.println("Table Created");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				stmt.close();
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
