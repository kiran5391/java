
public class StringBuilderString {

	public static void main(String[] args) {
		String s1="Kiran";
		StringBuilder sb1=new StringBuilder("Afsha");
		s1.concat("Yadav");
		sb1.append(" Ansari");
		System.out.println(s1);
		System.out.println(sb1);
		System.out.println("String is Immutable and String Builder is not Immutable");
	}

}
