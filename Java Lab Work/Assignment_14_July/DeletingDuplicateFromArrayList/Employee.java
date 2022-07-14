import java.util.Objects;

public class Employee
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
	public int hashCode() {
		return Objects.hash(dept, emp_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(emp_name, other.emp_name);
	}
	

}
