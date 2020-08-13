
public class Kitty implements java.io.Serializable{
	
	public static final long serialVersionUID=1;
	
   String nume;
   transient int varsta;
   String culoare;
   
  
  public Kitty(String nume, int varsta){
	  this.nume=nume;
	  this.varsta= varsta;
  }
  public String toString() {
	  return nume+" "+varsta;
  }
}
