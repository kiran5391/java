package SortingOfStudentObjects;
public class Student 
{
	String Student_Name;
	int rollno;
	String Subject;
	int totalmarks;
	public Student(String name,int rollno,String subject,int marks)
	{
		setStudent_Name(name);
		setRollno(rollno);
		setSubject(subject);
		setTotalmarks(marks);
		
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() 
	{
		return "Student Name:" + getStudent_Name() + ", Roll no:" + getRollno() + ", Subject:" + getSubject() + ", Total Marks:" + getTotalmarks();
	

	}
}
