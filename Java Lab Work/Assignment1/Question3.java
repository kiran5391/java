import java.util.Scanner;
public class Question3 {
	static int primeMethod(int j)
	{	
		
		int sum=0;
		for(int i=1;i<=j-1;i++)
		{
			if(j%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==j)
		{
			return 0;
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		int i,e,fact=1,sum=0;
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the initial number of range:");
		i=sc.nextInt();
		System.out.println("Enter the last number of range:");
		e=sc.nextInt();
		for(int j=i;j<=e;j++)
		if(primeMethod(j) == 0)
		{
			for(int c=1;c<=j;c++)
			{
				fact=fact*c;
			}
			System.out.println("Factorial of "+j+" is "+fact);
		}
			
	}
}
