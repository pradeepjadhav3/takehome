package javabasicallprograms;
import java.util.*;

public class Occurance {

	public static void main(String[] args) {
     System.out.println("Enter the String to count occurances");
     Scanner sc=new Scanner(System.in);
     String s1=sc.next();
     char c[]=s1.toCharArray();
     TreeMap<Character,Integer> hm=new TreeMap<Character,Integer>();
     for(char r:c)
     {
    	 if(hm.containsKey(r))
    	 {
    		 hm.put(r, hm.get(r)+1);
    		 
    	 }
    	 
    	 else
    	 {
    		 hm.put(r, 1);
    	 }
     }
     System.out.println("occurance="+hm);
     
	}

}
