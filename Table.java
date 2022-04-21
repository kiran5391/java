import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int r=1;
		System.out.println("Table of "+n+":");
		for(int i=1;i<=10;i++)
		{
			r=n*i;
			System.out.println(r);
		}
		
	}

}
