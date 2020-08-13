import java.util.Arrays;
import java.util.Collections;

//Write a Java program to find the k smallest elements in a given array. 
//Elements in the array can be in any order
public class apr10_4 {
	  public static void main(String[]args) {
		  Integer [] v = new Integer[] {1,2,3,4,5,99,2322};
		  int k=3;
		  System.out.println("the biggest first "+k+" numbers in the array are:");
		  Arrays.sort(v);
		  for (int i=0;i<k;i++) {
			  System.out.println(v[i]); 
		  }
	  }

}
