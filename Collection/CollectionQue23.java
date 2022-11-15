//23. Write a Java program to convert a priority queue to an array containing all of the elements of the queue
import java.util.*;
class CollectionQue23
{
	public static void main(String args[])
	{
		PriorityQueue <Integer> pq =new PriorityQueue<Integer>();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		System.out.println("Priority Queue is:"+ pq);
		
		//Integer [] arr = new Integer[4];
		
		//Integer [] a = pq.toArray(arr); // First method this take parameter as array
		Object [] a = pq.toArray();//second method this does not take any parameter 
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Array element "+a[i]);
		}
	
		
	}

}