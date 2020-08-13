import java.nio.file.*;
import java.io.*;

public class feb12_3 {
	public static void main(String[]args) {
	   Path p= Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\src\\feb1.java");	
	   Path p2= Paths.get("./");	

	   try {
		   Files.lines(p)
		        .forEach(System.out::println);
	   }catch (IOException e) {
		   e.printStackTrace();
	   }
	   
	   /*
	   try {
		   Files.walk(p2,5)
			    .filter(x-> x.toString().endsWith(".java"))
				.forEach(System.out::println);
	   }catch (IOException e) {
		   e.printStackTrace();
	   }
	   System.out.println();
	   try {
		   Files.find( p2, 5, (x,a)->a.size()<3000)
		        .forEach(System.out::println);
	   }catch (IOException e) {
		   e.printStackTrace();
	   }*/
	}
}
