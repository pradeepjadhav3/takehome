package Java;

import java.util.Scanner;

public class ConstructorAs12 {

	public ConstructorAs12(int a[])
	{
		   int max=0;
		for(int i=0;i<a.length;i++)
		{
			    int sum=0;
			for(int j=i+1;j<a.length-1;j++)
			{
				sum=a[i]+a[j];
				if(sum>max)
					max=sum;
			}
		}
		System.out.println("Maximum subarray:"+max);
	}
	
	 public static void main(String args[])
	    {
	   	 Scanner sc=new Scanner(System.in);
	   	 int a[]=new int[9];
	   	 System.out.println("Enter array elements");
	   	 for(int i=0;i<a.length;i++) {
	   		  a[i]=sc.nextInt();
	   	 }
	   	 ConstructorAs12 obj=new ConstructorAs12(a);
	    }
}
