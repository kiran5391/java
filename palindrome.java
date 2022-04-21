import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		number=sc.nextInt();
		int enterednumber=number;
		int remainder,reverse=0;
		while(number>0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
			String result=(enterednumber==reverse)?"Entered number is palindrome":"Entered number is not palindrome";
			System.out.println(result);
	}

}
