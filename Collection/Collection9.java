//Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.LinkedList;
public class Collection9 {
	public static void main(String[] args) {
		// create an empty linked list
		LinkedList <String> colourList = new LinkedList <String> ();
		// use add() method to add values in the linked list
		colourList.add("Red");
		colourList.add("Green");
		colourList.add("Black");
		colourList.add("White");
		colourList.add("Pink");
		System.out.println("Original linked list: ");
		System.out.println("Let add the Yellow color after the Red Color: " + colourList);
		colourList.add(1, "Yellow");
		// print the list
		System.out.println("The linked list:" + colourList);
	}
}
