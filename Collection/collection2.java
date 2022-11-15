
//Write a Java program to insert an element into the array list at the first position.
import java.util.*;
	public class collection2 {
		public static void main(String[] args) {
			
			  List<String> colourList = new ArrayList<String>();
			  colourList.add("Black");
			  colourList.add("Red");
			  colourList.add("Orange");
			  colourList.add("Blue");
			  colourList.add("White");
			  colourList.add("Yellow");
			  System.out.println(colourList);
			  colourList.add(0, "Pink");
			  colourList.add(5, "Green");
			  System.out.println(colourList);
		}
	}