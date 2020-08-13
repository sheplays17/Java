import java.io.IOException;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class feb11_1 {
   public static void main(String[]args) {
	   Path p1= Paths.get("C:/A/B/C");
	   Path p2= Paths.get("C:/M/P");
	   Path p3= Paths.get("A/./B/./../../D/S/E/R/.././../T./Y./../..");
	   
	   //Path p4= Paths.get("Folder1");
	   //Path p5= Paths.get("Fisier1");
	   Path p7= Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\helloHoney.txt");
	   	   
	   
	   System.out.println( p1.subpath(0,2));
	   System.out.println(p1.relativize(p2));
	   System.out.println(p3.normalize());
	   
	   for(int i=0;i<p2.getNameCount();i++) {
		   System.out.println(" nameee "+p2.getName(i));
	   }
	   System.out.println();
	   System.out.println(p1.getFileName());
	   System.out.println( p1.getParent());
	   System.out.println( p1.getRoot());
	   
	 /*  try{
		   Files.createDirectory(p4);
		   Files.createFile(p5);
		   
	   }catch(IOException e) {
		   e.printStackTrace();
	   }*/
	   try(PrintStream out= new PrintStream("helloHoney.txt")){
		   out.print("Hei pussycat ;)");
		   
	   }catch(FileNotFoundException e) {
		   e.printStackTrace();
	   }
	   
	   
	   
	   
	   try(BufferedReader in= Files.newBufferedReader(p7)){
		   String line;
		   while((line=in.readLine()) != null) {
			   System.out.println(line);
		   }
	   }catch(IOException e) {
		   e.printStackTrace();
	   }
	   
	   
	   
	   try {
		   List<String> lista= Files.readAllLines(p7);
		   lista.forEach(System.out::println);
	   }catch(IOException e) {
		   e.printStackTrace();
	   }
   }
}
