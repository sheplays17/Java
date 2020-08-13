import java.util.*;

public class jan30 {
  public static void main(String[]args) {
	  List<Integer> lista= new ArrayList<>();
	  lista.add(10);
	  lista.add(20);
	  lista.remove(0);
	  lista.size();
	  lista.isEmpty();
	  lista.forEach(x->System.out.print(x+" "));
	  System.out.println();
	  
	  LinkedList<Integer>link= new LinkedList<>();
	  link.add(13);
	  link.addFirst(1);
	  link.addLast(15);
	  link.forEach(x->System.out.print(x+" "));
	  System.out.println();
	  
	  ArrayDeque<Integer>deq= new ArrayDeque<>();
	  deq.add(1);
	  deq.add(2);
	  System.out.println(deq.peek());
	  deq.push(0);
	  deq.offer(3);
	  deq.forEach(x->System.out.print(x+" "));

	  
  }
}
