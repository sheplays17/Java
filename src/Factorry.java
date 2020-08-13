
public abstract class Factorry {
  public enum Type{
     A,B,C
  }
  public abstract void metodaInitializare();
  public abstract void metodaConectareBaza();
  
  public static Factorry getFactorry(Type t) {
	  switch(t) {
		  case A: return new Factorry1();
		  case B: return new Factorry2();
		  case C: return new Factorry3();
		  default: throw new IllegalArgumentException("no such type of facotry");
	  }
  }
  
   private static class Factorry1 extends Factorry{
	   public  void metodaInitializare() {
		   System.out.println("Factorry 1 metoda initializare");
	   }
	   public  void metodaConectareBaza(){
		   System.out.println("Factorry 1 metoda conectare");
	   } 
   }
   private static class Factorry2 extends Factorry{
	   public  void metodaInitializare() {
		   System.out.println("Factorry 2 metoda initializare");
	   }
	   public  void metodaConectareBaza(){
		   System.out.println("Factorry 2 metoda conectare");
	   } 
   }
   private static class Factorry3 extends Factorry{
	   public  void metodaInitializare() {
		   System.out.println("Factorry 3 metoda initializare");
	   }
	   public  void metodaConectareBaza(){
		   System.out.println("Factorry 3 metoda conectare");
	   } 
   }
  
}
