import java.util.Scanner;
public class NoOfVowelsInString {
	static void numberOfVowels(String string)
	{
		int countofvowels=0;
		String line=string;
		for(int i=0;i<line.length();i++)
		{
			char ch=line.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				countofvowels++;
			}
		}
		System.out.println("Number of vowels in the given string is "+countofvowels);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String: ");
		String string=sc.nextLine();
		numberOfVowels(string);		
		
	}
}
