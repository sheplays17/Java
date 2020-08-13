// Write a Java program to print an array after changing the rows and columns of a given two-dimensional array
public class apr10_2 {
  public static void main(String[]args) {
	    int[][] v = {{11,22,33},
	                 {44,55,66}};
	    
	    int le= v[1].length;
	    for (int j=0;j<le;j++) {
	    		for (int i=0;i<v.length;i++) {
	    	 
	    		 System.out.print(v[i][j]+" ");
	    	 }
	    		System.out.println();	
	    }
  }
}
