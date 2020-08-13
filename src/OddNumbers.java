import java.util.stream.*;

public class OddNumbers implements Runnable{
	
	@Override
     public void run() {
    	 Stream.iterate(0,x->x+2).limit(50).forEach(System.out::println);;
     }
}
