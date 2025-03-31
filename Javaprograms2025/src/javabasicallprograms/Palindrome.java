package javabasicallprograms;
import java.util.*;
//program for check given string palindrome or not
public class Palindrome {

	public static void main(String[] args) {
	System.out.println("Entert the any string to check palindrom or not");
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String result="";
	for(int i=s1.length()-1;i>=0;i--)
	{
	 result=result+s1.charAt(i);	
	}
		if(s1.equals(result))
		{
			System.out.println("String is palindrome="+s1);
			
		}
		else
		{
			System.out.println("String is not palindrom="+s1);
		}
	
	}

}
