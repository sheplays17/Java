import java.io.*;

public class feb4_1 {
   public static void main(String[]args) {
	   
	 try ( InputStreamReader in= new InputStreamReader(System.in);
		   BufferedReader bf= new BufferedReader(in)){  
		 
	   String text= bf.readLine();
	   StringBuilder sb= new StringBuilder(text);
	   sb.reverse();
	   System.out.print(sb);
	   
	 }catch(IOException e) {
		 e.printStackTrace();
	 }
   }
}
