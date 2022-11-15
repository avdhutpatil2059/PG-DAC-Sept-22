//22. Write a Java program to count the number of key-value (size) mappings in a map
import java.util.*;
class CollectionQue22
{
	public static void main(String args[])
	{
		HashMap<Integer, String> map =new HashMap<Integer, String>();
		map.put(1,"c");
		map.put(2,"cpp");
		map.put(3,"java");
		map.put(4,"Python");
		System.out.println("Size of the hashmap :"+map.size());
	}

}