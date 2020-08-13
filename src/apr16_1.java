import java.util.*;
public class apr16_1 {
    public static void main(String[]args) {
    	int[] v1= {1,2,3,9,7,11,77,5};
    	String[] v2= {"ana","are","mere"};
    	
    	System.out.println(Arrays.toString(v1));
    	Arrays.sort(v1);
    	System.out.println(Arrays.toString(v1));
    	
    	System.out.println(Arrays.toString(v2));
    	Arrays.sort(v2);
    	System.out.println(Arrays.toString(v2));
    	
    	int[] v11 = Arrays.copyOf(v1, 12);
    	System.out.println(Arrays.toString(v11));
    	System.out.println(v1.equals(v11));
    	Arrays.sort(v11,6,10);
    	System.out.println(Arrays.toString(v11));
    	
    	
    	/*
    	 *  ARRAYS
    	 *  toString
    	 *  sort
    	 *  binarysearch
    	 *  copyOf
    	 *  copyOfRange
    	 *  equals
    	 *  asList
    	 * */
    	
    }
}
