package Java;

public class PolyMorphismMainMethodOverload {
public static void main()
{
System.out.println("main");	
}
public static void main(String args) {
	System.out.println("This is String args");
}
public static void main(String[] args) {
	main();
	main("args");
	System.out.println("This is String args[]");
}
}
