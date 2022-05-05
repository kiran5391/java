import java.util.Scanner;
public class SmallerNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Ratio:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x*y;
		System.out.println("Enter LCM:");
		int LCM=sc.nextInt();
		int p=LCM/z;
		int a=p*x;
		int b=p*y;
		if(a>b)
		{
			System.out.println("Smaller number is "+b);
		}
		else
		{
			System.out.println("Smaller number is "+a);
		}
	
	}
}
