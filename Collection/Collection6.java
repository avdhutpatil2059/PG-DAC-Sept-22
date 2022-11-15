//Write a Java program of swap two elements in an array list.

import java.util.*;
  public class Collection6 {
	public static void main(String[] args) {
		ArrayList<String> colourList= new ArrayList<String>();
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("Black");
        colourList.add("White");
        colourList.add("Pink");
        System.out.println("Array list before Swap:");
       
	   for(String a: colourList){
			System.out.println(a);
        }
        Collections.swap(colourList, 0, 2);
        System.out.println("Array list after swap:");
        
		for(String b: colourList){
			System.out.println(b);
        }
    }
}
