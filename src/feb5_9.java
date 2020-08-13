import java.io.*;

public class feb5_9 {
   public static void main(String[]args) {
	    try(FileInputStream fis= new FileInputStream("C:\\Users\\Ioana\\eclipse-workspace\\2020\\C");
	    	ObjectInputStream in= new ObjectInputStream(fis)){
	    	C c= (C)in.readObject();
	    }catch(ClassNotFoundException|IOException e) {
	    	e.printStackTrace();
	    }
   }
}
