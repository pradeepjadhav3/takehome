package Java;
import java.util.Scanner;
public class ReplaceElement {
	Scanner sc=new Scanner(System.in);
	int a[] = new int[7];
	int b[]=new int [a.length];
	public void code1()
	{
		System.out.println("Que 3.Answer");
		System.out.println("Enter array elements");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
		
	}
			// {1, 2, 3, 4, 5, 6, 7}
	}
	public void code2()
	{ 
		 for (int i = 0; i < a.length; i++) {
			 int mul=1;
			for (int j = 0; j < a.length; j++) {
				if(i!=j)
				{
				mul=mul*a[j];
				
				}
				
				}
			b[i]=mul;
			mul=1;
		
			
		}
		 for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		 
		
	}
	public static void main(String[] args) {
		ReplaceElement obj=new ReplaceElement();
		obj.code1();
		obj.code2();
	}
}
