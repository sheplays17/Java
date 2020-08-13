
public class Mihai {
  String nume;
  int varsta;
  
  private Mihai() {}
  
  private static final class SingletonHolder{
	  private static final Mihai SINGLETON = new Mihai();
  }
  
  public Mihai getInstance() {
	  return SingletonHolder.SINGLETON;
  }
}
