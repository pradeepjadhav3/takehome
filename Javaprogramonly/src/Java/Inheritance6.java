package Java;

class inheri6
{
	int a[]= {1,2,3,4,5};
	int b[]=new int[a.length];
	 void code1()
	{
		
		System.out.println("Reversed array");
	}
}
public class Inheritance6 extends inheri6{
	public void code2()
	{
		int index=0;
		for (int i = a.length-1; i >=0; i--) {
			
				b[index++]=a[i];
			
			
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
			
		}
		
	}
	public static void main(String args[])
	{
		
	}

}
