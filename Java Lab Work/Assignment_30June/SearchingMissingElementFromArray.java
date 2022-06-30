package SearchingMissingElementFromArray;

import java.util.Scanner;

public class SearchingMissingElementFromArray 
{
	int findingMissingElement(int arr[],int n)
	{
		int Sum_of_n_elements=(n*(n+1))/2;
		int sum_of_array_elements=0;
		for(int i=0;i<n;i++)
		{
			sum_of_array_elements=sum_of_array_elements+arr[i];
		}
		int missing_number=Sum_of_n_elements-sum_of_array_elements;
		return missing_number;
	}
	public static void main(String[] args) 
	{
		SearchingMissingElementFromArray a=new SearchingMissingElementFromArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in array:");
		for(int i=0;i<n-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Missing element in array:  "+a.findingMissingElement(arr,n));
	}
}
