import java.util.concurrent.locks.*;
import java.util.Random;
import java.util.Random.*;

public class feb18_2 implements Runnable{
	ReentrantReadWriteLock l = new ReentrantReadWriteLock();
	Random r= new Random();
	int x,sum;
    @Override
    public void run() {  
    	for (int i=0;i<50;i++) {
		    	changeX();
		    	readX();  	
    	}
    }
    
    public void changeX() {
    	l.writeLock().lock();
    	x= r.nextInt();
    	l.writeLock().unlock();
    }
    public void readX() {
    	l.readLock().lock();
    	sum = sum+x;
    	l.readLock().unlock();
    }
}
