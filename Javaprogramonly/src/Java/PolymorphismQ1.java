package Java;
/*  Q1.Write a simple program in Java demonstrating polymorphism using method overriding  */
class polym
{
	public void code1(int a,int b)
	{  System.out.println("Parent");
		System.out.println(a-b);
	}
}

public class PolymorphismQ1 extends polym{
     public void code1(int a,int b)
     {System.out.println("Child");
    	 System.out.println(a+b);
     }
     public static void main(String[] args) {
		polym obj=new PolymorphismQ1();
		obj.code1(2, 3);
	}
}
