package Java;
import java.util.Scanner;
public class RearrangeElement {
	Scanner sc=new Scanner(System.in);
	int a[] = new int[11];
	public void code1()
	{	System.out.println("Que 2.Answer");
		System.out.println("Enter array elements");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	}
	public void code2()
	{
		for (int i = 1; i < a.length; i=i+2) {
			if(a[i]<a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;			
			}
			if(a[i]<a[i-1])
			{
				int temp1=a[i];
				a[i]=a[i-1];
				a[i-1]=temp1;			
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		RearrangeElement obj=new RearrangeElement();
		obj.code1();
		obj.code2();
	}
}
