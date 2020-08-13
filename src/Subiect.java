import java.util.*;

public class Subiect {
    List<Observator> list= new ArrayList<>();
    
    public void adaugaObservator(Observator l) {
    	list.add(l);
    }
    
    public void deleteObservator(Observator l) {
    	list.remove(l);
    }
    
    public void metodaSubiectului(){
    	//ce face ea
    	notifyObservers();
    }
    
    public void notifyObservers() {
    	list.forEach(Observator::subiectModificat);
    }
}
