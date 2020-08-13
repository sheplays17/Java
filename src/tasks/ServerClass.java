package tasks;


import java.io.*;   
import java.net.*; 

public class ServerClass{

	private static Socket sr;
	private static FileOutputStream fr;
	
    public static void main(String[] args) {
    	int i; 
        int port=9225;
        String host="127.0.0.1";
        
		try {
        	      	        
		    sr = new Socket(host,port);		
		    InputStream is = sr.getInputStream(); 
		    fr = new FileOutputStream("E:\\result.log"); 		            

	        while(  (i = is.read())!= -1) {     
	            fr.write(i);
	        }   
	         
		}catch(Exception e) {
	        e.printStackTrace();
		}
	
	}
}
