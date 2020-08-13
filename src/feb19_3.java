import java.util.concurrent.*;

public class feb19_3 implements Runnable{
	Semaphore s= new Semaphore(3);
	int nr;
	@Override
	public void run() {
		try {
				try{    
					    for (int i=0;i<50;i++) {
							s.acquire();
							nr++;
							System.out.print(nr+" ");
					    }
				}finally{
					s.release();
				}			
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }  
	}

}
