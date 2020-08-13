package task2;

import java.util.Scanner;

public class Test {
  public static void main(String []args) {
	  Course c= new Course();
	  
	  Student s1= new Student();
	  s1.setYear(2);
	  s1.setNume("ana");
	  
	  Student s2= new Student();
	  s2.setYear(1);
	  s2.setNume("alina");
	  
	  Student s3= new Student();
	  s3.setYear(3);
	  s3.setNume("george");
	  
	  Student[] s= {s1,s2,s3};
	  c.setStudents(s);
	 
	 System.out.print("dati anul de referinta ");
	 Scanner sc= new Scanner(System.in);
	 int year= sc.nextInt();
	 System.out.print(c.filterYear(year));
  }
}
