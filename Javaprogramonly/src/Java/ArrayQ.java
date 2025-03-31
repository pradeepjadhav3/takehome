package Java;
/* Write a program that takes in an array of integers and returns the maximum product of any three elements in the array.  */
import java.util.Scanner;
public class ArrayQ {
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
		  int max=a[0];
		  int smax=a[1];
		  int tmax=a[2];
		   for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				tmax=smax;
				smax=max;
				max=a[i];
			}
			else if((a[i]>smax) && (a[i]!=max))
			{
				tmax=smax;
				smax=a[i];
			}
			else if((a[i]>tmax) && (a[i]!=smax) &&(a[i]!=tmax))
			{
				tmax=a[i];
			}
		}
		   System.out.println("Maximum product of three element:"+(tmax*smax*max));
	   }
	   public static void main(String[] args) {
		   ArrayQ obj=new ArrayQ();
		   obj.code1();
		   obj.code2();
	}
}
