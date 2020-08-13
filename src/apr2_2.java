
public class apr2_2 {
   public static void main(String[]args) {
	   
	   Outter out= new Outter();
	   Outter.Inner in= out.new Inner();
	   in.initNum(10);
	   System.out.println(in.getNum());
	   
	   // findca clasa Inner e clasa inner dar public putem crea instante 
	   // si putem apela metodele clasei inner din instanta inner
   }
}
