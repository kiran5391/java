package array;
import java.util.Scanner;
public class ArrayInputFromUserAndReverse {

	static void reverseArray(int a[],int n)
	{
		int reverse[]=new int[n];
		int c=n;
		int i=0;
		for(int j=c-1;j>=0;j--)
		{
			reverse[i]=a[j];
			i=i+1;
		}
		System.out.println("Reversed Elements In Array Are:");
		for(int b=0;b<c;b++)
		{
			System.out.println(reverse[b]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered Elements In Array Are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		reverseArray(a,n);
	}
}
