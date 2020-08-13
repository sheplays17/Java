
public class mar29_3 {
  public static void main(String[]args) {
	  MyFactoryy f1 = MyFactoryy.createFactoryObject(MyFactoryy.Types.A);
	  MyFactoryy f2 = MyFactoryy.createFactoryObject(MyFactoryy.Types.B);
	  MyFactoryy f3 = MyFactoryy.createFactoryObject(MyFactoryy.Types.C);

      f1.m1();
      f1.m2();
      f2.m1();
      f2.m2();
      f3.m1();
      f3.m2();
  }
}
