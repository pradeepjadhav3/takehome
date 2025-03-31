package Java;
/*  Given an array of N integers, and a number sum, the task is to find the number of pairs of integers 
   in the array whose sum is equal to sum.

Examples:  

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2  */
class inheriQ5
{
	int a[] = {1, 5, 7, -1};
	int sum = 6;
	public void code1()
	{
		System.out.println("Sum of elements is equal to inputed sum number");
	}
}
public class InheritanceQ5 extends inheriQ5{
	public void code2()
	{
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==sum)
				{count++;
					
				}
			}
		}System.out.println(count);
		
	}
	public static void main(String args[])
	{
		InheritanceQ5 obj=new InheritanceQ5();
		obj.code1();
		obj.code2();
	}

}
