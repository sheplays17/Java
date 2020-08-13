
public class mar30_1 {
  public static void main(String[]args) {
	  Integer i=10;
	  
	  int j= new Integer(10);// boxing
	  j= i.intValue();//unboxing
	  
	  
	  
	  Integer a= new Integer(j);//boxing
	  Integer b= j;    // autoboxing
	  
	  int c= a.intValue();// unboxing
	  int d= b;//autounboxing
	  
	  
	  //------------
	  int p=1;
	  
	  Integer m = new Integer(1);// boxing
	  Integer n= p;//autoboxing
	  
	  int o = m.intValue();//  unboxing
	  int q = n;  // autounboxing
  }
}
