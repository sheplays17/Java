import java.util.concurrent.atomic.*;

public class feb18_4 implements Runnable{
	AtomicInteger a= new AtomicInteger(0);
   @Override	
   public void run() {
	   for (int i=0;i<50;i++) {
		   System.out.print(a.incrementAndGet());
	   }
   }
}
