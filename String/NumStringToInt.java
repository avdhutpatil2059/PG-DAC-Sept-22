/*9. How to convert numeric String to an int?
For example, if you pass "67263" to the program then it should return 67263.*/

import java.util.*;
class NumStringToInt
{
	public static void main(String args[])
	{
	   String str;
	   int num;
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter string in number format");
	   str=sc.next();
	   
	   num=Integer.parseInt(str);
	   System.out.println("numeric String after convert to an int : "+num);
	}
}
	   
