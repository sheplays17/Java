import java.util.*;

public class mar14_1 {
	public static void main(String[]args) {
      
		List<String>lista= new ArrayList<>();
		lista.add("ana");
		lista.add("sorin");

		lista.add("vlad");
		lista.add("mitza");
		lista.add("ioana");
		lista.add("maria");

        lista.forEach(System.out::println);
	}
}
