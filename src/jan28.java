import java.util.*;

public class jan28 {
	
	public static void main (String[]args) {
		
		List<Integer> lista= new ArrayList<>();
		lista.add(20);
		lista.add(13);
		lista.add(17);
		
		LinkedList<Integer>linked= new LinkedList<>();
		linked.add(5);
		linked.addFirst(19);
		linked.removeFirst();
		linked.addLast(99);
		linked.addFirst(1);
		System.out.println("gol? "+linked.isEmpty());
		System.out.println("sizee "+linked.size());

		System.out.println("linked list: ");
		linked.forEach(x->System.out.print(x+" "));
		
		System.out.println("Este lista goala? "+lista.isEmpty());
		System.out.println("returneaza primul element: "+lista.get(1));
		System.out.println("size: "+lista.size());
		
		lista.stream()
		     .filter(x->x%2==1)
		     .forEach(x->System.out.print(x+" "));
		     
		System.out.println();

		
		for(Integer i:lista) {
			System.out.print(i+" ");
		}
		System.out.println();
		lista.forEach(System.out::println);
		System.out.println();

		for(int i=0;i<lista.size();i++) {
			System.out.print(lista.get(i)+" ");
		}
		
		
		ArrayDeque<Integer> deq= new ArrayDeque<>();
		ArrayDeque<Integer> deq2= new ArrayDeque<>();

		deq.add(1);
		deq.add(2);
		deq.add(3);
		deq.add(4);
		deq.add(5);
		deq.add(6);
		deq.add(7);
		deq.add(8);	
		deq.add(9);

		deq.push(99);// pune elem dat la incaput de lista
		System.out.println("peek "+deq.peek()); // returneaza primul elem din lista fara a-l sterge
		//System.out.println(deq2.poll());// asta da null la lista nula
		//System.out.println(deq2.pop());// asta da exceptie la lista nula
		deq.remove(9);
		deq.offer(9);//adds the element at the end of the deque
		deq.forEach(System.out::print);
	
	}

}
