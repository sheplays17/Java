
public class feb16_2 {
   public static void main(String []args) {
	   OddNumbers od= new OddNumbers();
	   Thread t = new Thread(od);
	   t.start();
   }
}
