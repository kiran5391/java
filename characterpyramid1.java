
public class characterpyramid1 {

	public static void main(String[] args) {
		int ascii=65;
		int i,j;
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print((char)(ascii+i)+"");
			}
			System.out.println();
		}

	}

}
