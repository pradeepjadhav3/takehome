package javabasicallprograms;
import java.util.*;
public class LargestNofrom3 {

	public static void main(String[] args) {
		System.out.println("Enter the 3 number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a >c)
		{
			System.out.println(" a is great="+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("b is great="+b);
		}

		else
		{
			System.out.println("c is great="+c);
		}
		
	}

}
