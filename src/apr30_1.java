import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class apr30_1 {
  public static void main(String[]args) {
	  Path p =Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\helloHoney.txt");
	  try{  Files.readAllLines(p)
	       .stream()
	       .forEach(System.out::println);
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
  }
}
