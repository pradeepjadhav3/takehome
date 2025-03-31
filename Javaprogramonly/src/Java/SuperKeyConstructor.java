package Java;
class Parent1
{
	int id;
	String name;
	Parent1(int id,String name)
	{
	   this.id=id;
	   this.name=name;
	}
	public void disp()
	{
	System.out.println("id"+id+" name:"+name);	
	}
}
class child1 extends Parent1
{
	 int empid;int empsal;
	child1(int empid,int empsal)
	{
		super(7,"vivek");
		this.empid=empid;
		this.empsal=empsal;
	}
	public void deatils()
	{
		System.out.println("id"+id+" name:"+name+"employee id"+empid+"employee sal:"+empsal);
	}
}
public class SuperKeyConstructor {
         public static void main(String[] args) {
        	 child1 obj=new child1(20,2000);
        	
        	 
		}
}
