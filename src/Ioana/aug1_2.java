package Ioana;

public class aug1_2 {
	public static void main(String[]args) {
	
	  Singleton s= Singleton.getInstance();
	  System.out.print(s.code+" "+s.nume);
	  
	  Singleton s2= Singleton.getInstance();
	  System.out.print(s2.code+" "+s2.nume);
	  
	  Factory f1 = Factory.getInstance(Factory.Type.A);
	  f1.actiune();
	  
	  Factory f2= Factory.getInstance(Factory.Type.B);
	  f2.actiune();

	  
      Obiect o = new Obiect.Builder()
    		               .setX(1)
    		               .setY(2)
    		               .setZ(3)
    		               .build();
      
     // System.out.print("    "+o.x+" "+o.y+" "+o.z);
	  
	}
}
