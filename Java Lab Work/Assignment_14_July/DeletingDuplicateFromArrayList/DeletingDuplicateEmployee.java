import java.util.ArrayList;
import java.util.TreeSet;
public class DeletingDuplicateEmployee 
{
	public static void main(String args[])
	{
		Employee e1=new Employee(101,"Kiran","sales",50000);
		Employee e2=new Employee(102,"Afsha","marketing",42000);
		Employee e3=new Employee(104,"Neha","production",45000);
		Employee e4=new Employee(105,"Anjali","accounts",60000);
		Employee e5=new Employee(106,"Anjali","accounts",45000);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		TreeSet<Employee> ts=new TreeSet<Employee>();
		ts.addAll(al);
		for(Employee e:ts)
		{
		System.out.println(e);
	}
	}
}
