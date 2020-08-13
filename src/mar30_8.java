
public class mar30_8 {
  public static void main(String[]args) {
	  ClasaSubiect c= new ClasaSubiect();
	  
	  AscultatorInterface a1= new AscultatorImplementation();
	  AscultatorInterface a2= new AscultatorImplementation();
	  
	  c.adaugaAscultator(a1);
	  c.adaugaAscultator(a2);
	  
	  c.metodaPrincipala();
	  
  }
}
