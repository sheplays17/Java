
public class mar31_2 {
	public static void main(String[]args) {
		
	     Subieect s= new Subieect();
	     
	     Observeer o1= new ObserveerImplementation();
	     Observeer o2= new ObserveerImplementation2();
	     
	     s.adaugaObserveer(o1);
	     s.adaugaObserveer(o2);
	     
	     s.mainMethod();
		
	}
}
