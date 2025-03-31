package javabasicallprograms;
import java.util.*;
public class CountVowelsConsonent {
	public static void main(String[] args) {
		System.out.println("Enter the String to count vowels and consonant");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
	   int vowel=0,cosonant=0;
	   
	   for(char ch:s.toCharArray())
	   {
		   if(ch>='a' && ch<='z')
		   {
			   if(ch=='a' ||ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
			   {
				   vowel++;
			   }
			   else
			   {
				   cosonant++;
				   
			   }
			  
		   }
	   }
		
	   System.out.println("Total Vowels are="+vowel);
	   System.out.println("Total consonat are="+cosonant);

	}

}
