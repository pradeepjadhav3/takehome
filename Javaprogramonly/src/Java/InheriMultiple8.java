package Java;
/*Q1
   int a=123459; 

take n value input, multiply by n value with odd number and and divide by n value with even number and do the sum after each operation. 

   int a=123459 

   take n=2
   
   explanation: 
   
    1*2+2/2+3*2+4/2+5*2+9*2=  */
import java.util.Scanner;
class Inher
{
	Scanner sc=new Scanner(System.in);
	int n;int rev;
	public void code1()
	{
		System.out.println("Enter n digit number:");
		n=sc.nextInt();
	}

	
	}
	

class Inher1 extends Inher
{   
	int x;
	public void code3()
	{   int rem=0;int sum=0;
		for (int i = n; i!=0; i=i/10) {
			rem=i%10;
			if(rem%2==0)
			{
				x=rem/2;
				sum=sum+x;
				
			}
			else
			{
				x=rem*2;
				sum=sum+x;
				
			}
		}
		System.out.println("Sum:"+sum);
		
	}
}
public class InheriMultiple8 {
	public static void main(String[] args) {
		Inher1 obj=new Inher1();
		obj.code1();
		obj.code3();
		
	}
}
