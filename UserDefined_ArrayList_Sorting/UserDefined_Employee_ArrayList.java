
public class UserDefined_Employee_ArrayList implements Comparable
{
	private int salary;
	private String emp_name;
	
	public UserDefined_Employee_ArrayList(String name,int sal)
	{
		setEmp_name(name);
		setSalary(sal);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
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
		return "BookSortingUsingCompareTo [Employee Name=" + getEmp_name() + ", Salary=" + getSalary()+ "]";
	}
	
}
