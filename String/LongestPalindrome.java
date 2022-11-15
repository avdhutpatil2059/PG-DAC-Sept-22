//22. Write a program to find the longest palindrome in a string?

import java.util.*;
class LongestPalindrome
{
	public static void main(String args[])
	{
		String str,str1;
		char c;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter string for longest palindrome");
		str=sc.nextLine();
		
		int n=str.length();
		str1=str.toLowerCase();
		
		int end=1;
		int start=0;
		int high;
		int low;
		
		for(int i=0;i<n;i++)
		{
			