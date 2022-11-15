//3. How to check if two Strings are anagrams of each other?

import java.util.*;
import java.util.Arrays;
class StringAnagram
{
	static void isAnagram(String str1, String str2)
	{
		int n1 = str1.length();
		int n2 = str2.length();
		
		if(n1!=n2)
		{
			System.out.println("String is not anagram--");
		    return;
		}
		
		
		char ch[]=str1.toCharArray();
		char ch1[]=str2.toCharArray();
		 Arrays.sort(ch);
        Arrays.sort(ch1);
		boolean res = Arrays.equals(ch, ch1);
		if (res == true){
			for(int i=0;i<n1;i++)
				{
					for(int j=0;j<n2;j++){		
					if(ch[i]==ch1[j])
					{
						System.out.println("String is anagram");
						return;
					}
					else
					{
					System.out.println("String is not anagram");
					//return;
					}
					}
				}
			
		}
		else System.out.println("String is not anagram");
			
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st String");
		String str1=sc.next();
		
		System.out.println("Enter 2nd String");
		String str2=sc.next();
		isAnagram(str1,str2);
	}
}	