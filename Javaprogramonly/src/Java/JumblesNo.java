package Java;

import java.util.Scanner;

public class JumblesNo {
	Scanner sc=new Scanner(System.in);
	int n;int temp;
	
	public void code1()
	{
		System.out.println("Que 4.Answer");
		System.out.println("Enter number");
		 n=sc.nextInt();
		 temp=n;
	}
	public void code2()
	{   
		
		
		
		  int rem=0;int count=0;
		for (int i = n; i!=0;i=i/10) {
			rem=i%10;
			count++;		
		}
      int a[]=new int[count];
      int index=0;
		  int rem1=0;
		for (int i = n; i!=0;i=i/10) {
			rem1=i%10;
				a[index++]=rem1;	
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int count1=0;
		for (int i = 1; i < a.length-1; i++) {
			if((a[i]-a[i+1])!=1 && a[i]-a[i-1]!=1)
			{
				count1++;
			}
		}
		if(count1==0)
		{
			System.out.println("Jumbled no:");
		}
		else
		{
			System.out.println("Not Jumbled no:");	
		}
		
		
	}
	public static void main(String[] args) {
		JumblesNo obj=new JumblesNo();
		obj.code1();
		obj.code2();
	}
}
