package Java;
import java.util.*;
class Arr1
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
class Arr2 extends Arr1
{
	public void code2()
	{
		System.out.println("Array elements are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}	
}
public class InheritanceMultipleArr1 extends Arr2 {
	public void code3()
	{
		int max= a[0];
		for (int j = 0; j < a.length; j++) {
			if(a[j]>max)
			{
				max=a[j];
			}
		}
		System.out.println("Maximum array is:"+max);
	}
	public static void main(String[] args) {
		InheritanceMultipleArr1 obj=new InheritanceMultipleArr1();
		obj.code1();
		obj.code2();
		obj.code3();
	}

}
