package tasks;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
   public static void main(String[]args) throws Exception{
	   
	    String ip= "127.0.0.1";
	    int port =9999; 
	   
		Socket s= new Socket(ip,port);
		
		String msg = "Log message Misha";
		OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream());
		PrintWriter out= new PrintWriter(os);
		out.write(msg);
		out.flush();

		
   }
}
