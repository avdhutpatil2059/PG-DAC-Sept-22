//Write a Java program to print all the elements of a ArrayList using the position of the elements.

import java.util.ArrayList;
  public class Collection7 {
    public static void main(String[] args) {
		ArrayList <String> colourList = new ArrayList <String> ();
		colourList.add("Red");
		colourList.add("Green");
		colourList.add("Black");
		colourList.add("White");
		colourList.add("Pink");
		System.out.println("\nOriginal array list: " + colourList);
		System.out.println("\nPrint using index of an element: ");
		int no_of_elements = colourList.size();

		for (int index = 0; index < no_of_elements; index++)
			System.out.println(colourList.get(index));
		}
}