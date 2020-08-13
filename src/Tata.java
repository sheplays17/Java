
public class Tata {
  
	private static Tata SINGLETON = null;
	String nume;
	int varsta;
	
	private Tata() {}
	
	public static  Tata getInstance() {
		if(SINGLETON == null) {
			synchronized(Tata.class) {
				if(SINGLETON == null) {
					SINGLETON = new Tata();
				}
			}
		}		
		return SINGLETON;
	}

}
