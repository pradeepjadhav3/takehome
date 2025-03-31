package javabasicallprograms;
import java.util.*;
public class CountAlphanoSymbol {

	public static void main(String[] args) {
		System.out.println("Enter the String to count alphbet number symbol");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c;
		int alpha=0,number=0,symbol=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			c=s.charAt(i);
			if(Character.isAlphabetic(c))
			{
				alpha++;
			}
			else if(Character.isDigit(c))
			{
				number++;
			}
			else
			{
				symbol++;
			}
		
		}

		System.out.println("alpha="+alpha);
		System.out.println("number="+number);
		System.out.println("symbol="+symbol);
	}

}
