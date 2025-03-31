package Java;

import java.util.Scanner;

public class ConstructorAs11 {

	 public ConstructorAs11(int a[])
	{  
		 int count=0;
		for(int i=0;i<a.length;i++)
		{
			       int j=a[i];int rem=0;int rev=0;
			     for(;j!=0;j=j/10)
			     {
			    	 rem=j%10;
			    	 rev=rev*10+rem;
			     }
			     if(rev==a[i])
			     {
			    	 count++;
			     }
		}
		
		int c[]=new int[count];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			       int j=a[i];int rem=0;int rev=0;
			     for(;j!=0;j=j/10)
			     {
			    	 rem=j%10;
			    	 rev=rev*10+rem;
			     }
			     if(rev==a[i])
			     {
			    	 c[index++]=a[i];
			     }
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
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
	   	 ConstructorAs11 obj=new ConstructorAs11(a);
	    }
}
