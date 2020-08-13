import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Random;

public class feb19_4 implements Runnable{
	ReentrantReadWriteLock lock= new ReentrantReadWriteLock();
	int x, sum;
	Random r= new Random();
	@Override
	public void run() {
		for (int i=0;i<50;i++) {
			changeX();
			readX();
		}
	}
	
	public void changeX(){
		lock.writeLock().lock();
		x=r.nextInt();
		lock.writeLock().unlock();
	}
	
	public void readX() {
		lock.readLock().lock();
		sum= sum+x;
		lock.readLock().unlock();
	}
  
}
