import java.util.Scanner;
import java.io.*;

// program that accepts 4 integers from the user and says if they are all equal or not
public class apr10_1 {
  public static void main(String[]args) {
	  System.out.println("dati primul numar");
	  InputStreamReader is = new InputStreamReader(System.in);
	  BufferedReader sc = new BufferedReader(is);
	  try {
		  int unu= Integer.parseInt(sc.readLine());
		  System.out.println("dati 2 numar");
		  int doi= Integer.parseInt(sc.readLine());
		  System.out.println("dati 3 numar");
		  int trei= Integer.parseInt(sc.readLine());
		  System.out.println("dati 4 numar");
		  int pat= Integer.parseInt(sc.readLine());
		  
		  if(unu == doi && unu== trei && unu== pat) {
			  System.out.println("egale");
		  }
		  else
			  System.out.println("inegale");
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
		  

  }
}
