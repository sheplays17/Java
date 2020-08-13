package tasks;
import java.io.*; 
import java.net.*; 

public class ClientClass {
	private static ServerSocket s;
	
    public void run(String msg) {
    	int port=9225;
		try {          
			
		    s = new ServerSocket(port);
		    Socket sr = s.accept();  		
		    OutputStream outstream = sr.getOutputStream(); 
		    
            byte[] dataBytes = msg.getBytes();
            
            outstream.write(dataBytes);
		    outstream.close();

		}catch(Exception e) {
            e.printStackTrace();
		}	
	
	}
}
