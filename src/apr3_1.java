abstract class Disney{
	public abstract String play();
}
class OtherClass{
	public void metoda(Disney d) {
		System.out.print("metoda este "+d.play());
	}
}

public class apr3_1 {
    public static void main(String[]args) {
    	
    	OtherClass ot = new OtherClass();
    	
    	ot.metoda(new Disney() {
    		@Override
    		public String play() {
    			return "hello";
    		}
    	});
    }
}
