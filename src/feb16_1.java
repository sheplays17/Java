import java.nio.file.*;
import java.io.*;
// cititre din fisier si afisare in consola
//citire din consola si afisare in fisier
public class feb16_1 {
	public static void main(String[]args){
		//citire din fisier si afisare in consola
        Path p= Paths.get("C:\\Users\\Ioana\\eclipse-workspace\\2020\\src\\feb16_1.java");
        
        try {
        	int total_litere=Files.lines(p)
        			.filter(x-> x!=" ")
        	     .map(x->x.length())
        	     .reduce(0,(a,b)->a+b);
        	
        	System.out.println(total_litere);
        	
        }catch(IOException e){
        	e.printStackTrace();
        } 
        
        //citire din consola si afisare in fisier
        System.out.println("introduceti textul:");
        try(    InputStreamReader in = new InputStreamReader(System.in);
        		BufferedReader bf= new BufferedReader(in)) {
        	String line= bf.readLine();
        
        		try(PrintStream out= new PrintStream("helloHoney.txt");){
        		      out.print(line);
        		}
        	
        }catch(IOException e){
        	e.printStackTrace();
        } 
        
    }
}
