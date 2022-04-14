import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		number=sc.nextInt();
		int enterednumber=number;
		int remainder,sum=0;
		while(number>0)
		{
			remainder=number%10;
			sum=sum+remainder;
			number=number/10;
		}
		System.out.println("Summation of each digit of number entered by user is:"+sum);

	}

}
