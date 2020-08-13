
public class apr1_1 {
   public static void main(String[]args) {
	   Metallica m1= Metallica.getInstance();
	   m1.membrii= 5;
	   m1.an_start= 1970;
	   
	   Metallica m2= Metallica.getInstance();
	   System.out.print(m2.an_start+" "+m2.membrii);
   }
}
