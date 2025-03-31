package Java;

import java.util.Scanner;

public class ConstructorAs14 {
	Scanner sc=new Scanner(System.in);
      public ConstructorAs14(int a[])
      {
    	  System.out.println("Enter number");
    	  int n=sc.nextInt();
    	  int temp=0;
    	  for(int i=0;i<a.length;i++)
    	  {
    		 if(a[i]==n)
    		 {
    			 temp=i;
    		 }
    	  }
    	  System.out.println("Number of occurance is:"+(temp+1));
      }
      
      public static void main(String args[])
	    {
	   	 Scanner sc=new Scanner(System.in);
	   	 int a[]=new int[5];
	   	 System.out.println("Enter array elements");
	   	 for(int i=0;i<a.length;i++) {
	   		  a[i]=sc.nextInt();
	   	 }
	   	 ConstructorAs14 obj=new ConstructorAs14(a);
	    }
}
