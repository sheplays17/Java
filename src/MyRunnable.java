import java.util.stream.*;
import java.util.concurrent.*;

public class MyRunnable implements Runnable{
	
	Semaphore s= new Semaphore(1);
	
   @Override
   public void run() {
	   try {   
			   try {
				   s.acquire();
				   Stream.iterate(0,i->i+2).limit(10).forEach(System.out::println);
			   }finally {
				   s.release();
			   }
	       }catch(InterruptedException e) {
	    	   e.printStackTrace();
	       }
   }
}
