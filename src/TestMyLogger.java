import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMyLogger {
	public static void main(String[]args) {
		// ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle");
		//MyLogger l= new MyLogger("MyLogger","MessageBundle");
		
		Logger logger = Logger.getLogger(TestMyLogger.class.getName());
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO, "my log message");
	}
}
