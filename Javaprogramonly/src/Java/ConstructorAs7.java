package Java;

import java.util.Scanner;

public class ConstructorAs7 {
	Scanner sc=new Scanner(System.in);
	 public ConstructorAs7(int a[])
    {  
		
		
		int count1=0;
   	 for(int i=0;i<a.length-1;i++)
   	 {
   		     int count=0;
   		  for(int j=2;j<a[i];j++)
   		  {
   			  if(a[i]%j==0)
   			  {
   				  count++;
   				  break;
   			  }
   			  
   		  }
   		  if(count==0 && i!=0)
   		  {
   			  count1++;
   		  }	 
   	 }
   	int c[]=new int[count1];
   	 
   	 int index=0;
   	 for(int i=0;i<a.length-1;i++)
   	 {
   		     int count=0;
   		  for(int j=2;j<a[i];j++)
   		  {
   			  if(a[i]%j==0)
   			  {
   				  count++;
   				  break;
   			  }
   			  
   		  }
   		  if(count==0 && i!=0)
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
   	 ConstructorAs7 obj=new ConstructorAs7(a);
    }
}
