package LinkedList;
public class EmployeeLinkedList_CovertingToArray 
{
	private int emp_id;
	private int salary;
	private String emp_name;
	private String emp_designation;
	
	public EmployeeLinkedList_CovertingToArray(int id,String name,String desg,int sal)
	{
		setEmp_id(id);
		setEmp_name(name);
		setEmp_designation(desg);
		setSalary(sal);
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
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

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}
	@Override 
	public String toString() {
		return "[ Id=" + getEmp_id()+", Employee Name=" + getEmp_name() + ", Salary=" + getSalary()+ ", Employee Designation=" + getEmp_designation() +"]";
	}
	
}
