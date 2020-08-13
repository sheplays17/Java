import java.nio.file.*;
import java.io.*;

public class feb8_4 {
	public static void main(String[]args) {
       Path p1= Paths.get("Folder");
       Path p2= Paths.get("Fisier");
       try {
	       Files.createFile(p2);
	       Files.createDirectory(p1);
       }catch(IOException e) {
    	   e.printStackTrace();
       }
	}
}
