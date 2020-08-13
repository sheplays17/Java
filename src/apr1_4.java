import java.util.*;

public class apr1_4 {
   public static void main(String[]args) {
	   List<Student> students = new ArrayList<>();
	   
	   Student s1 = new Student("Ioana",25,"Romania",Student.Gender.F);
	   Student s2 = new Student("Eileen",31,"Singapore",Student.Gender.F);
	   Student s3 = new Student("Leo",22,"Rusia",Student.Gender.M);
	   Student s4 = new Student("Nadine",26,"Germany",Student.Gender.F);

	   students.add(s4);
	   students.add(s1);
	   students.add(s2);
	   students.add(s3);
	   students.remove(s4);
	   
	   students.forEach(System.out::println);

	   



   }
}
