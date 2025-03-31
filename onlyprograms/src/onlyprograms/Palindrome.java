package onlyprograms;

public class Palindrome {

	public static void main(String[] args) {
		String str1="mam";
		String rev="";
	 for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
			
		}
		System.out.println("Reverse string is="+rev);
		
		if(rev.equals(str1))
		{
			System.out.println("String is palindrome");
		}
		else
		{
		System.out.println("String is not palindrome");
		}
		}

	}


