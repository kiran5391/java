package Teacher;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DeletingTeacherBasedOnUserInput
{
	private static void creatingMapUsingUserInput(Scanner sc, Scanner s, Map<Teacher, String> m1)throws InvalidExcepion {
		int choice;
		do {
		System.out.print("Enter Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Subject: ");
		String subject=sc.nextLine();
		System.out.print("Enter Department: ");
		String dept=sc.nextLine();
		Teacher t=new Teacher(name,subject);
		m1.put(t,dept);
		System.out.println("Enter 1 to enter more employees ");
		System.out.println("Enter 0 to exit ");
		choice=s.nextInt();
		if(choice==0)
		{
			System.out.println("Thankyou!! ");
		}
		else if(choice!=1)
		{
			throw new InvalidExcepion();
		}
		}while(choice==1);
	}
	
	private static Teacher userInputForDeletion(Scanner sc) {
		System.out.println("Enter the data you want to delete: ");
		System.out.print("Enter name: ");
		String n=sc.nextLine();
		System.out.print("Enter subject: ");
		String sb=sc.nextLine();
		Teacher t1=new Teacher(n,sb);
		return t1;
	}
	
	private static void deletingUserEnteredData(Map<Teacher, String> m1, Teacher t1) throws NoDataFoundException {
		System.out.println("-------Before Deleting--------");
		System.out.println(m1);
		System.out.println();
		if(m1.remove(t1)==null)
		{
			throw new NoDataFoundException();
		}
		else
		{
			System.out.println("Deleted successfully");
		}
		System.out.println();
		System.out.println("------After Deleting-------");
		System.out.println(m1);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		Map<Teacher,String> m1=new LinkedHashMap<Teacher,String>();
		try 
		{
		creatingMapUsingUserInput(sc, s, m1);
		Teacher t1 = userInputForDeletion(sc);
		deletingUserEnteredData(m1, t1);
		}
		catch(Exception e){}
		finally
		{
			sc.close();
			s.close();
		}
	}
}
