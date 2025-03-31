package Java;
class poly
{
	public void code1(int a,int b)
	{
		System.out.println("Parent");
		System.out.println(a+b);
	}
}
public class PolymorphismMethodOverriding extends poly{
    public void code1(int a,int b)
    {
    	System.out.println("Child");
    	System.out.println(a+b);
    }
    
    public static void main(String[] args) {
    	poly obj=new PolymorphismMethodOverriding();
    	obj.code1(10, 20);
	}
}
