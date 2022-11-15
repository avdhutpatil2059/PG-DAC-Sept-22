//Write a Java program to reverse elements in a array list.

import java.util.*;
  public class collection5 {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> colourList = new ArrayList<String>();
  colourList.add("Red");
  colourList.add("Green");
  colourList.add("Orange");
  colourList.add("White");
  colourList.add("Black");
  System.out.println("List before reversing :\n" + colourList);  
  Collections.reverse(colourList);
  System.out.println("List after reversing :\n" + colourList); 
 }
}