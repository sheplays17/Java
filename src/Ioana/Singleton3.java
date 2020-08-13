package Ioana;

public class Singleton3 {
  private Singleton3() {}
  
  private static final class SingletonHolder{
	  private static final Singleton3 SINGLETON= new Singleton3();
  }
  public Singleton3 getInstance() {
	 return SingletonHolder.SINGLETON;			  
  }
  
}
