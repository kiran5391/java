import  java.util.Scanner;
public class SplitSentence {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
	     
		    System.out.println("Enter a String: ");
		    String s1=sc.nextLine();
		    String[] arr=s1.split(" ");
		  
		  for(int i=2;i<=arr.length;i--)
		    {
		     System.out.println(arr[i]);
		    }

	}

}
