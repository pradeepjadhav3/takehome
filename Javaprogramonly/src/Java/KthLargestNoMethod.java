package Java;
import java.util.Scanner;
public class KthLargestNoMethod {
Scanner sc=new Scanner(System.in);
	int k;
	int a[] = new int[5];
	public void code1()
	{
		
		System.out.println("Enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
	}
		public void code2()
		{
			for (int i = 0; i < a.length-1; i++) {
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			
			System.out.println("Enter value of k");
		   k=sc.nextInt();
			System.out.println("Kth smallest is value "+(k));
		}
		
		
	
	public static void main(String[] args) {
		KthLargestNoMethod obj=new KthLargestNoMethod();
		obj.code1();
		obj.code2();
	}
}
