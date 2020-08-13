import java.io.*;

public class feb5_7 {
  public static void main(String[]args) {
	  
	  try(FileInputStream fis= new FileInputStream("C:\\Users\\Ioana\\eclipse-workspace\\2020\\kitty.txt");
		  ObjectInputStream in= new ObjectInputStream(fis)){
		  
		  Kitty k1= (Kitty) in.readObject();
		  System.out.println(k1);
		  
	  }catch(IOException|ClassNotFoundException  e) {
		  e.printStackTrace();
	  }
  }
}
