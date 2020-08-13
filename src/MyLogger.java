import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler ;

public class MyLogger extends Logger{

	protected MyLogger(String name, String resourceBundleName) {
		super(name, resourceBundleName);
	}
	@Override
	public void log(Level level, String msg) {
		System.out.print("this is my logger");
	}
	
	// ConsoleHandler FileHandler SocketHandler 
    ConsoleHandler ch = new ConsoleHandler();
    
}
