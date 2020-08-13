import java.util.*;

public class feb12_1 {
	public static void main(String[]args) {
		
	   List<String> list= Arrays.asList("Hello","my","preciousss");	
	   List<Integer> list1= Arrays.asList(1,2,5,1,4,6,2);
	   
	   list.stream()
	       //.filter(x->x.length()%2==0)
	       .filter(x->x.startsWith("p"))
	      // .map(x->x.length())
	       .forEach(System.out::println);
	   
	   int produs= list1.stream()
			   			.filter(x->x%2==0)
			   			.reduce(0,(a,b)-> a+b);
	   System.out.print(produs);
	        
	}
}
