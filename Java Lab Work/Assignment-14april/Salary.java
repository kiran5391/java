package question4;

public class Salary {

	public static void main(String[] args) {
		int averagesalaryperweek=10000;
		
		int sal_employee1=11000;
		int sal_employee2=5000;
		int sal_employee3;
		
		int averagesalarypermonth=averagesalaryperweek*4;
		
		sal_employee3=averagesalarypermonth-(sal_employee1+sal_employee2);
		
		System.out.println("Salary of Third Employee is Rs."+sal_employee3);
		
		

	}

}
