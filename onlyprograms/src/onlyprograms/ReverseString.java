package onlyprograms;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String for Reverse");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2[]=str1.split("\\s");
		for(int i=0;i<str2[i].length();i++)
		{
			StringBuffer sb=new StringBuffer(str2[i]);
			System.out.println("Reverse String="+sb.reverse());
			
		}
		

	}

}
