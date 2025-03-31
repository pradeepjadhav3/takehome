package Java;

import java.util.*;
class inheri2
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


public class Inheritance2 extends inheri2 {
	public void code2()
	{
		for(int i=0;i<a.length;i++)
		{
			    int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if(count==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}
	public static void main(String args[])
	{
		Inheritance2 obj=new Inheritance2();
		obj.code1();
		obj.code2();
		
		
	}

}
