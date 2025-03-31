package Java;
/* Q13. Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. 
 fill A with first p smallest elements and fill B with remaining elements.
 Example:
 Input :
 int[] A = { 1, 5, 6, 7, 8, 10 }
 int[] B = { 2, 4, 9 }
 Output:
 Sorted Arrays:
 A: [1, 2, 4, 5, 6, 7]
 B: [8, 9, 10]   */
class inheriQ8
{
	 int[] a = { 1, 5, 6, 7, 8, 10 };
	 int[] b = { 2, 4, 9 };
	 int c[]=new int[a.length+b.length];
	int index=0;
	public void code1()
	{
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < b.length; k++) {
				
			
			c[index++]=a[i];
			c[index++]=b[k];
			}
		}
	}
}
public class InheritanceQ8 extends inheriQ8 {
    public void code2()
    {
    	for (int i = 0; i < c.length; i++) {
    		for (int k = 0; k < c.length; k++) {
				
			
			if(a[i]>a[k])
			{
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
		}
    	}
    }
    public static void main(String[] args) {
    	
		
	}
}
