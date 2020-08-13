package tasks;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class LoggerClass {


	static Logger logger = Logger.getLogger(LoggerOne.class.getName());

	
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
		    	
		    	
			} catch (Exception e) {
				e.printStackTrace();
			}
      
    }
}