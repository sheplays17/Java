import java.io.*;

public class feb5_6 {
   public static void main(String[]args) {
       try( FileOutputStream obi = new FileOutputStream("kitty.txt");
    		   ObjectOutputStream out = new ObjectOutputStream(obi)){
    	   
    	   Kitty k1= new Kitty("Pufi",1);
    	   out.writeObject(k1);
    	   
       }catch(IOException e) {
    	   e.printStackTrace();
       }
   
   }
}
