
public class Student {
   public enum Gender{M,F}
   String nume;
   int varsta;
   String tara;
   Gender gen;
   
   Student(){}
   
   public Student(String nume, int varsta, String tara, Gender gen) {
	   this.nume=nume;
	   this.varsta= varsta;
	   this.tara= tara;
	   this.gen= gen;
   }
   @Override
   public String toString() {
	   return "nume student:"+this.nume+"  vasta:"+this.varsta+"  tara:"+this.tara+"  gen:"+this.gen;
   }
   
}
