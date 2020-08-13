import java.nio.file.*;

public class feb8_1 {
  public static void main(String[]args) {
	  Path p1=  Paths.get("C:/A/B/C");  // cale absoluta
	  Path p2= Paths.get("A/B/C");     // cale relativa
	  
	  System.out.println(p1.getFileName());
	  System.out.println(p1.getParent());
	  System.out.println(p1.getRoot());
	  
	  System.out.println();
	  
	  System.out.println(p2.getFileName());
	  System.out.println(p2.getParent());
	  System.out.println(p2.getRoot());
  }
}
/*
 * CLASA PATH
 *  metode:
 *  getfilename/getparent/getroot
 *  getnamecount/getname
 *  subpath/relativize/normalize
 */



