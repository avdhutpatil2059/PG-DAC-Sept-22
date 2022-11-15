//15. How to remove duplicate characters from String

import java.util.*;
class RemoveDuplicate
{
	public static void main(String args[])
	{
		int count,n;
		char ch[];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string to find duplicate in string");
		String str=sc.next();
		n=str.length();
		ch=str.toCharArray();
		
		System.out.println("Duplicate in strings are");
		for(int i=0;i<n-1;i++)
		{
			//count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]!=ch[j])
				{	
					System.out.print(ch[i]+ " ");
					
					break;
				}
				
				//count++;
				ch[j]=0;
				
			}
		}
	}		
}	