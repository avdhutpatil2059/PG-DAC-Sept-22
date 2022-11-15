//18.Write a Java program to compare two sets and retain elements which are same on both sets
import java.util.*;
  public class Q18 {
  public static void main(String[] args) {
     
        HashSet<String> set1 = new HashSet<String>();
    
          set1.add("11");
          set1.add("12");
          set1.add("13");
          set1.add("14");
          System.out.println("Frist HashSet: "+set1);
          HashSet<String>set2 = new HashSet<String>();
          set2.add("15");
          set2.add("11");
          set2.add("13");
          set2.add("16");
          System.out.println("Second HashSet: "+set2);
          set1.retainAll(set2);
          System.out.println("HashSet content:");
          System.out.println(set1);
     }
}