package Ioana;

public class Obiect {
 int x;
 int y;
 int z;
 int w;
 int v;
 int p;
 
 public static class Builder{
	 private Obiect o;
	 
	 public Builder setX(int x) {
		 o.x=x;
		 return this;// returneaza instanta curenta a builderului
	 }
	 public Builder setY(int y) {
		 o.y=y;
		 return this;
	 }
	 public Builder setZ(int n) {
		 o.z=n;
		 return this;
	 }
	 public Obiect build() {
		 return o;
	 }
 }
}
