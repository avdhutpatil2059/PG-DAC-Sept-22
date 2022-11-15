//20. Write a program to remove a given character from String?

import java.util.*;
class RemoveCharFromString
{
	public static void main(String args[])
	{
		String str;
		char c;
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter String");
		 str=sc.next();
		 
		System.out.println("Enter character");
		c=sc.next().charAt(0);
		 
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
}	
		