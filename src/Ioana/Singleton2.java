package Ioana;

public class Singleton2 {
	
   private Singleton2() {}
   
   private static final class SingletonHolder{
	   private static final Singleton2 SINGLETON= new Singleton2();
   }
   
   public static Singleton2 getInstance() {
	   return SingletonHolder.SINGLETON;
   }
}
