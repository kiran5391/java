package bikes;
import java.util.Scanner;
public class BikeManufacturer {
	 Bike getBike()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Bike Name:");
			String b=sc.nextLine();
			if(b.equalsIgnoreCase("Suzuki"))
			{
				return new Suzuki();
			}
			else if(b.equalsIgnoreCase("Mahindra"))
			{
				return new Mahindra();
			}
			else 
			{
				return null;
			}
			
		}	 
}
