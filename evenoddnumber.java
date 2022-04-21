import java.util.Scanner;
public class evenoddnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		String value=(num%2==0)? "Even Number":"Odd Number";
		System.out.println("Entered number is "+value);
		

	}

}
