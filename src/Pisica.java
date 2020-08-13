
public class Pisica implements Comparable<Pisica> , java.io.Serializable{
  int varsta;
  String nume;
  
  Pisica(){}

  Pisica(String nume, int varsta){
	  this.nume=nume;
	  this.varsta=varsta;
  }
  public String toString() {
	  return nume+" "+varsta;
  }
  @Override
  public int compareTo(Pisica p) {
	  return this.varsta-p.varsta;
  }
}
