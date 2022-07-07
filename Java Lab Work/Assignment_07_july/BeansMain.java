import java.util.Scanner;

public class BeansMain 
{
	
	public static void main(String[] args) 
	{
		Beans b1=new Beans("red","round","red beans","asia");
		Beans b2=new Beans("green","oval","green beans","asia");
		Beans b3=new Beans("yellow","oval","yellow beans","america");
		Beans b4=new Beans("blue","round","navy beans","africa");
		System.out.println("B1 and B2 objects are equal as their hashcodes and value of one of its property(origin) are equal.");
		System.out.println();
		System.out.println("Hashcode of b1 object : "+b1.hashCode()+"     Origin: "+b1.getOrigin());
		System.out.println("Hashcode of b2 object : "+b2.hashCode()+"     Origin: "+b2.getOrigin());
		System.out.println();
		System.out.println("B3 and B4 objects are not equal as their hashcodes and value of one of its property(origin) are not equal.");
		System.out.println();
		System.out.println("Hashcode of b3 object : "+b3.hashCode()+"    Origin: "+b3.getOrigin());
		System.out.println("Hashcode of b4 object : "+b4.hashCode()+"   Origin: "+b4.getOrigin());		
	}
}
