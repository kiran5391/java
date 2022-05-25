import java.util.Scanner;
public class BinarySearch 
{
	 static int search(int a[],int x,int f,int l)
	    {
	       if(l>=f)
	        {
	        	int mid=(f+l)/2;
	        	if(a[mid]==x)
	        	{
	        		return mid;
	        	}
	        	else if(a[mid]>x)
	        	{
	        		return search(a,x,f,mid-1);
	        	}
	        	else
	        	{
	        		return search(a,x,mid+1,l);
	        	}
	        }
	       return 0;
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
		int f=0;
		int l=n-1;
		System.out.println("Enter element to search:");
        int x = sc.nextInt();
        sc.close();
        int result = search(a,x,f,l);
        if (result==0)
        {
            System.out.print("Element is not present in array");
        }
        else
        {
            System.out.print("Element is present at index "+result);
        }
	}

}
