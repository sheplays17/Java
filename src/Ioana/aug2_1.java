package Ioana;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;


public class aug2_1 {
	public static void main(String[]args) {
		Consumer c= x-> System.out.println(x);
		c.accept(10);
		
		Predicate<Integer> p = x-> x%2 ==0;
		p.test(12);
		
		Supplier s = ()->{return 14;};
		s.get();
		
		Function <Integer,String> f= x-> x.toString();
		f.apply(124);
		
		Factoryy f1= Factoryy.getInstance(Factoryy.Type.A);
		f1.m1();
		
		Factoryy f2= Factoryy.getInstance(Factoryy.Type.B);
		f2.m1();
		
		Apple a= new Apple.Builder()
				//.setA(1)
				.build();
		
		Produs p1= ProdusRegistry.getInstance(ProdusRegistry.Type.SWEET);
		Produs p2= ProdusRegistry.getInstance(ProdusRegistry.Type.SWEET);

	}

}
