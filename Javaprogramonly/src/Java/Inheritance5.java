package Java;

import java.util.Scanner;

class inheri5
{
	Scanner sc=new Scanner(System.in);
	 int a[]=new int[10];
	 int z=(a.length/2);
	public void code1()
	{
		System.out.println("Enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
	}
}
public class Inheritance5 extends inheri5 {
   public void code2()
   {
	   int count=0; 
	   for (int i = 0; i < a.length; i++) {
		
		   
		   for (int j =i+1; j < a.length; j++) {
			if(a[i]==a[j])
			{
				count++;
			}
			
			 
		}
		   if(count>z)
		   {
			   System.out.println("Majority:"+a[i]);
			   break;
			   
		   }
		   
	}
   }
   public static void main(String args[]) {
	   Inheritance5 obj=new Inheritance5();
	   obj.code1();
	   obj.code2();
   }
}
