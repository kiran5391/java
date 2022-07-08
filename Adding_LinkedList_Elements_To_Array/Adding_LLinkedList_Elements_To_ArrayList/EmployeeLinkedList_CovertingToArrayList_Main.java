package LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class EmployeeLinkedList_CovertingToArrayList_Main 
{
	public static ArrayList<EmployeeLinkedList_CovertingToArray> Conversion(LinkedList<EmployeeLinkedList_CovertingToArray> l1)
	{
		ArrayList<EmployeeLinkedList_CovertingToArray> arr=new ArrayList<EmployeeLinkedList_CovertingToArray>();
		for(int i=0;i<=l1.size()-1;i++)
		{
			arr.add(l1.get(i));
		}
		return arr;
	}

	public static void main(String[] args) 
	{
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
		Iterator<EmployeeLinkedList_CovertingToArray> itr=list1.iterator();
		while(itr.hasNext())
		{
			EmployeeLinkedList_CovertingToArray a1=(EmployeeLinkedList_CovertingToArray)itr.next();
			System.out.println(a1.getEmp_id()+" "+a1.getEmp_name()+" "+a1.getEmp_designation()+" "+a1.getSalary());
		}
		System.out.println("");
		System.out.println("-----------------IN ARRAYLIST-----------------");
		System.out.println("");
		ArrayList<EmployeeLinkedList_CovertingToArray> arr=new ArrayList<EmployeeLinkedList_CovertingToArray>();
		arr=Conversion(list1);
		List<EmployeeLinkedList_CovertingToArray> list=new ArrayList<EmployeeLinkedList_CovertingToArray>();	
		list.addAll(arr);
		Iterator<EmployeeLinkedList_CovertingToArray> i=list.iterator();
		while(i.hasNext())
		{
			EmployeeLinkedList_CovertingToArray a1=(EmployeeLinkedList_CovertingToArray)i.next();
			System.out.println(a1.getEmp_id()+" "+a1.getEmp_name()+ " " +a1.getEmp_designation()+" "+a1.getSalary());
		}
	}
}



