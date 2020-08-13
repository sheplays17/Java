
public class apr23_1 {
	public static void main(String[]args) {
		
		Pisica p1 = Registryyy.getInstance(Registryyy.Type.pui);
		Pisica p2=  Registryyy.getInstance(Registryyy.Type.pui);
		p2.nume="Tom";
		System.out.println(p1.nume);
		
		Facctory f1= Facctory.getInstance(Facctory.Type.A);
		f1.init();
		f1.finish();
		
		Ssingleton s= Ssingleton.getInstance();
		
	}
	

}
