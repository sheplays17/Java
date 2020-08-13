import java.io.*;

public class mai2_1 {
	  public static void main(String[]args) {
	     Pisica p = new Pisica("Tom",1);
	     try {
	       FileOutputStream output = new FileOutputStream("pisica.txt");
	       ObjectOutputStream out = new ObjectOutputStream(output);
	       out.writeObject(p);
	       out.close();
	       output.close();
	       FileInputStream fis = new FileInputStream("pisica.txt");
	       ObjectInputStream obj = new ObjectInputStream(fis);
	       Pisica p2= (Pisica)obj.readObject();
	       System.out.print(p2);
	     }catch(ClassNotFoundException|IOException e){
	    	 e.printStackTrace();
	     }
	  
	  }
}
