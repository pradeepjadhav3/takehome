package Java;
/*  Create a class Employee with attributes name and designation. Derive two subclasses Manager and Clerk from Employee, each with its own 
 * specific methods such as approveLeave() for manager and updateRecords() for clerk.*/
import java.util.Scanner;
class Employee1
{
	Scanner sc=new Scanner(System.in);
	String name,dest;
	public void name()
	{
		System.out.println("Enter name:");
		name=sc.nextLine();
	}
	public void designation()
	{
		sc.nextLine();
		System.out.println("Enter Destination:");
		dest=sc.nextLine();
	}
}
class Manager1 extends Employee1
{
	public void approveLeave()
	{
		System.out.println("leave apporoved of :"+name);
		name=sc.nextLine();
	}
	
}
class Clerk extends Employee1
{
	public void updateRecords()
	{
		System.out.println("Records updated:");
	}
}

public class InheriMultiple7 {
     public static void main(String[] args) {
    	 Manager1 obj=new Manager1();
    	 obj.name();
    	 obj.designation();
    	 obj.approveLeave();
    	 Clerk ob=new Clerk();
    	 ob.updateRecords();
	}
}
