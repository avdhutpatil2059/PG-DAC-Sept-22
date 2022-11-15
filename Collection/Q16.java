//16. Write a Java program to empty an hash set.
import java.util.*;
class Q16
{
	public static void main(String args[])
	{
		HashSet<Integer> set = new HashSet<>();
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		
	
		System.out.println("Hash Set : " + set);
		set.clear();
		System.out.println("Hash Set : " + set);
	}
}