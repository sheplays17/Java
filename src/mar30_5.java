
public class mar30_5 {
  public static void main(String[]args) {
	  Fabrica f1= Fabrica.createFabrica(Fabrica.Tipuri.A);
	  f1.m1();
	  f1.m2();
	  
	  Fabrica f2= Fabrica.createFabrica(Fabrica.Tipuri.B);
	  f2.m1();
	  f2.m2();
	  
	  Fabrica f3= Fabrica.createFabrica(Fabrica.Tipuri.C);
	  f3.m1();
	  f3.m2();
  }
}
