import java.util.*;

public class Subiecct {
   List<Observattor> observers = new ArrayList<>();
   
   public void addObservattor(Observattor o) {
	   observers.add(o);
   }
   public void removeObservattor(Observattor o) {
	   observers.remove(o);
   }
   public void notifyObservers() {
	   observers.forEach(Observattor::eventDeclansat);
   }
   public void metPrincip(){
	   //cod
	   notifyObservers();
   }
}
