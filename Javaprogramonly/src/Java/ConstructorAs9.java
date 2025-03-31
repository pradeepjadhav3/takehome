package Java;

import java.util.Scanner;

public class ConstructorAs9 {
	public ConstructorAs9(int a[])
	{
		 int max=a[0];
		 int smax=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				    smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				
				smax=a[i];
			}
		}
	
		System.out.print("Second max="+smax);
		
		
	}

		public static void main(String args[])
	     {
	    	 Scanner sc=new Scanner(System.in);
	    	 int a[]=new int[5];
	    	 System.out.println("Enter array elements");
	    	 for(int i=0;i<a.length;i++) {
	    		  a[i]=sc.nextInt();
	    	 }
	    	 ConstructorAs9 obj=new ConstructorAs9(a);
	     }
	}

