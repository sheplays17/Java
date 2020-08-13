import java.io.*;
// citeste din consola adresa unui fisier
// citeste din fisierul dat numerele si afiseaza suma lor
public class feb5_5_ex {
  public static void main(String[]args){
	  
	  try( InputStreamReader isr= new InputStreamReader(System.in);
		   BufferedReader bf= new BufferedReader(isr)){
		 
		  System.out.println("dati un fisier ");
		  String fisier= bf.readLine();
		  
		  try( FileInputStream fis= new FileInputStream(fisier);
				  InputStreamReader isr1= new InputStreamReader(fis);
				   BufferedReader bf1= new BufferedReader(isr1)){
			  
			  String line;
			  int suma=0;
			  
			  while ((line= bf1.readLine())  != null) {
				  suma+=Integer.parseInt(line);
			  }
			  System.out.println(suma);// C:\\Users\\Ioana\\eclipse-workspace\\2020\\num123.txt
			 
		  }
	  }	catch(IOException e) {
		  e.printStackTrace();
	  } 
  }   
}
