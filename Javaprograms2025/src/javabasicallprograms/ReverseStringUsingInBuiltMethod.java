package javabasicallprograms;
import java.util.*;

public class ReverseStringUsingInBuiltMethod {

	public static void main(String[] args) {
		System.out.println("Enter the string for reverse");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		System.out.println("Reverse String is="+sb);  
		StringBuilder sb1= new StringBuilder(s1);
        sb1.reverse();
        System.out.println("reverse="+sb1);
          
	}

}
