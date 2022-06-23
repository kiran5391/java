package SortingOfStudentObjects;

import java.util.Comparator;

public class Marks_Comparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int)(o1.totalmarks-o2.totalmarks);
	}

}
