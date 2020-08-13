import java.util.function.BiPredicate;


public class aug1 {
	private static class Consumer2 implements Consumer{
		@Override
		public void consuma(int a) {
		  System.out.println(a);	
		}
	}
	
	private static class BiConsumer2 implements BiConsumer{
		@Override
		public void consuma(int a, int b) {
			System.out.println(a+" "+b);
		}
	}
	
	private static class Function2 implements Function{
        @Override
        public int function(int a) {
        	return a*10;
        }
	}
	
	private static boolean testare(int a){
		System.out.println("testeaza daca nr ul "+a+" este par");
		return a % 2 ==0;
	}
	
	public static void main(String[]args) {
		Consumer c= new Consumer2();
		c.consuma(12);
		
		BiConsumer bc= new BiConsumer2();
		bc.consuma(1, 2);
		
		Function f1 = new Function2();
		System.out.println(f1.function(10));
		
		Function f2 = x-> x+10;
		System.out.println(f2.function(10));
		
		BiFunction bf = (x,y)-> x*y;
		System.out.println(bf.bifunction(3, 5));
		
		Preddicate p = x-> x>10;
		System.out.println(p.consuma(19));
		
		Preddicate p1 = x-> testare(x);
		System.out.println(p1.consuma(2));
		
		
		Consumer d = x-> System.out.print(x);
		Consumer d1 = System.out::println;
		
        BiPredicate<Integer,Integer> q = (a,b)-> a % b ==0;		
	}
}
