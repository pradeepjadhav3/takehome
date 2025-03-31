package Java;

import java.util.Scanner;

class constructrrAs2
{
	Scanner sc=new Scanner(System.in);
	   int a[]= new int[5];
	public void code1()
	{
		System.out.println("Enter array elements");
		 for(int i=0;i<a.length;i++)
		 {
			  a[i]=sc.nextInt();
		 }
		
	}
}
public class ConstructorrAs2 extends constructrrAs2{
   public void code2()
   {
	   int sum=0;
	   System.out.println("Sum of array elements");
	   for (int i = 0; i < a.length; i++) {
		   sum=sum+a[i];
	 
	   }
	   System.out.println("Sum is:"+sum);
	   System.out.println("This is example of single level constructor");
   }
   public static void main(String[] args) {
	   ConstructorrAs2 obj=new ConstructorrAs2();
	   obj.code1();
	   obj.code2();
		   
	   
}
}
