import java.util.*;

public class Subiectt {
   List<Listenerr> list= new ArrayList<>();
   
   public void adaugaListenerr(Listenerr l) {
	   list.add(l);
   }
   
   public void removeListenerr(Listenerr l) {
	   list.remove(l);
   }
   public void notifyListeners() {
	   list.forEach(Listenerr::buttonPressed);
   }
   public void metodaPrincipala() {
	   //comenzi
	   notifyListeners();
   }
}
