import java.util.Arrays;
import java.util.Collections;

// Write a Java program to reverse an array of integer values.
public class apr18_1 {
  public static void main(String[]args) {
	  int[] v= {1,2,3,4,5,6,7,8,9,10,11};
	  int j= v.length-1;
	  for(int i=0;i<v.length/2;i++) {
		  int a= v[i];
		  v[i]=v[j];
		  v[j]=a;
		  j--;
	  }
	  System.out.println(Arrays.toString(v));
	  
	  Collections.reverse(Arrays.asList(v));
	  System.out.print(Arrays.toString(v));
  }
}
