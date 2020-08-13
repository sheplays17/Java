// Consumer
public class mar30_2 {
	public static void main(String[]args) {
	 Consumatorr c1= new Consumer();
	 c1.consuma(10);
	 
	 Consumatorr c2= new Consumer2();
	 c2.consuma(10);
	 
	 Consumatorr c3= new Consumatorr(){
		 @Override
		 public void consuma(int x){
				System.out.println("a treia interpretare "+x);
		 }
	 };
	 c3.consuma(10);
	 Consumatorr c4 = x-> System.out.println("a patra interpretare "+x);
	 c4.consuma(10);

		
	}
	private static class Consumer implements Consumatorr{
		@Override
		public void consuma(int x) {
			System.out.println("prima interpretare "+x);
		}
	}
	
	private static class Consumer2 implements Consumatorr{
		@Override
		public void consuma(int x) {
			System.out.println("a doua interpretare "+x);
		}
	}
}
