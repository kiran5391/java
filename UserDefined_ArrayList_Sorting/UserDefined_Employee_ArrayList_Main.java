import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class UserDefined_Employee_ArrayList_Main 
{
	void userInput(ArrayList<UserDefined_Employee_ArrayList> a)
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.print("Name: ");
		String name=s.nextLine();
		System.out.print("Salary: ");
		int sal=sc.nextInt();
		UserDefined_Employee_ArrayList e1=new UserDefined_Employee_ArrayList(name,sal);
		a.add(e1);
		System.out.println("Do you want to enter more employees?     If yes please enter yes!");
		String choice=s.nextLine();
		s.close();
		sc.close();
		choice(choice,a);
	}
	void sortingEmployees(ArrayList<UserDefined_Employee_ArrayList> a)
	{
		Scanner s=new Scanner(System.in);
		if(a.size()>1)
		{
		List<UserDefined_Employee_ArrayList> list=new ArrayList<UserDefined_Employee_ArrayList>();

		list.addAll(a);

		Collections.sort(list);

		Iterator<UserDefined_Employee_ArrayList> i=list.iterator();
		System.out.println("Sorted employees data:");
		while(i.hasNext())
		{
			UserDefined_Employee_ArrayList a1=(UserDefined_Employee_ArrayList)i.next();
			System.out.println(a1.emp_name+ " " +a1.salary);
		}
		}
		else
		{
			System.out.println("For comparison we need atleast 2 employees data");
			System.out.println("Do you want to enter more employees?     If yes please enter yes!");
			String choice=s.nextLine();
			s.close();
			if(choiceAfterCheckingArrayListSize(choice,a)==0)
			{
				System.out.println("SORRY!! We can't compare ony one employee's data");
			}
			else
			{
				userInput(a);
			}
		}
		}
		void choice(String choice,ArrayList<UserDefined_Employee_ArrayList> a)
		{
			if(choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y"))
			{
				userInput(a);
			
			}else 
			{
				sortingEmployees(a);
			}
		}
		int choiceAfterCheckingArrayListSize(String choice,ArrayList<UserDefined_Employee_ArrayList> a)
		{
			if(choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y"))
			{
				userInput(a);
				return 1;
			}
			return 0;
		}
	
	public static void main(String[] args) 
	{
		UserDefined_Employee_ArrayList_Main b=new UserDefined_Employee_ArrayList_Main();
		ArrayList<UserDefined_Employee_ArrayList> a=new ArrayList<UserDefined_Employee_ArrayList>();
		b.userInput(a);
	}
}
