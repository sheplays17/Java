package Ioana;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;


public class aug1_1 {
	public static void main(String[]args) {
		  Function<Integer,String> f= x-> x.toString();
		  System.out.println(f.apply(12));
		  
		  Function<String,Integer> f2= x-> x.length();
		  System.out.println(f2.apply("Ana are mere, iar eu am mure"));
		  
		  BiConsumer<Integer,Integer> c= (a,b)->System.out.println(a+" "+b);
		  c.accept(12, 13);
		  
		  BiFunction <String, String,Integer> bf= (x,y)-> x.length()+y.length();
		  System.out.println(bf.apply("Ioana", "Misha"));
		  
		  Supplier sp= ()-> {return 1000;};
		  System.out.println(sp.get());
	}
}
