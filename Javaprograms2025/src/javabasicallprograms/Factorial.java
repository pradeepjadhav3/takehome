package javabasicallprograms;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter any number to calculate factorial it");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of give no is="+fact);

}
}