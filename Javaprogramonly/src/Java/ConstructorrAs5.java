package Java;
import java.util.*;
class Constr5
{
	 int l;
	Scanner sc=new Scanner(System.in);
	public void code1()
	{
		System.out.println("Enter last number:");
		 l=sc.nextInt();
		
	}
}

public class ConstructorrAs5 extends Constr5 {
	
       public void code2()
       {
    	  for (int i = l; i >=1; i--) 
    	  {
			System.out.println(i);
		  }
       }
       public static void main(String[] args) {
    	   ConstructorrAs5 obj=new ConstructorrAs5();
    	   obj.code1();
    	   obj.code2();
	}
}
