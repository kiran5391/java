import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class DeletingDuplicateEmployee 
{
	public static void main(String args[])
	{	
		try
		{
		ArrayList<Employee> a=new ArrayList<Employee>();
		int choice;
		do
		{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.print("Id: ");
		int id=sc.nextInt();
		System.out.print("Name: ");
		String name=s.nextLine();
		System.out.print("Department: ");
		String dept=s.nextLine();
		System.out.print("Salary: ");
		int sal=sc.nextInt();
		Employee e1=new Employee(id,name,dept,sal);
		a.add(e1);
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
		
		HashSet<Employee> ts=new HashSet<Employee>(a);
		Iterator<Employee> itr=ts.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		}
		catch(InvalidExcepion e)
		{
		}
	}
}
