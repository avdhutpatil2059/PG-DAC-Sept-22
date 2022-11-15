//1.How to Print duplicate characters from String?

import java.util.*;
class StringDuplicate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.next();
		 int n=str.length();
		  char ch[]=str.toCharArray();
		 //char ch[]=new char[n];
		 
		 for(int i=0;i<n;i++)
		 {
			 //ch[i]=str.charAt(i);
			 for(int j=i+1;j<n;j++)
			 {
				 //ch[j]=str.charAt(i+1);
				 if(ch[i]==ch[j])
				 {
					 System.out.println(ch[j]+ " ");
					 break;
				 }
			 }
		 }
	}
}	