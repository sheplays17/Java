
public class Singleton {
	
  private static Singleton SINGLETON=null;
  
  private Singleton() {}
  
  public static Singleton getInstance() {
	  if (SINGLETON == null) {
		  return new Singleton();
	  }
	  return SINGLETON;
  }
  
}
