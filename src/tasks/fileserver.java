package tasks;
import java.io.*; 
import java.net.*; 

public class fileserver {
	private static ServerSocket s;
	private static FileInputStream fr;
	
    public void run(String msg) {
		try {
            int port=9014;
		    s = new ServerSocket(port);
		    System.out.print("ioana 1\n");

		    Socket sr = s.accept();  

		
		   // fr = new FileInputStream("E:\\test.log");
		    
		  //  byte b[] = new byte[2002];    
		  //  fr.read(b, 0, b.length);  
		    
		   // OutputStream os = sr.getOutputStream();   
		   // os.write(msg);
		   //--------------------- 
		    OutputStream outstream = sr.getOutputStream(); 
		    PrintWriter out = new PrintWriter(outstream); 

		    out.print(msg+"\n");
		    System.out.print("ioana 4\n");
		   // s.close();

		}catch(Exception e) {
          e.printStackTrace();
		}	
	
	}
}
