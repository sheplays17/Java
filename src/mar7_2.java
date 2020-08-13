
public class mar7_2 {
	public static void main(String[]args) {
		mar7_1 m= new mar7_1();
		Thread t= new Thread(m);
		t.start();
	}
}
