package bikes;
import java.util.Scanner;
public class BikeMain {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String a=sc.nextLine();
		System.out.println("Enter License Number:");
		String l=sc.nextLine();
			Rider r=new Rider();
				Bike b= new BikeManufacturer().getBike();
				
			
				if(b !=null)
				{
					r.ride(b,a,l);
					Engine e=new Engine();
					Wheel wheel=new Wheel();
				}
				else
				{
					System.out.println("Bike is not available");
				}
			}
	}


