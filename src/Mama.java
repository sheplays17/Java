
public class Mama {
   String nume;
   int varsta;
   
   private Mama() {}
   
   private static final class SingletonHolder{
	   private static final Mama SINGLETON= new Mama();
   }
   
   public static Mama getInstance() {
	   return SingletonHolder.SINGLETON;
   }
}
