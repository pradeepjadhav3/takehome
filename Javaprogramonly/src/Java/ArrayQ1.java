package Java;

import java.util.Scanner;

public class ArrayQ1 {

	Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
	   public void code1()
	   {
		   System.out.println("Enter array elements:");
		   for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();	
		}
		   
		
		   
	   }
	   public void code2()
	   {
		  int min=a[0];
		  int smin=a[1];
		  int tmin=a[2];
		   for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				tmin=smin;
				smin=min;
				min=a[i];
			}
			else if((a[i]<smin) && (a[i]!=min))
			{
				tmin=smin;
				smin=a[i];
			}
			else if((a[i]<tmin) && (a[i]!=smin) &&(a[i]!=min))
			{
				tmin=a[i];
			}
		}
		  
		   System.out.println("Minimum product of three element:"+(tmin*smin*min));
	   }
	   public static void main(String[] args) {
		   ArrayQ1 obj=new ArrayQ1();
		   obj.code1();
		   obj.code2();
	}
}


