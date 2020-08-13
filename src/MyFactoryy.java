
public abstract class MyFactoryy {
   public enum Types{
	   A,B,C
   }
   
   public static MyFactoryy createFactoryObject(Types t){
	   switch(t) {
	   case A: return new MyFactoryObject1();
	   case B: return new MyFactoryObject2();
	   case C: return new MyFactoryObject3();
       default: throw new IllegalArgumentException("there is no such type");
	   }
   }
   
   private static class MyFactoryObject1 extends MyFactoryy{
	   public  void m1(){
	      System.out.println("Object1 m1()");
	   }
	   public  void m2(){
		      System.out.println("Object1 m2()");
	   }
   }
   
   private static class MyFactoryObject2 extends MyFactoryy{
	   public  void m1(){
	      System.out.println("Object2 m1()");
	   }
	   public  void m2(){
		      System.out.println("Object2 m2()");
	   }
   }
   
   private static class MyFactoryObject3 extends MyFactoryy{
	   public  void m1(){
	      System.out.println("Object3 m1()");
	   }
	   public  void m2(){
		      System.out.println("Object3 m2()");
	   }
   }
   
   public abstract void m1();
   public abstract void m2();
}
