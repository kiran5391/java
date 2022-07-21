import java.util.HashMap;
import java.util.Scanner;
public class RetrivingValueWithUserEnteredKey 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		HashMap<String,String> h1=new HashMap<String,String>();
		int choice;
		try 
		{
		do {
		System.out.print("Enter Key: ");
		String Key=sc.nextLine();
		System.out.print("Enter Value: ");
		String Value=sc.nextLine();
		h1.put(Key, Value);
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
		
		System.out.println("Enter the key of value you want to search: ");
		String a = sc.nextLine();
		System.out.println(h1.get(a));
		}
		catch(Exception e){}
		finally
		{
			sc.close();
			s.close();
		}
	}
	
}
