package onlyprograms;
import java.util.*;
//program for repeated chars
public class CountRepeatedChars
{

	public static void main(String[] args) {
	System.out.println("Enter the any string");
	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	char c[]=str1.toCharArray();
	TreeMap <Character,Integer> hm=new TreeMap<Character,Integer>();
	for(char r:c)
	{
		if(hm.containsKey(r))
		{
			hm.put(r, hm.get(r)+1);
		}
		
		else
		{
			hm.put(r, 1);
			
		}
	}
	
	System.out.println("Repeated String is="+hm);
	}

}
