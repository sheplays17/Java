import java.io.*;
import java.util.*;
import java.nio.file.*;

public class feb21_1 {
  public static void main(String[]args) {
	  Path p= Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\src\\feb16_1.java");
	  try{
		  Files.lines(p).forEach(System.out::println);
	  }catch(IOException e) {
         e.printStackTrace();
	  }
	  
	  System.out.println("dati un text");
	  try(InputStreamReader isr= new InputStreamReader(System.in);
			  PrintStream out= new PrintStream("helloHoney.txt");
			  BufferedReader bf= new BufferedReader(isr)){
		  String line= bf.readLine();
		  out.print(line);
		  
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
	  
  }
}
