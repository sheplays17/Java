
public class God {
	
	private static God SINGLETON = null;
	String nume;
	String culoare;
	
	private God() {}
	
	public static God getInstance() {
		if(SINGLETON == null) {
			SINGLETON = new God();
		}
		return SINGLETON;
	}

}
