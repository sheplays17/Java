package lab02task3;

public class Point {
  float x,y;
  
  public Point() {}
  
  public Point(float x,float y) {
	  this.x=x;
	  this.y=y;
  }
  public void changeCoords (float a,float b) {
	  this.x=a;
	  this.y=b;
  }
  public void show(){
	  System.out.println("("+this.x+","+this.y+")");
  }
}
