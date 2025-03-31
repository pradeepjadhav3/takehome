package Java;
import java.util.Scanner;
public class ConstructorAs1 {
       Scanner sc=new Scanner(System.in);
	        public ConstructorAs1()
	        {
	        	int a[]= {1,2,3,4,5,6,7,8,9,10};
	        	System.out.println("Enter number");
	        	int n=sc.nextInt();
	        	int c[]=new int[a.length];
	        	int j=0;
	        	for(int i=0;i<a.length;i++)
	        	{
	        		if(a[i]<n)
	        		{ 
	        			c[j++]=a[i];
	        			
	        			
	        		}
	        	}
	        	for(int i=0;i<a.length;i++)
	        	{
	        		if(c[i]!=0)
	        		System.out.print(c[i]+" ");	
	        	}
	        }
	        public static void main(String args[])
	        {
	        	ConstructorAs1 obj=new ConstructorAs1();
	        }
}
