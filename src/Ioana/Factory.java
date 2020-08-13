package Ioana;

public abstract class Factory {
	public enum Type{
		A,B
	}
   public abstract void actiune();
   
   private static class Factory1 extends Factory{
	   @Override
	   public void actiune() {
		   System.out.println("buna");
	   }
   }
   
   private static class Factory2 extends Factory{
	   @Override
	   public void actiune() {
		   System.out.println("pa");
	   }
   }
   
   public static Factory getInstance(Type t) {
	   switch(t) {
	   case A: return new Factory1();
	   case B: return new Factory2();
	   default: throw new IllegalArgumentException("no such factory type");
	   }
   }
}
