import java.io.*;

// citirea dintr un fisier
public class feb4_2 {
   public static void main(String[]args) {
	   
		try(FileInputStream fis= new FileInputStream("C:\\Users\\Ioana\\Desktop\\a.txt");
		    InputStreamReader isr= new InputStreamReader(fis);
		    BufferedReader bf= new BufferedReader(isr)){
			
			String line;
			while( (line= bf.readLine()) != null   ) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
	      e.printStackTrace();
	    }
   }
}
