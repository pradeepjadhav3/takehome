package javabasicallprograms;
import java.util.*;
public class StringAnagram {
	public static void main(String[] args) {
		System.out.println("Enter the 2 string to check anagram string or not");
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.length()==s2.length())
        {
        	System.out.println("String length is same");
        }
        else
        {
        	System.out.println("String length is not same");
        }
        
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       // Arrays.equals(ch1, ch2);
        boolean result=  Arrays.equals(ch1, ch2);
        if(result)
        {
        	System.out.println("String is anagram");
        }
        
        else
        {
        System.out.println("String is not anagram");
        }
        
	}

}
