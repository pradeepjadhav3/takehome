package Java;
/* Q2. All the plaindrom element should be in left side and armstrong number should be in right side. 

int[] arr={153,121,131,11}
output: {121,131,11,153}   */
class Inherrr
{
	int[] a={153,121,131,11};
	
	public void code1()
	{
		
		for (int i = 0; i < a.length-1; i++)
		{
			 
			int rem=0;int rev=0;
			    for (int j = a[i]; j!=0; j=j/10)
			    {
					rem=j%10;
					rev=rev*10+rem;
				}
			    if(rev!=a[i])
			    {
			    	int temp=a[i];
			    	a[i]=a[i+1];
			    	a[i+1]=temp;
			    }
		}
			
	}
}
class Inher2 extends Inherrr
{
	public void code2()
	{
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
public class InheriMultiple9 {
	public static void main(String[] args) {
		Inher2 obj=new Inher2();
		obj.code1();
		obj.code2();
	}
}
