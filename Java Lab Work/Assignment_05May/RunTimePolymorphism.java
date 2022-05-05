class Check
{
	public void Example()
	{
		System.out.println("This is from Parent Class");
	}
}
public class RunTimePolymorphism extends Check{
	
	public void Example()
	{
		System.out.println("This is from Child Class");
	}
	public static void main(String[] args)
	{
		Check c=new RunTimePolymorphism();
		c.Example();

	}

}
