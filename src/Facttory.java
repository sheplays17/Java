
public abstract class Facttory {
  public enum Type{
	  A,B
  }
  public abstract void metStart();
  public abstract void metStop();

  public static Facttory getFactory(Type t) {
	  switch(t) {
		  case A : return new Factory1();
		  case B: return new Factory2();
		  default: throw new IllegalArgumentException("no such factory type");
	  }
	  
  }
  private static class Factory1 extends Facttory{
	  @Override
	  public void metStart() {
		  System.out.println("Factory 1 met 1");
	  }
	  public void metStop() {
		  System.out.println("Factory 1 met 2");
	  }
  }
  private static class Factory2 extends Facttory{
	  @Override
	  public void metStart() {
		  System.out.println("Factory 2 met 1");
	  }
	  public void metStop() {
		  System.out.println("Factory 2 met 2");
	  }
  }
}
