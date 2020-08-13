package Ioana;

public class Apple {
	int a,b,c,d,e,f;
 
    public static class Builder{
    	 private Apple p;
    	
    	public Builder setA(int a) {
    		p.a=a;
    		return this;
    	}
    	public Builder setB(int b) {
    		p.b=b;
    		return this;
    	}
    	public Builder setC(int c) {
    		p.c=c;
    		return this;
    	}
    	
    	public  Apple build() {
    		return p;
    	}
    }
}
