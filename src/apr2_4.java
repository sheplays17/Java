

 abstract class Imaginar{
    	public abstract void imagine();
 }
     
 public class apr2_4 {    
     public static void main(String[]args) {
    	 Imaginar im = new Imaginar() {
    		 @Override
    		 public void imagine() {
    			 System.out.print("imagine all the peopleee");
    		 }
    	 };
    	 im.imagine();
    	 
     }
}
