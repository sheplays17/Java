import java.io.*;
import java.util.*;
// se scrie in consola un numar si o adresa de fisier
// alg scrie in fisierul dat n numere intre 0 si 999
public class feb5_4_ex {
	public static void main(String []args) {
		try(  InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader bf= new BufferedReader(isr)){
			
			Random r= new Random();
			System.out.println("Dati un numar pozitiv intreg ");
			int nr= Integer.parseInt(bf.readLine());
			System.out.println("Dati un nume de fisier ");
			String fisier= bf.readLine();
			PrintStream out= new PrintStream(fisier);
			for (int i=0;i<nr;i++) {
                out.println(r.nextInt(1000));
			}
			
		  /*try(PrintStream out= new PrintStream(fisier)){
				for (int i=0;i<nr;i++) {
	                out.println(r.nextInt(1000));
				}
			}*/  // alta varianta
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
