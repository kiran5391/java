public class ParameterizedConstructor {
	int roll_no;
	String name;
	static String year="Third Year";
	static String dept="BCA";
	String address;
	
	ParameterizedConstructor(int i,String s)
	{
		roll_no=i;
		name=s;
		System.out.println("Roll Number:"+roll_no+"  Name:"+name+"  Year:"+year+"  Department:"+dept+"  Address:"+address);
	}
	public static void main(String[] args)
	{
		ParameterizedConstructor a=new ParameterizedConstructor(13133,"Kiran");
		ParameterizedConstructor b=new ParameterizedConstructor(13103,"Afsha");
		ParameterizedConstructor c=new ParameterizedConstructor(13134,"Pooja");
	}

}
