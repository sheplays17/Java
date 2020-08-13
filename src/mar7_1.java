import java.util.concurrent.*;
// Semafor
public class mar7_1 implements Runnable{
	@Override
	public void run(){
		Semaphore s= new Semaphore(10);
		try {
			for(int i=0;i<40;i++){
				s.acquire();
				System.out.print(i+" ");		
			} 
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}finally {
			s.release();
		}
	}
	

}
