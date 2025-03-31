package Java;
import java.util.Scanner;

class constrAs4
{

	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	String address;
	long sall;
	long mob;
	public void code1()
	{
		System.out.println("Enter employee id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name:");
		name=sc.nextLine();
		System.out.println("Enter employee address:");
		address=sc.nextLine();
		System.out.println("Enter employee sallery:");
		sall=sc.nextLong();
		System.out.println("Enter employee mobile no:");
		mob=sc.nextLong();
	}
		
	}
public class ConstructorrAs4 extends constrAs4{
	public void code2()
	{
		System.out.println("Roll no:"+id);
    	System.out.println("Name:"+name);
    	System.out.println("Address no:"+address);
    	System.out.println("Qualification no:"+sall);
    	System.out.println("mob no:"+mob);	
	}
	public static void main(String[] args) {
		ConstructorrAs4 obj=new ConstructorrAs4();
		obj.code1();
        obj.code2();
	}
}
