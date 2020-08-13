
public class mar30_3 {
  public static void main(String[]args) {
	  Factoryy f1 = Factoryy.getFactoryy(Factoryy.Types.P);
	  f1.m1();
	  f1.m2();
	  
	  Factoryy f2= Factoryy.getFactoryy(Factoryy.Types.Q);
	  f2.m1();
	  f2.m2();
  }
}
