package Java;

import java.util.Scanner;

public class ConstructorAs6 {
	Scanner sc=new Scanner(System.in);
	 public ConstructorAs6(int a[])
     {  
		 System.out.println("Enter rotations");
		 int r=sc.nextInt();
		for(int j=1;j<=r;j++)
		{
    	int temp=a[0];
    	 for(int i=0;i<a.length-1;i++)
    	 {
    		     
    		
    			 a[i]=a[i+1];
    			
    		 
    	 }
    	a[a.length-1]=temp;	
		}
    	 for(int i=0;i<a.length;i++)
    	 {
    		 System.out.print(a[i]+" ");
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
    	 ConstructorAs6 obj=new ConstructorAs6(a);
     }
}
