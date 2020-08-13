
public abstract class Factoryy {
    public enum Types{
    	P,Q
    }
    
    public abstract void m1();
    public abstract void m2();
    
    public static Factoryy getFactoryy(Types t) {
    	switch(t) {
	    	case P: return new Factoryy1();
	    	case Q: return new Factoryy2();
	    	default: throw new IllegalArgumentException("there s no such type of factory");
	    }
    }
    
    private static class Factoryy1 extends Factoryy{
    	public void m1() {
    		System.out.println("Object 1 m1");
    	}
    	public void m2() {
    		System.out.println("Object 1 m2");
    	}
    }
    
    private static class Factoryy2 extends Factoryy{
    	public void m1() {
    		System.out.println("Object 2 m1");
    	}
    	public void m2() {
    		System.out.println("Object 2 m2");
    	}
    }
    


}
