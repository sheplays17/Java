import java.util.*;

public class apr1_6 {
    public static void main(String[]args) {
    	List<Integer> list= new ArrayList<>();
    	ArrayDeque<Integer> deq = new ArrayDeque<>();
    	LinkedList<Integer> linked = new LinkedList<>();
    	
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	list.forEach(x->System.out.print(x+" "));
    	
    	linked.add(2);
    	linked.addFirst(1);
    	linked.addLast(3);
    	linked.add(4);
    	linked.addLast(99);
    	linked.removeLast();
    	System.out.println();
    	linked.forEach(x->System.out.print(x+" "));
    	
    	System.out.println();
    	deq.add(1);
    	deq.push(0);
    	deq.offer(2);
    	deq.offer(4);
    	System.out.println(deq.peek());
    	deq.forEach(x->System.out.print(x+" "));


    	
    }
}
