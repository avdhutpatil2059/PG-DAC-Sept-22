/*25. This question is asked by Facebook. Given a string, return whether or not it forms a 
palindrome ignoring case and non-alphabetical characters.*/

import java.util.*;
class StringPalindromeIgnoringCase
{
	static boolean stringPalindrome(String str)
	{
		int n=str.length();
		int low=0;
		int high=n-1;
		str=str.toLowerCase();
		
		while(low<=high)
		{
			char lowchar=str.charAt(low);
			char highchar=str.charAt(high);
			
			if(!(lowchar>='a' && lowchar>='a'))
			{
				low++;
			}
			else if(!(highchar>='a' && highchar>='a'))
			{
				high--;
			}
			
			else if(lowchar==highchar)
			{
				low++;
				high--;
			}
			
			else
				return false;
		}
			return true;
	}
			
	
	
	public static void main(String args[])
	{
		String str;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String:");
		
		str=sc.nextLine();
		
		if(stringPalindrome(str))
			System.out.println(" String is palindrome");
		else
			System.out.println(" String is not palindrome");	
	}
}
		
		