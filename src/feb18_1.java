import java.util.concurrent.*;

public class feb18_1 implements Runnable{
	
	Semaphore s= new Semaphore(2);
	@Override
   public void run() {
	   int nr=0;
	   for (int i=0;i<50;i++) {
		  try {
			  try {  s.acquire();
				     nr++;
				     System.out.print(nr+" ");
			  }finally {
				   s.release();
			  }
		  }catch(InterruptedException e) {
			  e.printStackTrace();
		  }
	   }
   }
}
