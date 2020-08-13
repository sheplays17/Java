import java.util.concurrent.*;

public class feb18_3 implements Runnable {
	
	CyclicBarrier b= new CyclicBarrier(2);
	
	@Override
    public void run() {
		try {
			   for (int i=0;i<50;i++) {
				   b.await();
				   System.out.print(i);
			   }
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
    }
}
