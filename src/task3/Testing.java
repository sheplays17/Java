package task3;

import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class Testing {
	Group group;
   @Before
   public void setup() {
	   group= new Group();
   }
   
   @org.junit.Test
   public void testAddStudent() {
	   Student s= new Student("Ana","14");
	   group.addStudent(s);
	   Assert.assertTrue(group.getStudent("Ana").equals(s));	   
   }
   
   @org.junit.Test
   public void testIfAreStudents() {
	 Assert.assertEquals(false, group.areStudentsInGroup());   
   }
   
   @After
   public void tearDown(){
	   group= null;
   }
}
