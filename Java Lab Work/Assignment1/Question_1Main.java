package question1;
import java.util.Scanner;
public class Question_1Main {

	public static void main(String[] args) {
		Question_1 circle=new Question_1();
		Question_1 rectangle=new Question_1();
		Question_1 box=new Question_1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius:");
		int r=sc.nextInt();
		circle.area(r);
		System.out.println("Enter length & breadth:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		rectangle.area(l,b);
		System.out.println("Enter length & height & width:");
		int l_b=sc.nextInt();
		int h_b=sc.nextInt();
		int w_b=sc.nextInt();
		box.area(l_b,h_b,w_b);

	}

}
