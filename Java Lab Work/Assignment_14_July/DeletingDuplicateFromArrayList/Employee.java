
public class Employee implements Comparable
{
	private int emp_id;
	private int salary;
	private String emp_name;
	private String dept;
	
	public Employee(int id,String name,String dept,int sal)
	{
		setEmp_id(id);
		setEmp_name(name);
		setDept(dept);
		setSalary(sal);
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [emp_id= " + emp_id + ", salary= " + salary + ", emp_name= " + emp_name + ", emp_department= "+ dept + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		
		String s1=this.emp_name;		
		String s2 = e.emp_name;
		if(s1 == s2 ) 
			return 0;
		else 
			return (s1.compareTo(s2));
	}
	

}
