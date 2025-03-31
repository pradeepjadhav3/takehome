package javabasicallprograms;

public class Max_minNumberArray {

	public static void main(String[] args) {
		int a[]= {1,3,5,6,7,8,0,57,21};
		int max=a[0];
		int min=a[0];
		for(int no:a)
		{
			if(no>max)
			{
				max=no;
				
			}
			else
			{
				min=no;
			}
		}
		
		System.out.println("Max no="+max);
		System.out.println("Min no="+min);

	}

}
