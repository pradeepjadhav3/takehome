package Java;
/*  Q2.Implement a shape hierarchy in Java where each shape has a method calculateArea(). 
Demonstrate polymorphism by calling calculateArea() on different shape objects.   */


public class PolymorphismQ2 {
	
	public void calculateArea(int l,int w)
	{
		System.out.println("Area of rectangle="+l*w);
	}
	public void calculateAre(int r)
	{
		System.out.println("Area of circle="+3.14*r*r);
	}
      public static void main(String[] args) {
    	  PolymorphismQ2 obj=new PolymorphismQ2();
		obj.calculateArea(7, 9);
		obj.calculateAre(3);
	}
}
