import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Table_Creation_Factory 
{
	void tableCreate()
	{
		Util d=new Util();
		String create="CREATE TABLE `lab`.`Students` (`Student_id` INT NOT NULL,`First_Name` CHAR(45) NOT NULL,`Last_Name` CHAR(45) NOT NULL, `Subject` CHAR(45) NOT NULL,`Marks` INT NOT NULL,PRIMARY KEY(`Student_id`), UNIQUE INDEX `Student_id_UNIQUE` (`Student_id` ASC) VISIBLE);";
		Connection con= d.driverLoading();
		Statement stmt=null;
		try
		{
			stmt=con.createStatement();
			stmt.execute(create);
			System.out.println("Table Created");
		}
		catch( SQLException e)
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

