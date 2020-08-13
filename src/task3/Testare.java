package task3;


import org.junit.Before;

import junit.framework.Assert;

import org.junit.After;

public class Testare {
   private Group group;
   
   @Before
   public void setup() {
	   group = new Group();
   }
   
   @org.junit.Test
   public void testNoStudentsInGroup() {
	   Assert.assertEquals(false, group.areStudentsInGroup());
   }
   
   @org.junit.Test
   public void testAddStudent() {
	   Student st= new Student("Ana","14");
	   group.addStudent(st);
	   
	   Assert.assertTrue(group.getStudent("Ana").equals(st));
   }
   
   @After 
   public void tearDown() {
	   group=null;
   }
}
