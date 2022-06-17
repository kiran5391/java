import java.util.Scanner;
public class RoofTopPoolCafeManaging 
{
	Scanner sc=new Scanner(System.in);
	RoofTopPoolCafeMain getRoofTopPoolCafe()
	{
		System.out.println("Which cafe would you like to visit???");
		String cafe=sc.nextLine();
		if(cafe.equalsIgnoreCase("Sunlight"))
		{
			System.out.println("Welcome to Sunlight Cafe");
			return RoofTopPoolCafeManaging();
		}
		else 
		{
			System.out.println("Welcome to Naaz Cafe");
			return RoofTopPoolCafeManaging();
		}
		
	}
	private RoofTopPoolCafeMain RoofTopPoolCafeManaging() {
		
		return null;
	}
	
}
