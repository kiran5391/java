package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
public class EmployeeLinkedList_CovertingToArray_Main 
{
	
	public static void conversion(LinkedList<EmployeeLinkedList_CovertingToArray> l1)
	{
		EmployeeLinkedList_CovertingToArray arr[]=new EmployeeLinkedList_CovertingToArray[l1.size()];
		for(int i=0;i<=l1.size()-1;i++)
		{
			arr[i]=l1.get(i);
		}
		for(int i=0;i<=l1.size()-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	private static LinkedList<EmployeeLinkedList_CovertingToArray> addingElementsInLinkedList() {
		EmployeeLinkedList_CovertingToArray e1=new EmployeeLinkedList_CovertingToArray(101,"Kiran","manager",50000);
		EmployeeLinkedList_CovertingToArray e2=new EmployeeLinkedList_CovertingToArray(102,"Afsha","manager",42000);
		EmployeeLinkedList_CovertingToArray e3=new EmployeeLinkedList_CovertingToArray(103,"Pooja","manager",480000);
		EmployeeLinkedList_CovertingToArray e4=new EmployeeLinkedList_CovertingToArray(104,"Neha","manager",45000);
		EmployeeLinkedList_CovertingToArray e5=new EmployeeLinkedList_CovertingToArray(105,"Anjali","manager",60000);
		LinkedList<EmployeeLinkedList_CovertingToArray> list1=new LinkedList<EmployeeLinkedList_CovertingToArray>();
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);
		list1.add(e5);
		return list1;
	}

	private static void printingLinkedListElements(LinkedList<EmployeeLinkedList_CovertingToArray> list1) {
		Iterator<EmployeeLinkedList_CovertingToArray> itr=list1.iterator();
		while(itr.hasNext())
		{
			EmployeeLinkedList_CovertingToArray a1=(EmployeeLinkedList_CovertingToArray)itr.next();
			System.out.println(a1.getEmp_id()+" "+a1.getEmp_name()+" "+a1.getEmp_designation()+" "+a1.getSalary());
		}
	}

	public static void main(String[] args) 
	{
		LinkedList<EmployeeLinkedList_CovertingToArray> list1 = addingElementsInLinkedList();
		printingLinkedListElements(list1);
		System.out.println("");
		System.out.println("-----------------IN ARRAY-----------------");
		System.out.println("");
		conversion(list1);	
	}

}
