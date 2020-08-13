import java.util.*;

public class Subieect {
   List<Observeer>list = new ArrayList<>();
   
   public void adaugaObserveer(Observeer o) {
	   list.add(o);
   }
   
   public void removeObserver(Observeer o) {
	   list.remove(o);
   }
   public void notifyObservers() {
	   list.forEach(Observeer::evenimentDeclansat);
   }
   
   public void mainMethod() {
	   //cod
	   notifyObservers();
   }
}
