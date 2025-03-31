package Java;

class SuperK1
{
	public void code1()
	{
		System.out.println("Method 1");
	}
}
class SuperK2 extends SuperK1
{
	public void code2()
	{   
		    super.code1();
		System.out.println("Method 2");
	}
}
public class SuperKey3 {
public static void main(String[] args) {
	SuperK2 obj=new SuperK2();
	obj.code2();
}
}

