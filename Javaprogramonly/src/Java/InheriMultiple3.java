package Java;
/*   Define a class Animal with a method eat(). Create a subclass Mammal inheriting from Animal and add a method giveBirth(). Finally, create a 
 * subclass Dog inheriting from Mammal and add a method bark(). */
class Animal1
{
	public void eat()
	{
		System.out.println("Eat");
	}
}
class Mammal extends Animal1
{
	public void giveBirth()
	{
	System.out.println("Givebirth");	
	}
}
class Dog1 extends Mammal
{
	public void bark()
	{
		System.out.println("Bark");
	}
}
public class InheriMultiple3 {
         public static void main(String[] args) {
        	 Dog1 obj=new Dog1();
        	 obj.eat();
        	 obj.giveBirth();
        	 obj.bark();
		}
}
