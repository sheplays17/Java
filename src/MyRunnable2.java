import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyRunnable2 implements Runnable{
	int x,sum;
	Random r= new Random();
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	@Override
     public void run() {
		for (int i=0;i<50;i++) {
			changeX();
			readX();
		}
     }
	
	public void changeX() {
		lock.writeLock().lock();
		x= r.nextInt();
		lock.writeLock().unlock();
	}
	public void readX() {
		lock.readLock().lock();
		sum= sum+x;
		lock.readLock().unlock();
	}
}
