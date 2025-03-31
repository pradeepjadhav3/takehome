package Java;
/*
Q3.Create a base class Animal with a method makeSound(). Subclass it to create Dog and Cat classes. Override the makeSound() method in each 
subclass to produce appropriate sounds. 
Demonstrate polymorphism by calling makeSound() on objects of each subclass.   */
class Animalx
{
	  public void makeSound(String sound)
	     {
	    	 System.out.println();
	     }
}
class Dogx extends Animalx
{
	 public void makeSound(String sound)
     {
    	System.out.println("Bhoww Bhoww...."); 
     }
}
class Cat extends Animalx
{
	 public void makeSound(String sound)
     {
    	 System.out.println("Meow..");
     }
}
public class PolymorphismQ3 {
   public static void main(String[] args) {
	Animalx obj=new Dogx();
	obj.makeSound("");
	Animalx ob=new Cat();
	ob.makeSound("");
	
}
}
