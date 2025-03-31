package javabasicallprograms;
import java.util.*;
public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,4,6,7,3,8,5,9,10,11,12,13,11,7};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Remove duplicate no="+a[i]);
				}
			}
		}

	}

}
