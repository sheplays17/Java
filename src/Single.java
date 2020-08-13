
public class Single {
	
  private Single() {}
  
  private static final class SingletonHolder{
	  private static final Single SINGLETON = new Single();
  }
  
  public Single getInstance() {	  
	  return SingletonHolder.SINGLETON;
  }
}
