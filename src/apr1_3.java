
public class apr1_3 {
	public static void main(String[]args) {
		Subiecct s= new Subiecct();
		Observattor o1= new ObservattorImplementation();
		Observattor o2= new ObservattorImplementation();
		Observattor o3= new ObservattorImplementation();
		
		s.addObservattor(o1);
		s.addObservattor(o2);
		s.addObservattor(o3);
		
		s.metPrincip();

	}
}
