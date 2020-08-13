import java.util.*;

public class apr_2 {
   public static void main(String[]args) {
	   List<Integer>lista= new ArrayList<>() ;
	   lista.add(1);
	   lista.add(12);
	   lista.add(13);
	   
	   lista.stream()
	        .filter(x->x%2==0)
	        .forEach(System.out::println);
	   
	   Factorie f1= Factorie.getFactorie(Factorie.Type.A);
	   Factorie f2= Factorie.getFactorie(Factorie.Type.B);
       f1.metodaInitiere();
       f2.metodaInitiere();

   }
}
