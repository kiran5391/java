import java.util.Scanner;
public class CharacterOcccurenceInString
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int n=str.length();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=str.charAt(i);
		}
		for(int i=0;i<n;i++)
		{
			int count=1;
			if(arr[i]!=0)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=0;
					}
				}
			}if(arr[i]!=0)
			{
				System.out.println((char)arr[i]+" "+count);
			}
			
		}
	}
}
