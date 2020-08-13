import java.io.*;

// scrierea intr un fisier
public class feb4_3 {
  public static void main(String[]args) {
	  
	  try(PrintStream out= new PrintStream("helloIoana.txt")){
		  out.print("Hello, bitch !");
	  }catch(FileNotFoundException e) {
		  e.printStackTrace();
	  }
  }
}
