import java.nio.file.*;
import java.io.*;

public class feb11_5 {
  public static void main(String[]args) {
	  Path p1= Paths.get("./");
	  try{
		  Files.walk(p1,5)
		       .filter(x-> x.toString().endsWith(".java"))
		       .filter(x->x.getFileName().toString().length() %2 ==0)
		       .forEach(System.out::println);
		  
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
  }
}
