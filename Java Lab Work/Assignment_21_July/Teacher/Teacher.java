package Teacher;

import java.util.Objects;

public class Teacher 
{
	private String Name;
	private String Subject;
	
	public Teacher(String name, String subject) 
	{
		setName(name);
		setSubject(subject);
	}
	public String getName() 
	{
		return Name;
	}

	public void setName(String name) 
	{
		Name = name;
	}

	public String getSubject()
	{
		return Subject;
	}

	public void setSubject(String subject) 
	{
		Subject = subject;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Name, Subject);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Teacher))
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(Subject, other.Subject);
	}
	@Override
	public String toString() {
		return "Teacher [Name=" + Name + ", Subject=" + Subject + "]";
	}

	
}
