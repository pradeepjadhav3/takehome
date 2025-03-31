package Java;
class Constr6
{
	public void code1()
	{
		System.out.println("Even numbers:");
	}
}
public class ConstructorrAs6 extends Constr6{
      public void code2()
      {
    	  for (int i = 1; i <=100; i++) {
    		      int count=0;
			
			     if(i%2==0)
			     {
			    	 System.out.println(i);
			     }
			
			
		}
      }
      public static void main(String[] args) {
    	  ConstructorrAs6 obj=new ConstructorrAs6();
    	  obj.code1();
    	  obj.code2();
	}
}
