
public abstract class Factorie {
  public enum Type{
	  A,B
  }
  public abstract void metodaInitiere();
  
  public static Factorie getFactorie(Type t) {
	  switch(t) {
		  case A: return new Factorie1();
		  case B: return new Factorie2();
		  default: throw new  IllegalArgumentException("no such type ");
	  }
  }
  
  private static class Factorie1 extends Factorie{
	  @Override
	  public void metodaInitiere() {
		  System.out.println("Factorie 1 metoda init");
	  }
  }

  private static class Factorie2 extends Factorie{
	  @Override
	  public void metodaInitiere() {
		  System.out.println("Factorie 2 metoda init");
	  }
  }
}
