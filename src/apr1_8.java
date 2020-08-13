import java.util.*;

public class apr1_8 {
  public static void main(String[]args) {
	  Date data1= new Date();
	  Date data2= new Date();
	  
	    System.out.println(data1);
	    data2.setTime(10000);
	    System.out.println(data2);

	    System.out.println(data1.after(data2));
	    System.out.println(data1.equals(data2));
	    System.out.println(data1.compareTo(data2));



  }
}
