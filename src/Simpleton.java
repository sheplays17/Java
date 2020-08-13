
public class Simpleton {
   private static Simpleton SINGLETON = null;
   
   private Simpleton() {}
   
   public static Simpleton getInstance() {
	   if(SINGLETON== null) {
		   SINGLETON= new Simpleton();
	   }
	   return SINGLETON;
   }
}
