
public class apr1_2 {
  public static void main(String[]args) {
	  Factorry f1= Factorry.getFactorry(Factorry.Type.A);
	  f1.metodaInitializare();
	  f1.metodaConectareBaza();
	  Factorry f2= Factorry.getFactorry(Factorry.Type.B);
	  f2.metodaInitializare();
	  f2.metodaConectareBaza();
	  Factorry f3= Factorry.getFactorry(Factorry.Type.C);
	  f3.metodaInitializare();
	  f3.metodaConectareBaza();
  }
}
