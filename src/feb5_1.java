import java.io.*;
// citirea din fisier

public class feb5_1 {
	public static void main(String[]args) {
	   try(
		FileInputStream fis= new FileInputStream("C:\\Users\\Ioana\\Desktop\\a.txt");
		InputStreamReader isr= new InputStreamReader(fis);
		BufferedReader bf= new BufferedReader(isr)){
		   String line;
		   while ((line=bf.readLine())  != null) {
			   System.out.println(line);
		   }
	   }catch(IOException e) {
		   e.printStackTrace();
	   }
	
	
	}
}
