import java.util.Scanner;

public class JDBC_Main {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		try
		{
		System.out.println("Enter the operation you want to perform:-- 	");
		System.out.println("1. Create Table");
		System.out.println("2. Insert Data");
		System.out.println("3. Update Data");
		System.out.println("4. Delete Data");
		System.out.println("5. Fetch  Data");
		int ch=sc.nextInt();
		switch (ch)
		{
			case 1:	Table_Creation_Factory t=new Table_Creation_Factory();
					t.tableCreate();
					break;
					
			case 2: Data_Insertion_Factory d=new Data_Insertion_Factory();
					d.insertData();
					break;
					
			case 3: Update_Data_Factory u=new Update_Data_Factory();
					u.updateData();
					break;
					
			case 4: Delete_Data_Factory del=new Delete_Data_Factory();
					del.deletingData();
					break;
					
			case 5: Data_Fetch f=new Data_Fetch();
					f.fetching_Data();
					break;	
		}
		}
		catch(Exception e){}
		finally
		{	
			sc.close();
		}
	}

}
