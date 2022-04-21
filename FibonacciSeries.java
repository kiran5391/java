import java.util.Scanner; 
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int i,n3;
		System.out.println(n1);
		System.out.println(n2);
		for(i=1;i<=13;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}

}
