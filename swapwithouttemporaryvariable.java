
public class swapwithouttemporaryvariable {

	public static void main(String[] args) {
		int a=15,b=10;
		System.out.println("Before Swapping");
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After Swapping");
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);

	}

}
