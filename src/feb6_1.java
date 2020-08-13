import java.io.*;
import java.util.*;
//citire din consola cu scriere in fisier
public class feb6_1 {
	public static void main(String[]args) {
		try(InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bf= new BufferedReader(isr)	){
			
			System.out.print("dati un numar ");
			int nr= Integer.parseInt(bf.readLine());
			Random r= new Random();
			System.out.println("dati un fisier destinatie ");
			String fisier= bf.readLine();
			try(PrintStream out= new PrintStream(fisier)){
				for (int i=0;i<nr;i++) {
					out.println(r.nextInt(50));
				}
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
