package Java;
/*Design a class hierarchy for geometric shapes. Create a superclass Shape with methods to calculate area and perimeter. Derive subclasses 
 * Rectangle and Circle from Shape with appropriate methods.    */
import java.util.Scanner;
class Shape2
{
	Scanner sc=new Scanner(System.in);
	int Rarea;int Rper;double Carea;double Cper; int l;int w;int r;
	public void input1()
	{
		System.out.println("Enter length and width");
		l=sc.nextInt();
		w=sc.nextInt();
	}
	
	public void input2()
	{
		
		System.out.println("Enter radius of circle");
		r=sc.nextInt();
	
	}

	
	
}
class Rectangle2 extends Shape2
{
	public void Rarea()
	{
		Rarea=l*w;
		System.out.println("Aea of rectangle :"+Rarea);
	}
	public void Rperemeter()
	{
		Rper=2*(l+w);
		System.out.println("Peremeter of rectangle :"+Rper);
	}

}
class Circle extends Shape2
{
	public void Carea()
	{
		Carea=3.14*r*r;
		System.out.println("Aea of circle :"+Carea);
	}
	public void Cperemeter()
	{
		Cper=2*3.24*r;
		System.out.println("Aea of rectangle :"+Cper);
	}
}
public class InheriMultiple4 {
     public static void main(String[] args) {
		Rectangle2 obj=new Rectangle2();
		obj.input1();
		obj.Rarea();
		obj.Rperemeter();
		
		Circle ob=new Circle();
		ob.input2();
		ob.Carea();
		ob.Cperemeter();
	}
}
