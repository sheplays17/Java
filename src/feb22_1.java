import java.io.IOException;
import java.nio.file.*;
public class feb22_1 {
   public static void main(String[]args) {
	   Path p= Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\src\\feb16_1.java");
	   try{
		   Files.lines(p).forEach(System.out::println);
	   }catch(IOException e) {
		   e.printStackTrace();
	   }
   }
}
