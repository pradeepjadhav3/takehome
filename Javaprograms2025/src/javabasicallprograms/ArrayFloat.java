package javabasicallprograms;

import java.util.Scanner;

public class ArrayFloat {

	public static void main(String[] args) {
	//	float a[]=new float[5];
		float sum=0;
		System.out.println("Enter the range in between 1-100");
		Scanner sc=new Scanner(System.in);
		float no=sc.nextFloat();
		for(float i=1;i<=no;i++)
		{
			sum=sum+i;
			
		}
	System.out.println("sum="+sum);
	}
	}


