
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//  CREATES LOGS IN CONSOLE AND FILE

public class LoggerOne {

    static Logger logger = Logger.getLogger(LoggerOne.class.getName());
    
    public static void main(String[] args) {

    	LogManager lgMan = LogManager.getLogManager();   	 
    	String LoggerName = Logger.GLOBAL_LOGGER_NAME;
    	Logger Logr = lgMan.getLogger(LoggerName);

    	
    	
    	try {
			FileHandler fh = new FileHandler("C:\\Users\\Ioana\\Desktop\\test.log",100, 10);
			fh.setFormatter(new SimpleFormatter());
	    	Logr.addHandler(fh);
	    	Logr.log(Level.INFO , "Ioana Message"); 
		} catch (SecurityException|IOException e1) {
			e1.printStackTrace();
		}
    	
    }

}