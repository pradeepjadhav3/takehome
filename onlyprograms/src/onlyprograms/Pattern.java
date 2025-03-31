package onlyprograms;

public class Pattern {

	public static void main(String[] args) {
		char ch='a';
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ch);
				
			}
			ch++;
			System.out.println();
		}
	
	}

}
