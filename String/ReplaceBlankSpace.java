/*11. How to replace each given character to other e.g. blank with %20? 
 For example, if the input is "Java is Great" and asked to replace space with %20 then it 
should be "Java%20is%20Great".*/

import java.util.*;
class ReplaceBlankSpace
{
	public static void main(String args[])
	{
	  String str;
	  String s="%20";
	  int n;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter string with space");
	  str=sc.nextLine();
	  
	  n=str.length();
	  char ch[]=str.toCharArray();
	  char ch1[]=s.toCharArray();
	  for(int i=0;i<n;i++)
	  {
		  if(ch[i]==' ')
		  {
			  ch[i]=ch1[i];
		  }
	  }
	  System.out.println("String after replace space");
	  System.out.println(str);
	}
}