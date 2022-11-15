//4. How to program to print the first non repeated character from String? 

import java.util.*;
class StrigFirstRepeatedChar
{
		//using character array
		static final int charArray=256;
		static int count[]=new int[charArray];
		static int index;
		
		static void countRepetedchar(String str)
		{ 
			int n=str.length();
			for(int i=0;i<n;i++)
			{	
				count[str.charAt(i)]++;
				System.out.println("count value"+count[i]+" is: "+count);
			}
		}
				
		static void nonRepeatingchar(String str)
		{
			countRepetedchar(str);
			int n=str.length();
			for(int i=0;i<n;i++)
			{
				if(count[str.charAt(i)]==1)
				{
					index=i;
					System.out.println("First non repeted character is:"+count[index]);
					break;
				}
			}
			return;
		}
			
			
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string for find non repeted character");
		String str=sc.next();
		
		nonRepeatingchar(str);
	}
}
