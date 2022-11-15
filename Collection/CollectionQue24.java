//24. Write a Java program to check whether a map contains key-value mappings (empty) or not
import java.util.*;
class CollectionQue24
{
	public static void main(String args[])
	{
		HashMap<Integer, String> map =new HashMap<Integer, String>();
		map.put(1,"c");
		map.put(2,"cpp");
		map.put(3,"java");
		map.put(4,"Python");
		System.out.println("Is Hashmap empty :"+map.isEmpty());
		map.clear();
		System.out.println("Is Hashmap empty :"+map.isEmpty());
		
	}

}