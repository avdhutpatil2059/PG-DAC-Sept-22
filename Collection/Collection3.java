//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;
public class Collection3 {
	public static void main(String[] args) {
  // Creae a list and add some colors to the list
		List<String> colourList = new ArrayList<String>();
		colourList.add("Black");
		colourList.add("Red");
		colourList.add("Orange");
		colourList.add("Blue");
		colourList.add("White");
		colourList.add("Yellow");
		System.out.println(colourList);
		String element = colourList.get(0);
		System.out.println("First element: "+element);
		element = colourList.get(2);
		System.out.println("Third element: "+element);
 }
}
