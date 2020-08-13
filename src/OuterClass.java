
public class OuterClass {
	
    void method() {
	   int nr=11;
	   class Inner{
		   public void printNR() {
			   System.out.println("din clasa inner creata in metoda "+nr);
		   }
	   }
	   Inner in = new Inner();
	   in.printNR();
   }
    
    public static void main(String[]args) {
    	OuterClass out= new OuterClass();
    	out.method();
    }
}
