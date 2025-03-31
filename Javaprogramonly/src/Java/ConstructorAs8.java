package Java;

import java.util.Scanner;

public class ConstructorAs8 {
         
	     public ConstructorAs8(int a[])
	     {
	    	  int max=0;
	    	 for(int i=0;i<a.length;i++) {
	    		 if(a[i]>max)
	    		 {
	    			 max=a[i];
	    		 }
	    	 } 
	    	 
	    	 int x=0;int b=1;int c;int count=0;
	    	 for(int i=x;i<=max;i++) {
	    		 if(x<=max) {
	    		
	    		      count++;
	    		      c=x+b;
	    		      x=b;
	    		      b=c;
	    		 }
	    	 }
	    	 
	    	 int n[]=new int[count];
	    	 int index=0;
	    	 int p=0;int q=1;int r;
	    	 for(int i=p;i<=max;i++) {
	    		 if(p<=max) {
	    			
	    		   n[index++]=p;
	    		
	    		      
	    		      r=p+q;
	    		      p=q;
	    		      q=r;
	    		 }
	    		        
	    	 }
	    	 
	    	
	    	 
	    	 
	    	 for(int i=0;i<a.length;i++)
	       	 {
	    		 for(int j=0;j<n.length;j++)
		       	 {
	    			 if(a[i]==n[j])
	    			 {
	       		         System.out.print(a[i]+" ");
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
	    	 ConstructorAs8 obj=new ConstructorAs8(a);
	     }
}
