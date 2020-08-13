
import java.io.IOException;
import java.util.logging.LogRecord;
import java.util.logging.SocketHandler;

public class MySocketHandler extends SocketHandler {

    public MySocketHandler() throws IOException {
		super();
	}

	@Override
    public void publish(LogRecord record) {
        //add own logic to publish
        super.publish(record);
    }


    @Override
    public void flush() {
        super.flush();
    }

    @Override
    public void close() throws SecurityException {
        super.close();
    }

}