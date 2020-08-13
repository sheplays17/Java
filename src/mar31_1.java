
public class mar31_1 {
   public static void main(String[]args) {
	   Subiectt s= new Subiectt();
	   
	   Listenerr l1= new ListenerrImplementation();
	   Listenerr l2= new ListenerrImplementation2();
	   
	   s.adaugaListenerr(l1);
	   s.adaugaListenerr(l2);
	   
	   s.metodaPrincipala();
	   
   }
}
