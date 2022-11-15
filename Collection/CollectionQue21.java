//23. Write a Java program to convert a priority queue to an array containing all of the elements of the queue
import java.util.*;
class CollectionQue21
{
	public static void main(String args[])
	{
		PriorityQueue <String> pq =new PriorityQueue<String>();
		pq.add("c");
		pq.add("cpp");
		pq.add("java");
		pq.add("python");
		System.out.println("Priority Queue is:"+ pq);
		
		pq.remove("c");
		pq.remove("java");
		
			System.out.println("Priority Queue after removing elements is:"+pq);
		
	
		
	}

}