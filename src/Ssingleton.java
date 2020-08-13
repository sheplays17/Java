
public class Ssingleton {

	int nr;
	String nume;
	
	private Ssingleton() {}
	
	private static  Ssingleton SINGLETON =null;
	
	public static Ssingleton getInstance() {
		if(SINGLETON == null) {			
			SINGLETON = new Ssingleton();
		}
		   return SINGLETON;
	}
	
}
