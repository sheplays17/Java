import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.logging.FileHandler;


public class Wrt_file {

    public static void main(String[] args) {

          File f = new File("log.txt");
          String url="192.168.56.1";
          File srcFile= new File("E:\\log.txt");
          File destFile = new File("\\\\192.168.56.1\\C:\\Users\\Ioana\\Desktop\\test.txt");
          try {
              Files.copy(srcFile.toPath(), destFile.toPath());
          }catch(IOException e){
        	  e.printStackTrace();
          }
          if(!f.exists())
          {
            try {
                       f.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
          }
          try {
          FileOutputStream fos = new FileOutputStream(f);
          PrintStream ps = new PrintStream(fos);
          ps.println("Logger information");
          System.out.println("Logger information");

              
          }catch(FileNotFoundException e) {
        	  e.printStackTrace();
          }
    }

}