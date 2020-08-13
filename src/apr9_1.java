
public class apr9_1 {
	public static void main(String [] args) {
	    Consumator c= new Consumer();
	    c.consuma(12);
	}
  
	private static class Consumer implements Consumator{
		@Override
		public void consuma(int x) {
			System.out.print("modul Consumer de a afisa variabila "+x);
		}
	}
}
