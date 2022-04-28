import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String word="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word:");
		word=sc.nextLine();
		int enteredword=word.length();
		String reverse="";
		int i;
		for(i=(word.length()-1);i>=0;--i)
		{
			reverse=reverse+word.charAt(i);
}
		if(word.equals(reverse))
		{
			System.out.println("Entered word is Palindrome");
		}
		else
		{
			System.out.println("Entered word is not a Palindrome");
		}
		
			

	}

}
