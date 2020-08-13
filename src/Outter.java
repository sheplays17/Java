
public class Outter {
	
	public class Inner{
		int nr;
		
		public void initNum(int nr) {
			this.nr= nr;
		}		
		public int getNum() {
			System.out.println("this is the method in the inner class");
			return nr;
		}
	}

}
