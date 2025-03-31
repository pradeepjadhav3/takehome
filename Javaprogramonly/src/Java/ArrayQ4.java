package Java;
/*  
4. Write a Java program to find the sum of the prime numbers between 100 and 200, but only consider the prime numbers that have a digit sum 
greater than 10. Print the sum of those prime numbers.
 */
public class ArrayQ4 {
	int f=100;
	int l=200;
     public void code1()
     {
    	 int sum1=0;
    	 for (int i = f; i <= l; i++) {
			int count=0;
    		    for (int j = 2; j < i; j++) {
					if(i%j==0) {
						count++;
					}
				}
    		    if(count==0)
    		    {
    		    	int rem=0;int sum=0;
    		    	for (int j = i; j !=0 ; j=j/10) {
						rem=j%10;
						sum=sum+rem;
					}
    		    	if(sum>10)
    		    	{
    		    		System.out.println(i);
    		    		sum1=sum1+i;
    		    	}
    		    	
    		    }
		}
    	 System.out.println("Sum="+sum1);
    	 
     }
     public static void main(String[] args) {
    	 ArrayQ4 obj=new ArrayQ4();
    	 obj.code1();
    	 
	}
}
