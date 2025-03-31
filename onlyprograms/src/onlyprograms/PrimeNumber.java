package onlyprograms;

import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
	System.out.println("Enter any number to check prime or not");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	int count=0;
	for(int i=1;i<=no;i++)
	{
    if(no%i==0)
    {
    	count++;
    }
	
	}
	if(count==2)
	{
		System.out.println("Number is prime="+no);
		
	}
	else
	{
		System.out.println("Numbe is not prime="+no);
	}
	sc.close();
}
}
