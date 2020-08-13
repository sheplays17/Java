
public class mar29_2 {
   public static void main(String[]args) {
	   MyFactory f1= MyFactory.createFactoryObject(MyFactory.Types.X);
	   f1.m1();
	   f1.m2();
	   
	   MyFactory f2 = MyFactory.createFactoryObject(MyFactory.Types.Y);
	   f2.m1();
	   f2.m2();
   }
}
