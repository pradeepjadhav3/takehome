package javabasicallprograms;
import java.util.*;
public class ReverserNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number for reverse");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int reverse=0;
		while(no!=0)
		{
			int digit=no%10;
			reverse=reverse*10+digit;
			no=no/10;
		}
        System.out.println("Reverse no="+reverse);
	}

}
