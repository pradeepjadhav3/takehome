package javabasicallprograms;
import java.util.*;

public class Occurance1 {

	public static void main(String[] args) {
     System.out.println("Enter the String to count occurances");
     Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();
     int occurance[]=new int[256];
     for(int i=0;i<s1.length();i++)
     {
    	 occurance[s1.charAt(i)]++;
     }
	
     for(int i=0;i<=256;i++)
     {
    	 if(occurance[i]>0)
    	 {
    		 System.out.println((char)i+ ":"+occurance[i]);
    	 }
     }
	}
}
