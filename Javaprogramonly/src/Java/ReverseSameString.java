package Java;

//program for to print reverse of same string e.g abc def o/p should be cba fed

import java.util.*;

public class ReverseSameString
{
public static void main(String args[])
{

System.out.println("Enter any string to reverse e.g abc def");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
//String s="abc def";
String str[]=s.split("\\s");
for(int i=0;i<=str.length;i++)
{
//System.out.println(str[i]);
StringBuffer sb=new StringBuffer(str[i]);  
System.out.println("Reverse string is:->"+sb.reverse());
}
}

}





