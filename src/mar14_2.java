
public class mar14_2 {
    public static void main(String[]args) {
    	Consumator c= new Consumer();
    	c.consuma(10);
    	
    	Consumator c2= new Consumer2();
    	c2.consuma(10);
    	
    	Consumator c3= new Consumator() {
    		@Override
    		public void consuma(int x) {
        		System.out.println("anonim type X:"+x);
    		}
    	};
    	c3.consuma(10);
    	
    	Consumator c4= x-> System.out.print("lamda type "+x);
    	c4.consuma(10);
    	
    }
    
    private static class Consumer implements Consumator{
    	@Override
    	public void consuma(int x) {
    		System.out.println("X:"+x);
    	}
    }
    private static class Consumer2 implements Consumator{
    	@Override
    	public void consuma(int x) {
    		System.out.println("X2:"+x);
    	}
    }
}
