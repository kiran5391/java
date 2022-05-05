import java.util.Scanner;
public class WordOccurences {

	static int wordoccurence(String sentence,String word)
	{
		String array[]=sentence.split(" ");
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(word.equals(array[i]))
			{
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String sentence=sc.nextLine();
		System.out.println("Enter word to be counted in a Sentence:");
		String Word=sc.nextLine();
		System.out.println(wordoccurence(sentence,Word));

	}

}
