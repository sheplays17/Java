package Ioana;

public abstract class Factoryy {
	public enum Type{
		A,B
	}
	 public abstract void m1();
	 
	 private static class Factory1 extends Factoryy{
		 public  void m1() {
			 System.out.println("Facotry 1 m");
		 }
	 }
	 private static class Factory2 extends Factoryy{
		 public  void m1() {
			 System.out.println("Facotry 2 m");
		 }
	 }
	 public static Factoryy getInstance(Type t) {
		 switch(t) {
		 case A: return new Factory1();
		 case B: return new Factory2();
		 default: throw new IllegalArgumentException("no such factory type");
		 }
	 }
 
}
