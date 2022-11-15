//14. How to reverse words in a sentence without using a library method?

import java.util.*;
class ReverseWord
{
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter word ");
		str=sc.next();
		
		int n=str.length();
		char ch[]=str.toCharArray();
		
		System.out.println("\nWord after reverse");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}	