
public class Ioana {
   String nume;
   int varsta;
   
   private static Ioana SINGLETON = null;
   
   private Ioana() {}
   
   public static Ioana getInstance() {
	   if(SINGLETON == null) {
		   SINGLETON = new Ioana();
	   }
	   return SINGLETON;
   }
}
