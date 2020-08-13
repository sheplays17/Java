import java.util.Arrays;
import java.util.Collections;

// Write a Java program to find the duplicate values of an array of integer values.

public class apr18_2 {
  public static void main(String[]args) {
	  int[] v= {1,2,3,4,5,1,9,9,9};
	  
	  
	  for(int i=0;i<v.length-1;i++) {
		 boolean duplicate=false;
		 for(int j=i+1;j<v.length;j++) {
			 if (v[i]== v[j])
				 duplicate= true;
		 }
		 if(duplicate== true)
			 System.out.print(v[i]);
	  }	 
  }
}
