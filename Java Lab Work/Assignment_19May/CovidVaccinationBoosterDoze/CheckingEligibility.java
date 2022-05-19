package covidVaccinationBoosterDoze;
import java.util.Scanner;
public class CheckingEligibility {
	static void nationalityCheck(String nationality)throws NationalityCheckException,EligibilityCheckException
	{
		if(nationality.equalsIgnoreCase("indian") || nationality.equalsIgnoreCase("india") )
		{
			genderCheck();
		}
		else
		{
			throw new NationalityCheckException();
		}
	}
	static void genderCheck()throws EligibilityCheckException
	{
		Scanner sc=new Scanner(System.in);
		String Gender;
		System.out.println("Enter Gender: ");
		Gender=sc.nextLine();
		if(Gender.equalsIgnoreCase("Male"))
		{
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			if(age>60)
			{
				System.out.println("You Are Eligible For Doze..");
			}
			else
			{
				throw new EligibilityCheckException();
			}
		}
		else if(Gender.equalsIgnoreCase("Female"))
		{
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			if(age>50)
			{
				System.out.println("You Are Eligible For Doze..");
			}
			else
			{
				throw new EligibilityCheckException();
			}
		}
	}
	public static void main(String[] args)throws NationalityCheckException,EligibilityCheckException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Nationality:");
		String Nationality=sc.nextLine();
		nationalityCheck(Nationality);
	}
}
