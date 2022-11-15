//5.How to check if a String contains only digits?

import java.util.*;
class StringDigit
{
	static void findDigit(String str,int n)
	{
		  for (int i = 0; i < n; i++)
		  {
			  if(str.charAt(i)<'0' || str.charAt(i)>'9')
			  {
				  System.out.println("String not contain any digit");
				  return;
			  }
		  }
		  System.out.println("String contain digit");
		  return;
	}
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int n=str.length();
		findDigit(str,n);
	}
}
	