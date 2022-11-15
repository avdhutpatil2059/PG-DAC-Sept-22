//20. Write a Java program to find the numbers less than 7 in a tree set. 

import java.util.*; 

class Q20
{ 
	public static void main(String[] args)
	{ 
	TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
        numbers.add(4);
        System.out.println("Numbers less than 7: " + numbers.headSet(7));
	} 

}
