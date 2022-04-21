import java.util.Scanner;
public class Votingeligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		String v=(age>=18) ?"eligible":"not eligible";
		System.out.println("You are " +v);
	}

}
