/*19. How to return the highest occurred character in a String?
For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a"*/

import java.util.*;
class RetrunHighestOccured
{
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		char ch[];
		
		System.out.println("Enter string to find highest occurred character ");
		str=sc.next();
		int n=str.length();
		ch=str.toCharArray();
		
        int rept[]=new int[n];  
        char maxChar=str.charAt(0);  
        int i,j,max;   

		for(i=0;i<n;i++)
		{
			rept[i]=1;  
            for(j=i+1;j<n;j++)
			{  
                if(ch[i]==ch[j])
				{					
                    rept[i]++;  
                    ch[j]='0';  
				}
			}
		}
			
		max=rept[0];  
        for(i=0;i<rept.length;i++)
		{
			 if(max<rept[i]) 
			 {  
                max=rept[i];  
                maxChar=ch[i];  
            }  
		}
		System.out.println("Highest Occured char is:"+maxChar);
	}
}