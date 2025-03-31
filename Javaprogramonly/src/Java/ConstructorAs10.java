package Java;

import java.util.Scanner;

public class ConstructorAs10 {
	Scanner sc=new Scanner(System.in);
	public ConstructorAs10(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Enter kth element");
		int n=sc.nextInt();
		System.out.println("kth smallest element is"+a[n-1]);
		
	}
	
	public static void main(String args[])
    {
   	 Scanner sc=new Scanner(System.in);
   	 int a[]=new int[5];
   	 System.out.println("Enter array elements");
   	 for(int i=0;i<a.length;i++) {
   		  a[i]=sc.nextInt();
   	 }
   	 ConstructorAs10 obj=new ConstructorAs10(a);
    }
}
