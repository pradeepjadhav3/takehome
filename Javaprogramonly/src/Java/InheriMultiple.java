package Java;
/* Create a superclass Vehicle with attributes make and model. Derive a subclass Car from Vehicle with an additional attribute numDoors.
 *  Implement a method to display all details of a car.  */
class Vehical
{
	public void make()
	{
		System.out.println("Made in India");
	}
	public void model()
	{
	System.out.println("Hundai");	
	}
}
class Car extends Vehical
{
	public void numdoors()
	{
		System.out.println("4 Doors");
	}
}
public class InheriMultiple {
     public static void main(String[] args) {
		Car obj=new Car();
		obj.make();
		obj.model();
		obj.numdoors();
	}
}
