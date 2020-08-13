
public class apr11_2 {
	
	public static <M> void printVector(M[] vector) {
		for(M m:vector) {
			System.out.println(m);
		}
	}
	
	public static void main(String[]args) {
		Integer[] v1= {1,2,3,4,56,7,8,9,10};
		printVector(v1);
		
		String[] v2= {"ana"};
		printVector(v2);
	}

}
