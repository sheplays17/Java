
public class Cutzu {
  String nume;
  int varsta;
    
  private Cutzu() {}
  
  private static final class SingletonHolder{
	  private static final Cutzu SINGLETON = new Cutzu();
  }
  
  public static Cutzu getInstance() {
	  return SingletonHolder.SINGLETON;
  }
  
}
