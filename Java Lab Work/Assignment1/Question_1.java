package question1;

public class Question_1 {
	float radius;
	float length;
	float breadth;
	float length_box;
	float height_box;
	float width_box;
	double area_circle;
	float area_rectangle;
	float area_box;
	
	void area(float r)
	{
		radius=r;
		area_circle=3.14*r*r;
		System.out.println("Area of circle is:"+area_circle);
	}
	
	void area(float l,float b)
	{
		length=l;
		breadth=b;
		area_rectangle=l*b;
		System.out.println("Area of rectangle is:"+area_rectangle);
	}
	
	void area(float l,float h,float w)
	{
		length_box=l;
		height_box=h;
		width_box=w;
		area_box=2*((l*w)+(l*h)+(w*h));
		System.out.println("Area of box is:"+area_box);
	}
	public static void main(String[] args) 
	{
	}
}
