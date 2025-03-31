package Java;
/*  Q9.Given an array of integers. All numbers occur twice except one number which occurs once. Find the number in O(n) time & constant extra space.

Example : 

Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2   */
class inheriQ9
{
	int a[] = {2, 3, 5, 4, 5, 3, 4};
	int b[]=new int[a.length];
	public void code1()
	{
		
	}
}
public class InheritanceQ4 extends inheriQ9 {
	public void code2()
	{
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j])
				{
					b[j]=-1;
					count++;
				}
			}
			if(b[i]!=-1)
			{
				b[i]=count;
			}
			
			
		}
		for (int i = 0; i < b.length; i++) {
			if(b[i]==-1)
			System.out.println(a[i]);
			break;
			
			
		}
	}
	public static void main(String args[])
	{
		InheritanceQ4 obj=new InheritanceQ4();
		obj.code1();
		obj.code2();
	}

}
