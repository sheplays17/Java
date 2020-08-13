import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class apr13_1 {
	public static void main(String[]args) {
		LinkedBlockingDeque deq =new LinkedBlockingDeque<>();
		deq.add(1);
		Integer i= 13;
		try {
		    deq.offer(i, 30, TimeUnit.SECONDS);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		deq.forEach(System.out::println);
	}

}
