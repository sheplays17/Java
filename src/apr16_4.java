import java.util.*;

public class apr16_4 {
  public static void main(String[]args) {
	  
	  List<Integer> list = Arrays.asList(1,2,3,4,5);
	  int sum=list.stream().reduce(0,(a,b)->a+b);
	  System.out.print(sum);
	  
	  int[] v= {1,2,3,4,5};
	  int[] v1= {1,2,3,4,5};
	  System.out.println(sum);
	  System.out.println(v.equals(v1));
	  Arrays.sort(v1);
	  System.out.println(Arrays.toString(v1));

	  int[] v2= {100,34323,1,3,56,99};
	  List<String> lista2 = Arrays.asList("ana","anna");
	  lista2.forEach(System.out::println);
	  Arrays.sort(v2);
	  int []v3=Arrays.copyOf(v2, 5);
	  System.out.println(Arrays.toString(v3));

  }
}
