package javabasicallprograms;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter the any number to check prime or not");
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
        	System.out.println("Prime number");
        }
        
        else
        {
        	System.out.println("Not Prime number");
        }
		  
	}

}
