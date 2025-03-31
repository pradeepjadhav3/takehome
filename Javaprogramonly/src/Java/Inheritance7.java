package Java;



class inheri7
{
	int a[]= {1,2,3,4,5};
	public void code1()
	{
		System.out.println("Shift array");
		
	}
	
}

public class Inheritance7 extends inheri7{
	public void code2()
	{
		int temp=a[0];
		for (int i = 0; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
	
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}
}
	public static void main(String args[]) {
	Inheritance7 obj=new Inheritance7();
			obj.code1();
			obj.code2();
	}

}
