import java.util.*;

// avand o lista de nre intregi, afisati suma nrlor impare
public class feb11_3 {
	public static void main(String[]args) {
	  List<Integer> lista= Arrays.asList(1,2,3,4,5,6,7,8,9);
	  int suma=lista.stream()
	       .filter(x->x%2==1)
	       .reduce(0, (a,b)-> a+b );
	  System.out.print(suma);
	}
}
