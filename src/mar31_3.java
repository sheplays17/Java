
public class mar31_3 {
   public static void main(String[]args) {
	   
	   God g1= God.getInstance();
	   
	   g1.nume ="Dumnezeu";
	   g1.culoare="alb";
	   
	   God g2 = God.getInstance();
	   
	   System.out.print(g2.nume+" "+g2.culoare);
   }
}
