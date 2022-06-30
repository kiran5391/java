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
	void elementGreaterThanArraySize(int arr[],int n) throws GreaterElementException
	{	
		for(int i=0;i<n;i++)
		{
			if(arr[i]>n)
				{
					throw new GreaterElementException();
				}
		}
	}
	int lowerLimitCheck(int arr[],int n) throws LowerLimitException																	
	{	
		for(int i=0;i<n;i++)
		{
			if((arr[i]==1 || arr[i]==2))
				{
				return 0;
				}
		}
		throw new LowerLimitException();
	}
	
	void duplicateElement(int arr[],int n) throws DuplicateElementException
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
				throw new DuplicateElementException();
		}
	}
	
	public static void main(String[] args)
	{
		try
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
		a.lowerLimitCheck(arr, n);
		a.duplicateElement(arr, n);
		a.elementGreaterThanArraySize(arr, n);
		System.out.println("Missing element in array:  "+a.findingMissingElement(arr,n));
		}
		catch(DuplicateElementException | LowerLimitException | GreaterElementException e )
		{	
			System.out.println("Exception Handled");
		}
	}
}
