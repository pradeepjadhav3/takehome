package Java;
/*  Q7.Given two unsorted arrays that represent two sets (elements in every array are distinct), find the 
 * union and intersection of two arrays.

Example: 

arr1[] = {7, 1, 5, 2, 3, 6} 
arr2[] = {3, 8, 6, 20, 7} 
Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6, 7}. Note that 
the elements of union and intersection can be printed in any order. */
class inheriQ2
{
	int a[] = {7, 1, 5, 2, 3, 6}; 
	int b[] = {3, 8, 6, 20, 7};
	int c[]=new int[a.length+b.length];
	public void code1()
	{ 
		int count1;
		System.out.println("Intersection:");
	       for (int i = 0; i < a.length; i++) {
	    	   count1=0;
	    	   for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					count1++;
				}
			}
	    	 if(count1>0) 
	    	   {
	    		   System.out.println(a[i]);
	    	   }
			
		}
	}
}
public class InheritanceQ2 extends inheriQ2 {
  
	    public void code2()
	    {
	    	 System.out.println("Union:");
	    	 int index=0;
	    	for (int i = 0; i < a.length; i++) {
	    		int count=0;
	    		for (int j = 0; j < b.length; j++) {
	    		if(a[i]==b[j])
	    			{
                       count++;
	    			}
					
				}
	    		if(count==0)
	    			System.out.println(a[i]);
	    		}
	    	
	    	for (int j = 0; j < b.length; j++) {
				
				
		    	System.out.println(b[j]);
		    	}
			}
	    	
	    
	    public static void main(String args[])
	    {
	    	InheritanceQ2 obj=new InheritanceQ2();
	    	obj.code1();
	    	obj.code2();
	    }
}
