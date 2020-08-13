import java.util.Arrays;

public class apr16_5 {
	  
		private static boolean contains(int[] v, int x){
		   	 boolean val=false;
		   	 for(int i=0;i<v.length;i++) {
		   		 if (v[i]== x)
		   			 val=true;        		 
		   		 
		   	 }
		   	 return val;
	    }
	  public static void main(String[]args) {
		  int [] v= {1,2,3,4,5};
          System.out.print(contains(v,5));
         
	  }
}
