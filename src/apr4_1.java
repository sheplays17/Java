
public class apr4_1 {
     static class Animal{}
     static class Mammal extends Animal{}
     static class Dog extends Mammal{}
     static class Pitbull extends Dog{}
     static class Bird extends Animal{}
     
     public static void main(String[]args) {
         Dog d= new Dog();
         Bird b= new Bird();
    	 System.out.print(d instanceof Animal);
    	 System.out.print(b instanceof Animal);

     }
}
