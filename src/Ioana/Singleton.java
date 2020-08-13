package Ioana;

public class Singleton {
	int code;
	String nume;
	
	private static Singleton SINGLETON= null;
	
	private Singleton() {
		code= 1000;
		nume="initial";
	}
	
	public static Singleton getInstance() {
		if(SINGLETON == null) {
			SINGLETON = new Singleton();
		}
		return SINGLETON;
	}
	
	

}
