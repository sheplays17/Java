import java.nio.file.*;
import java.io.*;

public class feb8_5 {
	 public static void main(String[]args) {
		 Path path= Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\helloHoney.txt");
		 try(BufferedReader in= Files.newBufferedReader(path)){
			 String line;
			 while ((line= in.readLine()) != null){
				 System.out.println(line);
			 }
			 
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	 }
}
