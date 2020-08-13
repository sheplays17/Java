import java.util.*;
import java.util.regex.*;//da,nu era necesar sa pun iar dar am vrut

public class feb1 {
   public static void main (String args[]) {
	   ArrayDeque <String>deq= new ArrayDeque<>();
	   ArrayDeque <String>deq2= new ArrayDeque<>();

	   deq.add("Ioana");
	   deq.add("Eileen");
	   deq.add("Diana");
	   deq.add("Ben");
	   System.out.print(deq.add("Leonid"));
	   deq.remove("Ben");
	   
	   deq.push("Johanna");
	   deq.offer("Ernest");
	   deq.forEach(x->System.out.print(x+" "));
	   System.out.print(deq.peek());
	   System.out.print(deq.poll());
	   System.out.println(deq.getFirst());
	   
	   String text1="mama";
	   String text2="mama";
	   System.out.println(text1.matches(text2));
	   String text3="am mers la plimbare pe deal cu mama";
	   
   }
}
