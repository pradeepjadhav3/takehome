package Java;
/*  Q3.Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3  */
class inheriQ7
{
	int a[] = {1,3,5,2,2};
	int n = 5;
	int lsum;
	int rsum;
     public void code1()
     { 
    	    for (int i = 0; i < n; i++) {
    	    	lsum=0;
				for (int j = 0; j <i; j++) {
					lsum=lsum+a[i];
				}
				rsum=0;
				for (int j = i+1; j < n; j++) {
					rsum=rsum+a[i];
				}
				if(lsum==rsum)
				{
					System.out.println("equilibrium:"+(i+1));
					
				}
			}
    	 
     }
}
public class InheritanceQ7 extends inheriQ7{
	
	public static void main(String args[])
	{
		InheritanceQ7 obj=new InheritanceQ7();
		obj.code1();
	}
	

}
