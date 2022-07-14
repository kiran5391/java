import java.util.LinkedList;

public class ReverseLinkedList 
{
	static LinkedList<Integer> reverse(LinkedList<Integer> ll)
	{
		LinkedList<Integer> reverse=new LinkedList<Integer>();
		for(int i=ll.size()-1;i>=0;i--)
		{
			reverse.add(ll.get(i));
		}
		return reverse;
	}
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(20);
		ll.add(33);
		ll.add(4);
		ll.addFirst(1);
		ll.addLast(100);
		System.out.println(ll);
		System.out.println(reverse(ll));
	}
}
