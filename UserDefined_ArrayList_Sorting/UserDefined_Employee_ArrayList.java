
public class UserDefined_Employee_ArrayList implements Comparable
{
	int salary;
	String emp_name;
	
	public UserDefined_Employee_ArrayList(String name,int sal)
	{
		this.emp_name=name;
		this.salary=sal;
	}

	@Override
	public int compareTo(Object o) {
		UserDefined_Employee_ArrayList e=(UserDefined_Employee_ArrayList)o;
		
		double s1=this.salary;
		double s2 = e.salary;
		if(s1 == s2 ) return 0;
		else if(s1>s2) return 1;
		else return -1;
	}
	@Override 
	public String toString() {
		return "BookSortingUsingCompareTo [Employee Name=" + emp_name + ", Salary=" + salary+ "]";
	}
	
}
