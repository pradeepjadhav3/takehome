package Java;
import java.util.Scanner;
class Constr7
{
	 int l;
	Scanner sc=new Scanner(System.in);
	public void code1()
	{
		System.out.println("Enter last number:");
		 l=sc.nextInt();
		 System.out.println("Sum of all odd number:");
	}
}
public class Constructorr7 extends Constr7 {
	 public void code2()
     {
		 int sum=0;
  	  for (int i = 1; i <=l; i++) 
  	  {
  		 if(i%2!=0)
	     {
  			 sum=sum+i;
	    	
	     }
			
		  }
  	System.out.println("Sum is"+sum);
     }
     public static void main(String[] args) {
  	   Constructorr7 obj=new Constructorr7();
  	   obj.code1();
  	   obj.code2();
	}
}
