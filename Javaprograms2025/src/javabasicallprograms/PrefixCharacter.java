package javabasicallprograms;
 import java.util.*;
public class PrefixCharacter {
	public static void main(String args[]) {
   String str[]= {"flower","flow","flight"};
   String result="";
   boolean flag=false;
    for(int i=0;i<4;i++)
    {
    	if(str[0].charAt(i)==str[1].charAt(i))
    	{
    		if(str[1].charAt(i)==str[2].charAt(i))
    		{
    			result=result+str[0].charAt(i);
    			flag=true;
    		}
    	}
         if(flag==false)
         {
        	 break;
         }
    }
    System.out.println(result);

	}
}

