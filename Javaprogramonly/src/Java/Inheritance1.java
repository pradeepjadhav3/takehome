package Java;

class inheri
{
	public void code2()
	{
	System.out.println("Parent class");
	}
}


public class Inheritance1 extends inheri {
    public void code1()
    {
    	System.out.println("child class");
    }
    public static void main(String args[])
    {
    	Inheritance1 obj=new Inheritance1();
    			obj.code1();
    	obj.code2();
    }
}



