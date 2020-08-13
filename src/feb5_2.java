import java.io.*;
// citirea din consola
public class feb5_2 {
  public static void main(String[]args) {
	  
	  try(    InputStreamReader isr= new InputStreamReader(System.in);
			  BufferedReader bf= new BufferedReader(isr)){
		  
		  String line= bf.readLine();
		  StringBuilder sb= new StringBuilder(line);
		  sb.append(" You look beautiful today ! ;)");
		  System.out.print(sb);
		  
	  }catch(IOException e) {
		  e.printStackTrace();		 
	  }
  }
}
