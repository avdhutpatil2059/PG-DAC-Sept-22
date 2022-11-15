//25. Write a Java program to get the value of a specified key in a map//
import java.util.*;
import java.util.Map.Entry;
class CollectionQue25
{
	public static void main(String args[])
	{
		HashMap<Integer, String> map =new HashMap<Integer, String>();
		map.put(1,"c");
		map.put(2,"cpp");
		map.put(3,"java");
		map.put(4,"Python");
		//System.out.println("value for key 4 is :"+map.get(4));
		
		//System.out.println("value for key 4 is :"+map.get(4));
		System.out.println("Hashmap is  :"+map);
		Integer key = 4;
		for(Entry<Integer, String> entry :map.entrySet())
		{
			if(entry.getKey()==key)
			{
			System.out.println("value of key is "+key+" is "+entry.getValue());
			}
		}
		
	}

}