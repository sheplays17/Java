import java.io.*;
// citire obiect din fisier
public class feb7_2 {
  public static void main(String []args) {
	  try(FileInputStream fis= new FileInputStream("C:\\Users\\Ioana\\eclipse-workspace\\2020\\kitties");
			  ObjectInputStream in= new ObjectInputStream (fis)){
		  
		  Kitty k= (Kitty) in.readObject();
		  System.out.println(k);
		  Pussy p= (Pussy) in.readObject();
		  System.out.println(p.nume+" "+p.varsta);

		  
	  }catch(IOException|ClassNotFoundException e) {
		  e.printStackTrace();
	  }
  }
}
