package Java;
/*  Create a class Shape with attributes length and width. Derive a subclass Rectangle from Shape with a method calculateArea() to compute and 
 * return the area of the rectangle.  */
class Shape
{ int l;int w;
	public void length()
	{
		l=20;
	}
	public void width()
	{
		w=10;
	}
}
class Rectangle extends Shape
{
	public void calculateArea()
	{
		System.out.println("Area of rectangle:"+(l*w));
	}
}
public class InheriMultiple2 {
	
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.length();
		obj.width();
		obj.calculateArea();
	}
}
