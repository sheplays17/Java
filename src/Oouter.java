// inner class simplu
public class Oouter {
   public class Inner{
	   int nr;
	   public int getNr() {
		   return nr;
	   }
   }
   
   public static void main(String[]args) {
     Oouter o= new Oouter();
     Oouter.Inner in= o.new Inner();
     System.out.print(in.getNr());
   }
}
