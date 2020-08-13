import java.io.*;
// scriere in fisier
public class feb6_4 {
	 public static void main(String[]args) {
		
		 try(FileOutputStream fis= new FileOutputStream("tomi.txt");
			 ObjectOutputStream out = new ObjectOutputStream(fis)){
			 
			 Kitty k= new Kitty("tom",3);
			  out.writeObject(k);
			  
		 }catch(IOException e) {
			 e.printStackTrace();
		 }

	 }
}
