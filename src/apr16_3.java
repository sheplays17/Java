import java.util.Arrays;
import java.util.List;
public class apr16_3 {
    public static void main(String[]args) {
        
    	List<Integer> list = Arrays.asList(1,2,3,4,5);
    	
    	int[][] v= new int[10][10];
    	
    	for (int i=0;i<v.length;i++) {
        	for (int j=0;j<v[1].length;j++) {
            	System.out.print("-"+v[i][j]);

        	}
    	    System.out.println();
        }

    	
    	
    }
}
