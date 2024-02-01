package Java;
import java.util.Scanner;
public class Factorial {
//1!+2!+3!/3!
	public static void main(String[] args) {
		System.out.println("Enter number for to calclulate factorial");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("Enter number for to calclulate factorial");
		int number1=sc.nextInt();
		System.out.println("Enter number for to calclulate factorial");
		int number2=sc.nextInt();		
		System.out.println("Enter number for to calclulate factorial");
		int number3=sc.nextInt();		
		int fact=1;
		int fact1=1;
		int fact2=1;
		int fact3=1;
       for(int i=1;i<=number;i++)
       {
    	   fact=fact*i;
       }      
      for(int j=1;j<=number1;j++)
      {
    	fact1=fact1*j;
      }
      for(int k=1;k<=number2;k++)
      {
    	  fact2=fact2*k;
      }
      for(int x=1;x<=number2;x++)
      {
    	  fact3=fact3*x;
      }
      System.out.println("factorial number="+fact);
      System.out.println("factorial number="+fact1);
      System.out.println("factorial number="+fact2); 
      System.out.println("factorial number="+fact3); 
      int result=(fact+fact1+fact2)/fact3;
      System.out.println("Final result="+result);
	}
      
	}
   
	


 