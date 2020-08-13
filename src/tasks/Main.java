package tasks;

import java.util.logging.Logger;

public class Main {

    static Logger logger = Logger.getLogger(LoggerOne.class.getName());
    
    public static void main(String[] args) {

    	LoggerClass logger = new LoggerClass();
        logger.log("my test message");
    	
    }
}


/*
*  
*  the running of Main class is followed by running of the ServerClass in order to check 
*  that the information is also retrieved correctly from the network in the result file
*
*/