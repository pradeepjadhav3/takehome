package Java;
/*Q5.Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
If there is such a triplet present in array, then print the triplet and return true. Else return false.

Examples: 
 

Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9     */
class inherQ6
{
	int a[]= {12, 3, 4, 1, 6, 9};
	 int sum = 24;
	 int count;
	public boolean code1()
	{
		  count=0;
		for (int i = 0; i < a.length; i++) 
		{
				
		for (int j = i+1; j < a.length; j++)
		{
			for (int k = j+1; k < a.length; k++)
			{
				int s2 = (a[i]+a[j]+a[k]);
				
				
				if(s2 == sum)
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					count++;
					i=a.length;
					j=a.length;
					k=a.length;
					
				}
			}
			
		}
		}
		if(count == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
}
public class InheritanceQ6 extends inherQ6 {
	
	
	public static void main(String[] args) {
		InheritanceQ6 obj=new InheritanceQ6();
		if(obj.code1())
		{
		
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}

}
