package Java;

import java.util.Scanner;

class Constr11
{
	Scanner sc=new Scanner(System.in);
	   int a[]= new int[5];
	   int max;int min;
	   public void code1()
	 {
		 System.out.println("Enter array elements");
		 for(int i=0;i<a.length;i++)
		 {
			  a[i]=sc.nextInt();
		 }
		 
		  max=a[0];
		 for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		 System.out.println("max :"+max);
		  min=a[0];
		 for (int i = 0; i < a.length; i++) {
				if(a[i]<min)
				{
					min=a[i];
				}
			}
		 System.out.println("min :"+min);
		 
	 }
}
public class Constructorr11 extends Constr11{
     public void code2()
     {
    	 System.out.println("Table of max :");
    	 for (int i = 1; i <=10; i++) {
			System.out.println(+(i*max));
		}
    	 System.out.println("Table of min :");
    	 for (int i = 1; i <=10; i++) {
 			System.out.println(+(i*min));
 		}
     }
     public static void main(String[] args) {
    	 Constructorr11 obj=new Constructorr11();
    	 obj.code1();
    	 obj.code2();
	}
}
