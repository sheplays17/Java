
public class apr11_1 {
	
	public static <E> void displayVector(E[] vector) {
	    for(E i:vector) {
	    	System.out.print(i+" ");
	    }
	    System.out.println();
	}
	public static void main(String[]args) {
		
		Integer[] v1= {1,2,3,4};
		Double[] v2= {1.2,4.9,5.2,9.1};
		String[] v3= {"a","b","c","love"};
		System.out.println("pentru variabile integer:");
		displayVector(v1);
		
		System.out.println("pentru variabile double:");
		displayVector(v2);
		
		System.out.println("pentru variabile string:");
		displayVector(v3);
		
	}
}
