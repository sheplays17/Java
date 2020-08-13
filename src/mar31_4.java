
public class mar31_4 {
   public static void main(String[]args) {
	   
	   Tata t1= Tata.getInstance();
	   t1.nume="Ion";
	   t1.varsta=53;
	   
	   Tata t2 = Tata.getInstance();
	   
	   System.out.println(t2.nume+" "+t2.varsta);
	   
	   Cutzu c1= Cutzu.getInstance();
	   c1.nume="duluta";
	   c1.varsta= 10;
	   
	   Cutzu c2= Cutzu.getInstance();
	   System.out.println(c2.nume+" "+c2.varsta);

   }
}
