package Java;
/*  Given an array of size N filled with numbers from 1 to N-1 in random order. The array has only one 
 * repetitive element. The task is to find the repetitive element.

Examples:

Input: a[] = {1, 3, 2, 3, 4}
Output: 3  */
import java.util.*;
class inheriQ1
{
	int  a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	public void code1()
	{
		
		System.out.println("Enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
	}
}
public class InheritanceQ1 extends inheriQ1 {
  public void code2()
  {
	  for(int i=0;i<a.length;i++)
	  {
		  for (int j = i+1; j < a.length-1; j++) {
			if(a[i]==a[j])
			{
				System.out.println("Repeatative element:"+a[i]);
				break;
			}
		  }
	  }
  }
  public static void main(String args[])
  {
	  InheritanceQ1 obj=new InheritanceQ1();
	  obj.code1();
	  obj.code2();
	  
  }
}
