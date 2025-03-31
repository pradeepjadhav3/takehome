package Java;

import java.util.Scanner;
class ConstrrAs1
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
public class ConstructorrAs1 extends ConstrrAs1 {
	public void code2()
	{
		int count=0;int count1=0;int count2=0;
		for (int i = 0; i < a.length; i++) {
		if(a[i]==0)
		{
			count++;
		}
		if(a[i]>0)
		{
			count1++;
		}
		if(a[i]<0)
		{
			count2++;
		}
		}
		System.out.println("Number of zeroes "+count);
		System.out.println("Number of positive no "+count1);
		System.out.println("Number of negative no "+count2);
	}
	public static void main(String[] args) {
		ConstructorrAs1 obj=new ConstructorrAs1();
		obj.code1();
		obj.code2();
	}

}
