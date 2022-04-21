import java.util.Scanner;
class SumOfPrimeBetweenRange
{
	static int primeMethod(int j)
	{	
	
	int temp=0;
	for(int i=2;i<=j-1;i++)
	{
		if(j%i==0)
		{
			return 0;
		}
	}
	return 1;
	}
	public static void main(String args[])
	{
		int sum=0,count=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Lower Range:");
		int l=sc.nextInt();
		System.out.println("Enter the Upper Range:");
		int u=sc.nextInt();
		for(int i=l;i<=u;i++)
		{
			if(primeMethod(i) == 1)
		{
			sum=sum+i;
			count++;
		}
		}
		avg=(float)sum/count;
		System.out.println("Average of the prime numbers betwwen "+l+" to "+u+" is: "+avg);
	}
}
