/*21. You need to write a Java method that will accept a String and a character to be removed 
and return a String, which doesn't has that character e.g remove(String word, char ch)*/

import java.util.*;
class RemoveCharFromStringUsingMethod
{
	static void removChar(String str, char c)
	{
		//String str;
		//char c;
		int n=str.length();
		char ch[]=str.toCharArray();
		System.out.println("String after delete character");
		for(int i=0;i<n;i++)
		{
			if(ch[i]==c)
			{
				
				continue;
			}
			
			//System.out.println(" ");
			System.out.print(ch[i]);
		}
	}
	public static void main(String args[])
	{
		String str;
		char c;
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter String");
		 str=sc.next();
		 
		System.out.println("Enter character");
		c=sc.next().charAt(0);
		 
		 removChar(str,c);
		
	}
}	
		