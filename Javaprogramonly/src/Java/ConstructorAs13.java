package Java;

import java.util.Scanner;

public class ConstructorAs13 {
         public  ConstructorAs13(int a[])
         {
        	       int count=0;
        	 for(int i=0;i<a.length;i++)
        	 {
        		 
        		 for(int j=0;j<a[i];j++)
        			 if(j*j==a[i])
        			 {
        				 count++;
        			 }
        	 }
        	 int c[]=new int[count];
        	 int index=0;
        	 for(int i=0;i<a.length;i++)
        	 {	 
        		 for(int j=0;j<a[i];j++)
        			 if(j*j==a[i])
        			 {
        				 c[index++]=a[i];
        				 
        			 }
        	 }
        	 
        	 for(int i=0;i<c.length;i++)
        	 {
        		 System.out.print(c[i]+" ");
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
 	   	 ConstructorAs13 obj=new ConstructorAs13(a);
 	    }
}
