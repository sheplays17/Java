import java.nio.file.*;
import java.io.*;
import java.util.*;


public class feb12_2 {
	public static void main(String[]args) {
	      Path p = Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\helloHoney.txt");
	      
	      
	      try(PrintStream out= new PrintStream("helloHoney.txt")){
	    	  out.print("Hei honey bunny");
	    	  
	      }catch(FileNotFoundException e) {
	    	  e.printStackTrace();
	      }
	      try (BufferedReader b= Files.newBufferedReader(p)){
	    	  String line;
	    	  while ((line=b.readLine()) != null) {
	    		  System.out.println(line);
	    	  }
	      }catch(IOException e) {
              e.printStackTrace();
	      }
	      try {
	    	  List<String>lista= Files.readAllLines(p);
	    	  lista.forEach(System.out::println);
	      }catch(IOException e) {
              e.printStackTrace();
	      }
	}
}
