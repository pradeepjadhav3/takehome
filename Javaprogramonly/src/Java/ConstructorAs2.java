package Java;
import java.util.*;
public class ConstructorAs2 {

	     public ConstructorAs2(int a[])
	     {
	    	 int b[]=new int[a.length];
	    	 for(int i=0;i<a.length;i++)
	    	 {
	    		     int count=1;
	    		 for(int j=i+1;j<a.length;j++)
	    		 {
	    			 if(a[i]==a[j])
	    			 {
	    				 b[j]=-1;
	    				 count++;
	    			 }
	    		 }
	    		 if(b[i]!=-1)
	    		 {
	    			 b[i]=count;
	    		 }
	    	 }
//	    	 for(int i=0;i<a.length;i++)
//	    	 {
//	    		 if(b[i]!=-1)
//	    		 System.out.println(a[i]+"is repeated "+b[i]+" times"); 
//	    	 }
	    	 int max=0;int temp=0;
	    	 for(int i=0;i<a.length;i++)
	    	 {
	    		 if(b[i]!=-1)
	    		if(b[i]>max)
	    			max=b[i];
	    		    temp=i;
	    	 }
	    	 System.out.println("Mode of array:"+a[temp]);
//	    	 int max=0;
//	    	 for(int i=0;i<b.length;i++)
//	    	 {
//	    		    
//	    		  if(b[i]!=0)
//	    			 if(b[i]>max)
//	    			 {
//	    				 max=b[i];
//	    			 }
//	    			
//	    		 
//	    	 }
//	    	 System.out.println("Mode"+max);
	     }
	     public static void main(String args[])
	     {
	    	 Scanner sc=new Scanner(System.in);
	    	 int a[]=new int[10];
	    	 System.out.println("Enter array elements");
	    	 for(int i=0;i<a.length;i++) {
	    		  a[i]=sc.nextInt();
	    	 }
	    	 ConstructorAs2 obj=new ConstructorAs2(a);
	     }
}
