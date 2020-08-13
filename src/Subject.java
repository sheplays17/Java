import java.util.*;

public class Subject {
   List<Listener> list= new ArrayList<>();
   
   public void adaugaListener(Listener l) {
	   list.add(l);
   }
   public void removeListener(Listener l) {
	   list.remove(l);
   }
   
   public void metodaPrincipala() {
	   // bla bla ce face ea
	   notifyListeners();
   }
   
   public void notifyListeners() {
        list.forEach(Listener::subiectModificat);
   }
}
