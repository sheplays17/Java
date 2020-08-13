
public class apr4_2 {
	
  static class Animal{
	  String nume;
	  public Animal(String nume) {
		  this.nume=nume;
		 // System.out.println("constructor animal");
	  }
	  public void scrieNume() {
		  System.out.println("sunt un animalut si ma numesc "+nume);

	  }
  }
  
  static class Pisica extends Animal{
	  public int varsta;
	  
	  public Pisica(String nume,int varsta) {
		  super(nume);
		  this.varsta=varsta;
		 // System.out.println("constructor pisica");
	  }
	  public void scrieNume() {
		  System.out.println("sunt un pisic si ma numesc "+nume+" si am atatia ani:"+varsta);
	  }
	 
  }
  
  public static void main(String[]args) {
	  Pisica p= new Pisica("Tom",1);
	  p.scrieNume();
	  System.out.println(p.varsta+" ani");
	  
	  
	  Animal a= new Animal("Chichi");
	  a.scrieNume();
	  
	  Animal a1= new Pisica("Fifi",2);
	  a1.scrieNume();
	  

  }
}
