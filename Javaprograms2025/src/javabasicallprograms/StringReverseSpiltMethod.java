package javabasicallprograms;
import java.util.*;
public class StringReverseSpiltMethod {
	    public  static  void  main(String[] args) {
	        System.out.println("Enter any string:");
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();
	        String[] words = input.split("\\s"); 
	        String reversedString = "";

	        // Reverse the words
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedString += words[i] + " ";
	        }
	        System.out.println("Reversed string: " + reversedString.trim());
	    }
	}
