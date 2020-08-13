import java.io.*;
import java.nio.file.*;

public class feb11_4 {
	public static void main(String[]args) {
	  	Path p1= Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\src\\feb1.java");
	  	try {
	  	 Files.lines(p1)
	  	      .filter(x-> !x.trim().isEmpty())
	  	      .filter(x->x.length()%2==0)
	  	      .map( s-> new StringBuilder(s).reverse())
	  	      .forEach(System.out::println);
	  	}catch(IOException e) {
	  		e.printStackTrace();
	  	}
	}
}
