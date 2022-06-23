package SortingOfStudentObjects;
import java.util.Arrays;
import java.util.Scanner;
public class Student_main 
{
	void sortingByTakingUserInput()
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int n=sc.nextInt();
		Student[] student=new Student[n];
		System.out.println("Enter Students Data: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Name: ");
			String name=s.nextLine();
			System.out.print("Roll no.: ");
			int roll=sc.nextInt();
			System.out.print("Subject: ");
			String subject=s.nextLine();
			System.out.print("Total Marks: ");
			int marks=sc.nextInt();
			student[i]=new Student(name,roll,subject,marks);
		}
		sc.close();
		s.close();
		System.out.println();
		System.out.println("---------Students Data As Entered-----------");
		System.out.println();
		for (int i=0;i<n;i++)
		{
            System.out.println("Name:"+student[i].Student_Name+" "+ "Roll no.:"+student[i].rollno+ " Subject:"+student[i].Subject +" Marks:"+" "+ student[i].totalmarks);
		}
		System.out.println();
		
		System.out.println("----------Sorting of student by alphabetical order of name------------");
		System.out.println();
		Arrays.sort(student, new Name_Comparator());
		for(Student s1 : student)
		{
			System.out.println(s1 + " ");
		}	
		
		System.out.println();
		System.out.println("----------Sorting of student by Total Marks ------------");
		System.out.println();
		Arrays.sort(student, new Marks_Comparator());
		for(Student s1 : student)
		{
			System.out.println(s1 + " ");
		}	
	}
	public static void main(String[] args) 
	{
		Student_main s1=new Student_main();
		s1.sortingByTakingUserInput();
	}
}
