
public class apr14_2 {
	public static void main(String[]args) {
       Pisica p1 = Registry.getInstance(Registry.Types.white);
       Student s1= Registryy.getInstance(Registryy.Type.smart);
    
       System.out.println(p1.nume+" "+p1.varsta);
       System.out.println(s1.nume+" "+s1.varsta);
	}
}
