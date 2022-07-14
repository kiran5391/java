/* Accept two arraylist and check all the elements of second list is present in the first list or not*/
import java.util.ArrayList;
public class ComparisionOfElementsInArraylist 
{
	public static void main(String args[])
	{
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Kiran");
		a2.add("Afsha");
		a2.add("Pooja");
		a2.add("Humaira");
		a2.add("Neha");
		System.out.println("Arraylist 2:  "+a2);
		a1.addAll(a2);
		if(a1.containsAll(a2))
		{
			System.out.println();
			System.out.println("Arraylist 1:  "+a1);
		}
		else
		{
			System.out.println("Arraylist 1 doesn't contain all elements that are present in arraylist 2");
		}
	}	
}
