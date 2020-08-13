// demonstratie de clasa anonima - declarata direct dupa initializare 
// de obicei sunt folosite pt suprascrierea metodelor
public class apr2_3 {
	public static void main(String[]args) {
		
		Consumator c1= new Consumator(){
		  @Override
		  public void consuma(int x) {
			  System.out.println("hei ! asta e numarul pe care il cautai? "+x);
		  }
	};
	c1.consuma(7);
  }
}
