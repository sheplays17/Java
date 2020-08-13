
public class feb19_2 {
   public static void main(String[]args) {
	   feb19_1 f= new feb19_1();
	   Thread t= new Thread(f);
	   
	   t.start();
   }
}
