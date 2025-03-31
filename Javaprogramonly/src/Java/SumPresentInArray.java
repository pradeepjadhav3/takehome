package Java;

public class SumPresentInArray {
	int a[]={3,2,2},b[]= {1,5,7,7,9};
    public void code()
    {System.out.println("Que.10");
	    for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				  int temp=a[i]+b[j];
				     
				       for (int k = 0; k < a.length; k++) {
						 for (int l = 0; l < b.length; l++) {
							if(temp!=a[k] ||temp!=b[l])
							{
								System.out.println(a[i]+" "+b[j]);
								i=a.length;
								j=b.length;
								k=a.length;
								l=b.length;
							}
						}
					}
			}
		}
    }
    public static void main(String[] args) {
    	SumPresentInArray obj=new SumPresentInArray();
    	obj.code();
	}
}
