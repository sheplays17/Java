import java.nio.file.*;
import java.io.*;

public class feb11_6 {
   public static void main(String[]args) {
	 Path p= Paths.get("./"); 
	 try {
		 Files.find(p, 10, (x,a)-> a.size()>3000)
	          .forEach(System.out::println);
		 
	 }catch(IOException e) {
      e.printStackTrace();
      }
   }
}
