import java.util.Collections;
import java.util.*;

/*
Write a Java program to sort an array of given integers using Quick sort Algorithm. 
Quick sort is a comparison sort, meaning that it can sort items of any type for which a "less-than" 
relation (formally, a total order) is defined.
 */
public class apr11_3 {
  public static void main(String[]args) {
	  int[] vector = {1,2,3,99,0,423,6546,23213,32,13,242,3424,234};
	  List<Integer> array= new ArrayList<>();
	  array.add(100);
	  array.add(345);
	  array.add(35);
	  array.add(25);
	  array.add(25);
      Collections.sort(array);
	  System.out.print(array);
  }
}
