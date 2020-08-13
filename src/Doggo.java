
public class Doggo implements Comparable<Doggo>{
	String nume;
	int ani;
	
	Doggo(String nume, int ani){
		this.nume=nume;
		this.ani=ani;
	}
	
	@Override
	public int compareTo(Doggo d) {
		return this.ani- d.ani;
	}
	
	@Override
	public String toString() {
		return nume+" "+ani;
	}

}
