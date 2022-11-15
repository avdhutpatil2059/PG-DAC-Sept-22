//17.Write a Java program to convert a hash set to an array.
import java.util.*;
class Q17
{
	public static void main(String args[])
	{
		HashSet <Integer> set=new HashSet<>();
		set.add(20);
		set.add(22);
		set.add(23);
		set.add(24);
		
		System.out.println("HashSet : "+set);
		 Integer arr[] = new Integer[set.size()];
        
       
        set.toArray(arr);
  
        for (Integer n : arr)
            System.out.println(n);

		
		
	}
}