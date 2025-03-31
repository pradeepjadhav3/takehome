package Java;
/* 2. Wap to print the prime series between 10-20, but only till two two digit from starting and find the sum of those two numbers.
  
   input : a=10 , b=20;

   output: 11, 13 
          Sum= 24 
          
           *
           */
public class ArrayQ3 {

	    int f=30;int l=50;int sum=0;int count1=0;
	    public void code1()
	    {
	    	for (int i = f; i <=l; i++) {
				
	    		int count=0;
	    		for (int j = 2; j<i; j++) {
	    			if(i%j==0)
	    			{
	    				count++;
	    				break;
	    			}
					
				}
	    		
	    		if(count==0)
	    		{
	    			 
	    			if(i>=10)
	    			{
	    				count1++;
	    				if(count1<=3)
	    				{
	    				System.out.println(i);
	    				sum=sum+i;
	    				}
	    			}
	    		}
	    		
	    		
	    		
			}
	    	System.out.println("Sum is:"+sum);
	    }
	 
	    public static void main(String[] args) {
	    	ArrayQ3 obj=new ArrayQ3();
	    	obj.code1();
		}
}
