import java.util.Scanner;
public class RemoveDuplicateElementFromArray {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter elements in array:");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered Elements In Array Are:");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j++]=arr[len-1];
		System.out.println("Array After Removing Duplicate Elements:");
		for(int k=0;k<j;k++)
		{
			System.out.println(temp[k]);
		}
	}
}
