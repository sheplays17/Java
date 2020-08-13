import java.io.*;

public class feb5_8 {
  public static void main(String[]args) {
	  try(FileOutputStream fot = new FileOutputStream("C");
			  ObjectOutputStream out= new ObjectOutputStream(fot)){
		  
		  C c= new C();
		  out.writeObject(c);
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
  }
}
