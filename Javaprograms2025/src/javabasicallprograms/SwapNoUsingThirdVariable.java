package javabasicallprograms;
import java.util.*;

public class SwapNoUsingThirdVariable {

	public static void main(String[] args) {
		System.out.println("Enter the 2 number for swaping");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int temp=0;
		temp=no1;
		no1=no2;
		no2=temp;
		System.out.println("Swap number are:"+no1+ ":"+no2);
	}

}
