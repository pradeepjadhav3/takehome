package Java;
import java.util.Scanner;
class super1
{
	Scanner sc=new Scanner(System.in);
     String name;
     int id;
     public void code()
     {
    	 System.out.println("Enter name:");
    	 name=sc.nextLine();
    	 System.out.println("Enter id:");
    	 id=sc.nextInt();
     }
}
class super2 extends super1
{
	String pos="mng";
	 int cabno=50;
	 String name=super.name;
	 int id=super.id;
	public void code1()
	{
		System.out.println(name+" "+id+" "+pos+" "+cabno);
	}
}
public class SuperKey1 {
public static void main(String[] args) {
	super2 obj=new super2();
	obj.code();
	obj.code1();
}
}
