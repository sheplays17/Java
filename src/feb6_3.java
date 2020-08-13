import java.io.*;
// scriere obiect in fisier
public class feb6_3 {
  public static void main(String[]args) {
	  try(    FileInputStream fis= new FileInputStream("C:\\Users\\Ioana\\eclipse-workspace\\2020\\tomi.txt");
			  ObjectInputStream in = new ObjectInputStream(fis)){
		  Kitty k= (Kitty) in.readObject();
		  System.out.print(k);
		  
	  }catch(ClassNotFoundException | IOException e) {
		  e.printStackTrace();
	  }
  }
}
