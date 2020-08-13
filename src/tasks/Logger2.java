package tasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.SocketHandler;
import java.util.logging.XMLFormatter;


//  LOGS IN CONSOLE AND FILE
public class Logger2 {

    static Logger logger = Logger.getLogger(Logger2.class.getName());
    
    public static void main(String[] args) {

    	LogManager lgMan = LogManager.getLogManager();   	 
    	String loggerName = Logger.GLOBAL_LOGGER_NAME;
    	Logger logr = lgMan.getLogger(loggerName);
    	//------------------------------------------------------------------------
    	
    	try {
			FileHandler fh = new FileHandler("C:\\Users\\Ioana\\Desktop\\test.log",100, 10);
			fh.setFormatter(new SimpleFormatter());
	    	logr.addHandler(fh);
	    	
	    	String host=InetAddress.getLocalHost().getHostName();
	    	int port= 2030;
	    	
	    	System.out.println("PORT: "+port);
	    	System.out.println("HOST: "+host);
	    	
	    	
	    	/*---------------------------------------
	    	 Logger logger = Logger.getLogger("concrete.log");

	         Handler handler = new SocketHandler("localhost", 8080);
	         
	         LogRecord logRec1 = new LogRecord(Level.INFO, "Log recorded");
	         
	         handler.publish(logRec1);

	         handler.setFormatter(new XMLFormatter());

	         logger.addHandler(handler);

	         logger.info("socket handler info message");
	         */
	    	//--------------------------------------------------
	         
	         

	    	Handler shandler= new SocketHandler(host,port);
	        LogRecord logRec = new LogRecord(Level.INFO, "Log recorded");
	        shandler.publish(logRec);
	        shandler.setFormatter(new XMLFormatter());

	    	logr.addHandler(shandler);	    		    	   	
	    	logr.log(Level.INFO , "Ioana Message"); 
	    	
	    	
		} catch (SecurityException|IOException e1) {
			e1.printStackTrace();
		}
    	
    	
  
    }

}