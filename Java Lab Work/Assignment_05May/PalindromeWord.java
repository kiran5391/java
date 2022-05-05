import java.util.Scanner;
public class PalindromeWord {
	static int palindromeCheck(String word)
	{
		int n=word.length();
		word=word.toLowerCase();
		for(int i=0;i<=n;i++,n--)
		{
			if(word.charAt(i) != word.charAt(n-1))
			{
				return 0;
			}
		}
		return 1;
	}
	static int countPalindrome(String sentence)
	{
		sentence=sentence+ " ";
		String word="";
		int count=0;
		for(int i=0;i<sentence.length();i++)
		{
		char ch=sentence.charAt(i);
		if(ch!= ' ')
		{
			word=word+ch;
			
		}
		else
		{
			if(palindromeCheck(word)==1)
				count=count+1;
			word="";
			
		}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Sentence;
		System.out.println("Enter a Sentence containing Palindrome words:");
		Sentence=sc.nextLine();
		System.out.println("There are "+countPalindrome(Sentence)+" Palindrome Words in the entered sentence.");
		
	}

}
