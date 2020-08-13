
public class mar30_7 {
   public static void main(String[]args) {
	   
	   Subject s= new Subject();
	   
	   Listener l1= new ListenerImplementation();
	   Listener l2= new ListenerImplementation();
	   
	   s.adaugaListener(l1);
	   s.adaugaListener(l2);
	   
	   s.metodaPrincipala();
   }
}
