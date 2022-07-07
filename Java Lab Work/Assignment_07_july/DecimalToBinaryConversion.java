import java.util.Scanner;

public class DecimalToBinaryConversion 
{
	static void convertingDecimalToBinary(int n)
	{
		int binarynum[]= new int[500];
	    int i=0;
	    while (n>0) 
	    {
	       binarynum[i]=n%2;
	       n = n/2;
	       i++;
	    }
	    for(int j=i-1;j>=0;j--)
	    {
	       System.out.print(binarynum[j]);
	    }
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to convert into binary :  ");
		int n =sc.nextInt();
		sc.close();
        System.out.println("Decimal : " + n);
        System.out.print("Binary :");
        convertingDecimalToBinary(n);
	}

}
