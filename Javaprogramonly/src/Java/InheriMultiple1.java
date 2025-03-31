package Java;
/* Define a superclass Animal with a method makeSound(). Create a subclass Dog inheriting from Animal. Override the makeSound() method in Dog to
 *  make it print "Woof".  */

class Animal
{
	public void makeSound()
	{
		System.out.println("woof");
	}
}
class Dog extends Animal
{
	
}
public class InheriMultiple1 {
      public static void main(String[] args) {
    	  Dog obj=new Dog();
    	  obj.makeSound();
	}
}
