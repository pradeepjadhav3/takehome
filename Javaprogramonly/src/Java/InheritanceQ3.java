package Java;
/*  Q8.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples: 

Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80    */
class inheriQ3
{
	int a[] = {1, 5, 10, 20, 40, 80};
	int b[] = {6, 7, 20, 80, 100}; 
	int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
	public void code1()
	{
		System.out.println("Common elements:");
	}
}
public class InheritanceQ3 extends inheriQ3{
    public void code2()
    {
    	for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {
					if(a[i]==b[j] && b[j]==c[k])
					{
						System.out.println(a[i]);
					}
				}
			}
		}
    }
    public static void main(String args[])
    {
    	InheritanceQ3 obj=new InheritanceQ3();
    	obj.code1();
    	obj.code2();
    }
}
