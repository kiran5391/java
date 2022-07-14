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
		System.out.println(a2);
		a1.add("Afsha");
		a1.add("Pooja");
		a1.add("Humaira");
		a1.add("Neha");
		if(a1.containsAll(a2))
		{
			System.out.println(a1);
		}
	}	
}
