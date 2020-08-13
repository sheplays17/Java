import java.io.*;

public class apr30_2 {
	  public static void main(String[]args) {
		  InputStreamReader isr=  new InputStreamReader(System.in);
	      BufferedReader bf= new BufferedReader(isr);
	      try{ 
	        String text = bf.readLine();
	        System.out.print(text);
	      }catch (IOException e){
	    	  e.printStackTrace();
	      }
	      
	  	  
	  }

}
