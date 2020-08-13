
public class mar30_4 {
   public static void main(String[]args) {
	   Consumatorr c1= new Consumer();
	   c1.consuma(10);
	   
	   Consumatorr c2= new Consumatorr() {
		   public void consuma(int x) {
			   System.out.println("hai sa adunam +20 deci va face "+(x+20));
		   }
	   };
	   c2.consuma(10);
	   
	   Consumatorr c3= x->  System.out.println("hai sa adunam +30 deci va face "+(x+30));
	   c3.consuma(10);



   }
   private static class Consumer implements Consumatorr{
	   @Override
	   public void consuma(int x){
		   System.out.println("hai sa adunam +10 deci va face "+(x+10));
	   }  
   }
}
