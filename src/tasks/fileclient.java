package tasks;


import java.io.*;   
import java.net.*; 

public class fileclient{

	private static Socket sr;
	private static FileOutputStream fr;
	
   // public void run() {
    public static void main(String[] args) {

		try {
 
	        int i; 
	        char c;
	        String host="127.0.0.1";
	        int port=9014;
		   // byte []b = new byte[2002]; 
	        
	        InetAddress address = InetAddress.getByName(host);
	        
		    sr = new Socket(host,port);		
		    InputStream is = sr.getInputStream(); 
		    fr = new FileOutputStream("E:\\ioana2.log"); 
		    // is.read(b, 0, b.length);   		
		    // fr.write(b, 0, b.length);         

	         while(  (i = is.read())!= -1) {     
	            fr.write(i);
	         }   
             sr.close();
		}catch(Exception e) {
	        e.printStackTrace();
		}
	
	}
}
