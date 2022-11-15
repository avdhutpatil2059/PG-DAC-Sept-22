/*17. How to check if a String is a valid shuffle of two String?
18. For example, given first = "abc" and second = "def", third = "dabecf" is a valid shuffle 
since it preserves the character ordering of the two strings*/

import java.util.*;
class StringShuffle
{
		static void isShuffle(String str1, String str2,String str3)
	{
		int n1 = str1.length();
		int n2 = str2.length();
		char res[]=new char[n1+n2];
		int n3 = str3.length();
		int sum=n1+n2;
		
		if(n3!=sum)
		{
			System.out.println("wrong string enter");
		    //return;
		}
		
		
		//char ch[]=str1.toCharArray();
		//char ch1[]=str2.toCharArray();
		//char res[]=str2.toCharArray();
		char ch2[]=str3.toCharArray();
		 //Arrays.sort(ch);
        Arrays.sort(res);
		Arrays.sort(ch2);
 
		boolean res1 = Arrays.equals(res,ch2);
		if (res1 == true)
		{
			for(int i=0;i<sum;i++)
			{
				for(int j=0;j<sum;j++)
				{		
					if(res[i]==ch2[j])
					{
						System.out.println("valid shuffle");
						return;
					}
					else
					{
						System.out.println("not valid shuffle");
						return;
					}
				}
			}
		}		
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st String");
		String str1=sc.next();
		
		System.out.println("Enter 2nd String");
		String str2=sc.next();
		
		System.out.println("Enter 3nd String shuffle");
		String str3=sc.next();
		
		isShuffle(str1,str2,str3);
	}
}