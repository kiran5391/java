package AreaOfRectangle;
import java.util.Scanner;
public class Rectangle 
{	
	 Scanner sc=new Scanner(System.in);
	 int Length;
	 int Breadth;
	public Rectangle(int l,int b) 
	{
		setLength(l);
		setBreadth(b);
		int area=Length*Breadth;
		System.out.println("Given Length of Rectangle is: "+getLength());
		System.out.println("Given Breadth of Rectangle is: "+getBreadth());
		System.out.println("Area of Rectangle is: "+area);
	}
	public int getLength() 
	{
		return Length;
	}
	public void setLength(int length) 
	{
		if(length>=10 && length<=50) 
		{
				Length = length;
		}
		else
		{
			System.out.println("Enter length between 10 to 50");
			int l=sc.nextInt();
			setLength(l);
		}
	}
	public int getBreadth() 
	{
		return Breadth;
	}
	public void setBreadth(int breadth) 
	{
		if(breadth>=05 && breadth<=20) 
		{
			Breadth = breadth;
		}
		else
		{
			System.out.println("Enter breadth between 05 to 20");
			int b=sc.nextInt();
			setBreadth(b);
		}
	}		
}
