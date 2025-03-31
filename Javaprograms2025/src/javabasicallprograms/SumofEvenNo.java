package javabasicallprograms;
import java.util.*;
public class SumofEvenNo {

	public static void main(String[] args) {
	
		System.out.println("Enter the even no to sum of them till no");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			sum=sum+i;
			
		}
	System.out.println("sum ="+sum);
	}
		
	}


