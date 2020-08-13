import java.util.*;

public class ClasaSubiect {
     List<AscultatorInterface> lista= new ArrayList<>();
     
     public void adaugaAscultator(AscultatorInterface a) {
    	 lista.add(a);
     }
     
     public void stergeAscultator(AscultatorInterface a) {
    	 lista.remove(a);
     }
      public void notificaAscultatorii() {
    	  lista.forEach(AscultatorInterface::subiectModificat);
      }
      
      public void metodaPrincipala() {
    	  // cod
    	  notificaAscultatorii();
      }
     
}
