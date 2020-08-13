
public class feb17_1 {
   public static void main(String[]args) {
	   MyRunnable r= new MyRunnable();
	   MyRunnable2 r2= new MyRunnable2();
	   Thread t= new Thread(r);
	   Thread t2= new Thread(r2);
	   t.start();
	   t2.start();
   }
}
