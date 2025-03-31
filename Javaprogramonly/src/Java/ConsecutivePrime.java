package Java;

import java.util.Scanner;

public class ConsecutivePrime {
	Scanner sc=new Scanner(System.in);
	public void code1()
	{
		System.out.println("Enter value of N");
		int n=sc.nextInt();
		for (int i = 0; i <= n; i++) {
			 int count=0;
			for(int j=2;j<n;j++)
			{
				if(i%j==0) {
					count++;
				}
		}
			if(count==0)
			{   int index=0;
				for (int j = 0; j <=i; j++) {
					int count1=0;
					for (int k = 2; k <i ; k++) {
						if(j%k==0)
						{
							count1++;
						}
						
					}
					if(count1==0)
					{
						int a[]=new int[n];
						a[index++]=j;	
					}
					
				}
			}
		
		}
		
	}
	public static void main(String[] args) {
		
	}

}
