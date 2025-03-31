package Java;

import java.util.Scanner;

public class ConstructorAs16 {
	 Scanner sc=new Scanner(System.in);
	ConstructorAs16(int a[])
	{
		System.out.println("Enter sum number");
		int sum=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(a[i]+" "+a[j]);
					break;
				}
			}
		}
	}
	 public static void main(String args[])
	    {
	   	 Scanner sc=new Scanner(System.in);
	   	 int a[]=new int[5];
	   	 System.out.println("Enter array elements");
	   	 for(int i=0;i<a.length;i++) {
	   		  a[i]=sc.nextInt();
	   	 }
	   	 ConstructorAs16 obj=new ConstructorAs16(a);
	    }
}
