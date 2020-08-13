package lab02task3;

public class Polygon {
	  int n;
	  Point[] puncte;
	  
	  public Polygon(int n) {
		  puncte= new Point[n];
		  for(int i=0;i<n;i++) {
			  puncte[i]= new Point();
		  }
		  System.out.print("s-a creat vectorul de "+n+" puncte\n");
	  }
	  
	  public Polygon(int doin,float[] vect){
		  this(doin/2);
		  int j=0;
		  for(int i=0;i<doin/2;i++) {
			  puncte[i].x=vect[j];			  
			  puncte[i].y=vect[j+1];
			  puncte[i].show();
			  j=j+2;
		  }
	  }
	  public void show() {
		  for(int i=0;i<n;i++) {
			  puncte[i].show();
		  }
	  }
	  
}
