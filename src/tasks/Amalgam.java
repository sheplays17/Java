package tasks;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//  CREATES LOGS IN CONSOLE AND FILE

public class Amalgam {


	static Logger logger = Logger.getLogger(LoggerOne.class.getName());
	private static ServerSocket s;
	private static FileInputStream fr;
	private static Socket sr;
	private static FileOutputStream fo;
	
    synchronized void log(String msg) {
       
	    	LogManager lgMan = LogManager.getLogManager();   	 
	    	String LoggerName = Logger.GLOBAL_LOGGER_NAME;
	    	Logger Logr = lgMan.getLogger(LoggerName);
	    	
	    	
	    	try {
				Handler fh = new FileHandler("E:\\test.log",100, 10);
				fh.setFormatter(new SimpleFormatter());
		    	Logr.addHandler(fh);
		    	Logr.log(Level.INFO , msg); 
		    	
		    	
		    	ClientClass c= new ClientClass();
		    	c.run(msg);
		    	//fileclient c= new fileclient();
		    	//c.run();
		    	
		    	
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	
	    
	    	
	      
    }
}