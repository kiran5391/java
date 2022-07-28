package ddl_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table_Creation 
{

	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/lab"	;
		String driver="com.mysql.cj.jdbc.Driver";
		String create="CREATE TABLE `lab`.`employee` (`emp_id` INT NOT NULL,`f_name` CHAR(45) NOT NULL,`l_name` CHAR(45) NOT NULL, `department` CHAR(45) NOT NULL,`salary` DECIMAL(12,2) NOT NULL,PRIMARY KEY(`emp_id`), UNIQUE INDEX `emp_id_UNIQUE` (`emp_id` ASC) VISIBLE);";
		Connection con=null;
		Statement stmt=null;
		try
		{
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			con=DriverManager.getConnection(url,"root", "bahubali");
			System.out.println("Connection Established");
			stmt=con.createStatement();
			System.out.println("Platform Created successfully");
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
