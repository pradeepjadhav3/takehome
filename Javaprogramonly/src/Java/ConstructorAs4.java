package Java;

import java.util.Scanner;

        public class ConstructorAs4 {
	 public ConstructorAs4(int a[])
     {   int count=0;
    	 int b[]=new int[a.length];
    	 for(int i=0;i<a.length;i++)
    	 {
    		     
    		 for(int j=i+1;j<a.length;j++)
    		 {
    			 if(a[i]<a[j])
    			 {
    				count++;
    			 }
    		 }
    	 }
    		 if(count==0)
    		 {
    			 System.out.println("Desending"); 
    		 }
    		 else
    		 {
    			 System.out.println("Not Decending");  
    		 }
    	 

    	
     }
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 int a[]=new int[10];
    	 System.out.println("Enter array elements");
    	 for(int i=0;i<a.length;i++) {
    		  a[i]=sc.nextInt();
    	 }
    	 ConstructorAs4 obj=new ConstructorAs4(a);
     }
}
