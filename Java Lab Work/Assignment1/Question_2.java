
public class Question_2 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(i+j==6 || j==i+4 || (j==i+2 && i!=1 )|| (i+j==8 && i==j) ||(i==j+2 && i==5) || (i==j && i==5))
				{
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}System.out.println(" ");
		}

	}

}
