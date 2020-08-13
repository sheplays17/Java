import java.util.concurrent.atomic.*;

public class feb21_2 {
	public static void main(String[]args) {
	   AtomicInteger a= new AtomicInteger(1);	
	   for(int i=0;i<40;i++) {
		   System.out.print(a.getAndIncrement()+" ");
	   }
	      System.out.println();

	   AtomicBoolean b= new AtomicBoolean();
	   for(int i=0;i<10;i++) {
	      System.out.print(b+" ");
	   }
	}
}
