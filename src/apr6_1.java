
public class apr6_1 {
	public static void main(String[]args) {
		Facttory f1=  Facttory.getFactory(Facttory.Type.A);
		Facttory f2=  Facttory.getFactory(Facttory.Type.B);
		f1.metStart();
		f1.metStop();
		f2.metStart();
		f2.metStop();

	}
}
