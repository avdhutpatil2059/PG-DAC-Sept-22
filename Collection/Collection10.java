//Write a Java program to insert elements into the linked list at the first and last position.


import java.util.LinkedList;
  public class Collection10 {
  public static void main(String[] args) {
   // create an empty linked list
     LinkedList<String> colourList = new LinkedList<String>();
   // use add() method to add values in the linked list
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("Black");
     System.out.println("Original linked list:" + colourList);    
   // Add an element at the beginning 
    colourList.addFirst("White");
 
   // Add an element at the end of list 
    colourList.addLast("Pink");
     System.out.println("Final linked list:" + colourList);  
 }
}
