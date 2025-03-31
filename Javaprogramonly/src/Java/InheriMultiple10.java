package Java;
/* Q3 wap to print check whether the element is plaindrom or not, if the element is palindrom find the sum of the element , if not then find the
 *  average of the element. 

int[] arr={121, 133, 131}
output: 
      121-> Palindrom->sum: 3
      133-> Not plaindrom-> Avg: 2
      131-> Palindrom-> sum: 5  */
class Inher10
{ 
	int[] a={121, 133, 131};
	public void code1()
	{
		for (int i = 0; i < a.length; i++)
		{
			 
			int rem=0;int rev=0;int sum=0;int count=0;double avg=0;
			    for (int j = a[i]; j!=0; j=j/10)
			    {
					rem=j%10;
					rev=rev*10+rem;
					sum=sum+rem;
					count++;
					avg=sum/count;
				}
			    if(rev==a[i])
			    {
			    	
			    	System.out.println(a[i]+" is Plaindrome and its sum of digits is:"+sum);
			    	
			    	
			    }
			    else
			    {
			    	System.out.println(a[i]+" is not Plaindrome and its average of element is:"+avg);	
			    }
		}
	}
}
public class InheriMultiple10 extends Inher10{
        public static void main(String[] args) {
        	InheriMultiple10 obj=new InheriMultiple10();
        	obj.code1();
		}
}
