import java.io.*;
// scriere obiect in fisier
public class feb7_1 {
   public static void main(String[]args) {
	   try(FileOutputStream fot= new FileOutputStream("kitties");
			   ObjectOutputStream out= new ObjectOutputStream(fot)){
		   
		   Kitty k= new Kitty("mitzi",2);
		   Pussy p= new Pussy("puss",1);
		   out.writeObject(k);
		   out.writeObject(p);
		   
	   }catch(IOException e){
		   e.printStackTrace();
	   }
	   
   }
}
