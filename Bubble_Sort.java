import java.util.Scanner;
public class Bubble_Sort {
	static void bubbleSort(int a[],int n)
	{
		for(int i=n-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		bubbleSort(a,n);
		System.out.println("Sorted Elements In Array Are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
