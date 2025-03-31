package javabasicallprograms;
//program for remove duplicate char from given string
import java.util.*;
public class DuplicateCharRemove {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String result="";
		for(int i=0;i<s1.length();i++)
		{
			if(result.indexOf(s1.charAt(i))==-1)
					{
				result=result+s1.charAt(i);
					}
		}
	System.out.println("Removed duplicate char="+result);
	}

}
