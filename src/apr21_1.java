import java.util.Arrays;
import java.util.List;

public class apr21_1 {
  public static void main(String[]args) {
	  int[] v= {1,2,3,4,0,1};
	  int[] v2= v;

	  List<Integer>list= Arrays.asList(1,2,3);
	  
	  list.forEach(System.out::println);
	  Arrays.sort(v);
	  System.out.println();

	  System.out.println(Arrays.toString(v));
	  System.out.println(v.equals(v2));
	  

  }
}
