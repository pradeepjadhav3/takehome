package Java;
/* Develop a class Employee with attributes name and salary. Create a subclass Manager inheriting from Employee with an additional attribute
 *  department. Derive another subclass Executive from Manager with an attribute bonus.   */
import java.util.Scanner;
class Employee
{
	Scanner sc=new Scanner(System.in);
	String name,depe;
	int sall,bon;
	public void name()
	{
		System.out.println("Enter employee name:");
		 name=sc.nextLine();
	}
	public void salery()
	{
		System.out.println("Enter employee sallery:");
		 sall=sc.nextInt();
		
	}
}
class Manager extends Employee
{
	public void department()
	{     
		sc.nextLine();
		System.out.println("Enter employee department:");
		 depe=sc.nextLine();	
	}
}
class Executive extends Manager
{
	public void bonus()
	{
		System.out.println("Enter employee bonus:");
		 bon=sc.nextInt();		
	}
	public void print()
	{
		System.out.println("Employee name:"+name);
		System.out.println("Employee sallery:"+sall);
		System.out.println("Employee department:"+depe);
		System.out.println("Employee bonus:"+bon);
	
	}
}
public class InheriMultiple5 {
      public static void main(String[] args) {
    	  Executive obj=new Executive();
    	  obj.name();
    	  obj.salery();
    	  obj.department();
    	  obj.bonus();
    	  obj.print();
	}
}
