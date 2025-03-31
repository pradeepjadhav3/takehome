package javabasicallprograms;
import java.util.*;
public class Fibonacciseries {

	public static void main(String[] args) {
    System.out.println("Enter range of fibonaccies series");
    Scanner sc=new Scanner(System.in);
    int range=sc.nextInt();
    int no1=0,no2=1,no3;
    for(int i=2;i<=range;i++)
    {
    	//System.out.println(+no1+ " "+no2);
    	no3=no1+no2;
    	System.out.println("fibonace="+no3);
    	no1=no2;
    	no2=no3;
    	
    }
    		
	}

}
