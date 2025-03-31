
import java.util.Scanner;
class inheri3
{
	Scanner sc=new Scanner(System.in);
	int rollno;
	String name;
	String address;
	String qualif;
	long mob;
	public void code1()
	{
		System.out.println("Enter roll no:");
		rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter address:");
		address=sc.nextLine();
		System.out.println("Enter qualification:");
		qualif=sc.nextLine();
		System.out.println("Enter mobile no:");
		mob=sc.nextLong();
		
	}
}

public class Inheritance3 extends inheri3 {

	    public void code2()  
	    {
	    	System.out.println("Roll no:"+rollno);
	    	System.out.println("Name:"+name);
	    	System.out.println("Address no:"+address);
	    	System.out.println("Qualification no:"+qualif);
	    	System.out.println("mob no:"+mob);
	    }
	    public static void main(String args[])
	    {
	    	
	    }
}
