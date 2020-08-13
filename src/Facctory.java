
public abstract class Facctory {
  public static enum Type{
	  A,B
  }
  
  public abstract void init();
  public abstract void finish();
  
  private static class FactoryA extends Facctory{
	  public  void init() {
		  System.out.println("Factory A init");
		 
	  }
	  public  void finish(){
		  System.out.println("Factory A finish");
		 
	  }
  }
  private static class FactoryB extends Facctory{
	  public  void init() {
		  System.out.println("Factory B init");
		 
	  }
	  public  void finish(){
		  System.out.println("Factory B finish");
		 
	  }
  }
  
  public static Facctory getInstance(Type t) {
	  switch(t) {
		  case A: return new FactoryA();
		  case B: return new FactoryB();
		  default: throw new IllegalArgumentException("no such factory type");
	  }
  }
}
