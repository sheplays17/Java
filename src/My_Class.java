
interface Message{
   public String greet();
}

public class My_Class {
	
	public void display_message(Message m) {
		System.out.print(m.greet()+"  is the message");
	}

    public static void main(String[]args) {
    	   
    	    My_Class mes= new My_Class();
    	    
    	    mes.display_message(new Message() {
    	    	@Override
    	    	public String greet() {
    	    		return "hello";
    	    	}
    	    });
   }
}
