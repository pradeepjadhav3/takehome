package javabasicallprograms;
import java.util.*;
public class Percentage {

	public static void main(String[] args) {
	System.out.println("Enter the 5 subject marks");
	Scanner sc=new Scanner(System.in);
	int sub1=sc.nextInt();
	int sub2=sc.nextInt();
	int sub3=sc.nextInt();
	int sub4=sc.nextInt();
	int sub5=sc.nextInt();
	int total=0;
	float percentage=0.0f;
	total=sub1+sub2+sub3+sub4+sub5;
	System.out.println("Total marks="+total);
	percentage=(float)total/5;
	System.out.println("Percentage="+percentage);
	int y=7;
	int x=++y+8;
	System.out.println("x="+x);
	char a='B';
	 a++;
	 System.out.println("a="+a);
	
	}

}
