import java.nio.file.Path;
import java.nio.file.Paths;

public class feb8_3 {
	public static void main(String[]args) {
		Path p1= Paths.get("C:/A/B/C/D/E");
		Path p2= p1.subpath(1,3);
		
		Path p3 = Paths.get("C:/A/E/F");
		Path p4= Paths.get("C:/A/B/X/M");
		Path p5= Paths.get("C:A/./././../B/./C/./../D/F/M/N/Q/./F/./../../../..");			
		
		System.out.println(p2);
		System.out.println(p3.relativize(p4));
		System.out.println(p5.normalize());
		
	}

}
