package javabasicallprograms;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Entert the string for reverse");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String is="+rev);

	}

}
