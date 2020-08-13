
public class Metallica {
   int membrii;
   int an_start;
   
   private Metallica() {}
   
   private static final class SingletonHolder {
	   private static final Metallica SINGLETON = new Metallica();
   }
   
   public static Metallica getInstance() {
	   return SingletonHolder.SINGLETON;
   }
 
   
   
}
