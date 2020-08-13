

public abstract class FactoryCreator {
  public static enum type{
	  A, B
  }	
  public abstract void spuneCeva();
  public abstract void spuneAltceva();
  
  
	  private static class FactoryA extends FactoryCreator{
		  @Override
		  public  void spuneCeva() {
			  System.out.println("Factory A spune ceva");
		  }
		  @Override
		  public  void spuneAltceva() {	
			  System.out.println("Factory A spune altceva");
		  }  
	 }
	  
	  private static class FactoryB extends FactoryCreator{
		  @Override
		  public  void spuneCeva() {
			  System.out.println("Factory B init");
			 
		  }
		  @Override
		  public  void spuneAltceva(){
			  System.out.println("Factory B finish");
			 
		  }
	  }
	  
	  public static FactoryCreator getInstance(type t) {
		  switch(t) {
			  case A: return new FactoryA();
			  case B: return new FactoryB();
			  default: throw new IllegalArgumentException("no such factory type");
		  }
	  }
}
