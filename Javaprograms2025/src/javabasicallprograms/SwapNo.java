package javabasicallprograms;

import java.util.*;
public class SwapNo {

	public static void main(String[] args) {
		System.out.println("Entter to 2 number for swap");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		 no1=no1+no2;     
		 no2=no1-no2;       
		 no1=no1-no2;
		 System.out.println("Swapn number are="+ no1+ ":"+no2);

	}

}
