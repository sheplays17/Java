import java.util.*;

// STREAMURI
public class feb11_2 {
	public static void main(String[]args) {
	  
		List<String> lista= Arrays.asList("HELLO","HONEY","BUNNEY","IO");
		lista.stream()
		     .filter(x->x.length()%2==0)
		     .map(x-> x.length())
		     .forEach(System.out::println);
	}
}
