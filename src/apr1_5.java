
public class apr1_5 {
   public static void main(String[]args) {
	   
	   
	   Consumattor c1= new ConsumerSuma();
	   c1.consuma(10, 11);
	   
	   Consumattor c2= new ConsumerProdus();
	   c2.consuma(10, 11);
	   
	   Consumattor c3= new ConsumerDiferenta();
	   c3.consuma(10, 11);
	   
	   Consumattor c4= new ConsumerDiviziune();
	   c4.consuma(10, 11);
   }
   private static class ConsumerSuma implements Consumattor{
	   @Override
	   public void consuma(int x, int y) {
		   System.out.println("returneaza suma dintre "+x+" si "+y+": "+(x+y));
	   }
   }
   
   private static class ConsumerProdus implements Consumattor{
	   @Override
	   public void consuma(int x, int y) {
		   System.out.println("returneaza produsul dintre "+x+" si "+y+": "+(x*y));
	   }
   }
   private static class ConsumerDiferenta implements Consumattor{
	   @Override
	   public void consuma(int x, int y) {
		   System.out.println("returneaza diferenta dintre "+x+" si "+y+": "+(x-y));
	   }
   }
   private static class ConsumerDiviziune implements Consumattor{
	   @Override
	   public void consuma(int x, int y) {
		   System.out.println("returneaza diviziune dintre "+x+" si "+y+": "+(x/y)+" rest "+(x%y));
	   }
   }
}
