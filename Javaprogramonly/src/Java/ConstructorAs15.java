package Java;

import java.util.Scanner;

public class ConstructorAs15 {

	ConstructorAs15(int a[],int b[])
	{
		System.out.println("Intersection");
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
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
	   	int b[]=new int[5];
	   	 System.out.println("Enter array elements");
	   	 for(int i=0;i<a.length;i++) {
	   		  b[i]=sc.nextInt();
	   	 }
	   	 ConstructorAs15 obj=new ConstructorAs15(a,b);
	    }
}
