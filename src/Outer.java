
public class Outer {
		
	private class InnerClass{
		int number=99;
    	 public void print() {
    		 System.out.println("metoda din clasa inner");
    	 }
     }
     void display_Inner_met() {
    	 InnerClass i= new InnerClass();
    	 i.print();
     }
     void display_Inner_nr() {
    	 InnerClass i= new InnerClass();
    	 System.out.println(i.number);
     }
	// am o class inner care e privata !
    // creez in clasa outer metode de acces catre membrii & metodele clasei inner
}
