package onlyprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
    
		int no1=0,no2=1,no3;
		System.out.println("Enter the no to print fibonaccies seris");
		Scanner sc=new Scanner(System.in);
		int rangeno=sc.nextInt();
		for(int i=1;i<=rangeno;i++)
		{
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.println("Fibonacci series="+no3);
		}
			
		
      

	}

}
