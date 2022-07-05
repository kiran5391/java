import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
public class ArraylistSorting 
{
	public static void main(String args[])
	{
		java.util.ArrayList<Integer> list1=new java.util.ArrayList<Integer>();
		list1.add(10);
		list1.add(8);
		list1.add(7);
		list1.add(5);
		list1.add(4);
		
		java.util.ArrayList<Integer> list2=new java.util.ArrayList<Integer>();
		list2.add(20);
		list2.add(19);
		list2.add(18);
		list2.add(17);
		list2.add(16);
		
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(list1);
		list.addAll(list2);
		
		Iterator<Integer> i=list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Collections.sort(list);
		Iterator<Integer> i1=list.iterator();
		
		System.out.println("After Sorting");
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
