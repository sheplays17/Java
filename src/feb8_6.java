import java.nio.file.*;
import java.io.*;
import java.util.*;

public class feb8_6 {
	public static void main(String[]args) {
	  Path p1= Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\helloHoney.txt");
	  try{
		  List<String> lista= Files.readAllLines(p1);
		  lista.forEach(System.out::println);
	  }catch(IOException e) {
           e.printStackTrace();
	  }
	}
}
