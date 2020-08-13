import java.util.*;

public class feb18_5 {
   public static void main(String[]args) {
	   List<Integer> list= Arrays.asList(1,2,3,4,5);
	   List<Integer> synclist = Collections.synchronizedList(list);
	   
	   synclist.forEach(System.out::println);
   }
}
