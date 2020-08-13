import java.util.Arrays;
public class apr1_7 {
	
	public static void main(String[]args) {
		
	    int[] vect1={1,2,3,4};
	    int[] vect2={1,2,3,4};
	    int[] vect3={1,2,3,4,11,21,99,100,1,0,0,342,23};
	    int a=5;
	    
        
	    System.out.println(Arrays.equals(vect1,vect2));
	    Arrays.fill(vect1,a);
	    for(int i=0;i<vect1.length;i++) {
	       System.out.print(vect1[i]+" ");
	    }
	    System.out.println();
	    Arrays.sort(vect3);
	    for(int i=0;i<vect3.length;i++) {
	       System.out.print(vect3[i]+" ");
	    }


	}
}
