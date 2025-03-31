package Java;

import java.util.Scanner;

class Constr
{
	Scanner sc=new Scanner(System.in);
	   int a[]= new int[5];
	   int max;int min;int smax;int smin;
	   public void code1()
	 {
		 System.out.println("Enter array elements");
		 for(int i=0;i<a.length;i++)
		 {
			  a[i]=sc.nextInt();
		 }
		 max=a[0];
		 smax=a[1];
		 for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				 smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				smax=a[i];
			}
		}
		 
		 
		 System.out.println("Second max :"+smax);
		  min=a[0];
		  smin=a[1];
		 for (int i = 0; i < a.length; i++) {
				if(a[i]<min)
				{
					 smin=max;
					min=a[i];
				}
				else if(a[i]<smin && a[i]!=min)
				{
					smin=a[i];
				}
			}
		 System.out.println("Second min :"+smin);
		 
	 }
}
	

public class Constructorr12 extends Constr{
      public void code2()
      {
    	  System.out.println("Table of smax :");
     	 for (int i = 1; i <=10; i++) {
 			System.out.println(+(i*smax));
 		}
     	 System.out.println("Table of smin :");
     	 for (int i = 1; i <=10; i++) {
  			System.out.println(+(i*smin));
  		}
    	  
      }
      public static void main(String[] args) {
    	  Constructorr12 obj=new Constructorr12();
    	  obj.code1();
    	  obj.code2();
	}
}
