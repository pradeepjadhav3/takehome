package Java;

public class InheritanceOverLoading {
    public void code1(int a)
    {
    	System.out.println(a);
    }
    public void code1(int a,int b)
    {
    	System.out.println(a+b);
    }
    public void code1(int a,int b,int c)
    {
    	System.out.println(a+b+c);
    }
    public void code1(String name,int a)
    {
    	System.out.println(name+" "+a);
    }
    public void code1(int a,String name)
    {
    	System.out.println(a+" "+name);
    }
    
    public static void main(String[] args) {
    	InheritanceOverLoading obj=new InheritanceOverLoading();
    	obj.code1("Vivek Patil",7);
    	obj.code1(9,"Vivek Patil");
    	
	}
}
