package Java;
import java.util.Scanner;
 class inheri4
{
	 Scanner sc=new Scanner(System.in);
	 int a[]=new int[5];
	public void code1()
	{
		System.out.println("Enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
	}
}


public class Inheritance4 extends inheri4 {
	public void code2()
	{
		int max=a[0];
		int smax=a[1];
		for (int i = 0; i <a.length; i++) {
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
		System.out.println("Second max="+smax);
		
	}
	public static void main(String args[])
	{
		Inheritance4 obj=new Inheritance4();
				obj.code1();
		obj.code2();
	}

}
