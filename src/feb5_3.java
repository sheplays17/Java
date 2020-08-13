import java.io.*;
// scrierea in fisier
public class feb5_3 {
  public static void main(String[]args) {
	  try( PrintStream out= new PrintStream("helloHoney.txt")){
		  
		  out.print("Hei betch ! ;)");
	  }catch(FileNotFoundException e) {
		  e.printStackTrace();
	  }
  }
}
