
public abstract class Fabrica {
	 public enum Tipuri {
		 A,B,C
	 }
	 
	 public abstract void m1();
	 public abstract void m2();
	 
	 public static Fabrica createFabrica(Tipuri t) {
		 switch(t) {
			 case A: return new FabricaTipLinux();
			 case B: return new FabricaTipOracle();
			 case C: return new FabricaTipMongoDB();
			 default: throw new IllegalArgumentException("there is no such type of factory");
		 }
	 }
	 
	 private static class FabricaTipLinux extends Fabrica{
		 @Override
		 public void m1() {
			 System.out.println("implementare pentru LINUX m1");
		 }
		 @Override
		 public void m2() {
			 System.out.println("implementare pentru LINUX m2");
		 }
	 }
     private static class FabricaTipOracle extends Fabrica{
    	 @Override
    	 public void m1() {
			 System.out.println("implementare pentru ORACLE m1");
    	 }
    	 @Override
    	 public void m2() {
			 System.out.println("implementare pentru ORACLE m2");
    	 }
     }
     private static class FabricaTipMongoDB extends Fabrica{
    	 @Override
    	 public void m1() {
			 System.out.println("implementare pentru MongoDB m1");
    	 }
    	 @Override
    	 public void m2() {
			 System.out.println("implementare pentru MongoDB m2");
    	 }
     }
}
