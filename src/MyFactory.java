
public abstract class MyFactory {
   
   public  enum Types{
		   X,Y
   };
   
   public static MyFactory createFactoryObject(Types t) {
	   switch(t) {
	    case X: return new MyFactoryObject1();
	    case Y: return new MyFactoryObject2();
	    default: throw new IllegalArgumentException("no such type of object");
	   }
   }
   
   private static class MyFactoryObject1 extends MyFactory{
	   public void m1(){
		   System.out.println("Object 1 m1()");
	   }
	   public void m2(){
		   System.out.println("Object 1 m2()");
	   }
   }
   private static class MyFactoryObject2 extends MyFactory{
	   public void m1(){
		   System.out.println("Object 2 m1()");
	   }
	   public void m2(){
		   System.out.println("Object 2 m2()");
	   }
   }
	
   public abstract void m1();
   public abstract void m2();
}
