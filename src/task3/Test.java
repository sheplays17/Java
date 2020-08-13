package task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

 
public class Test {
    private Group group;
 
    @Before
    public void setup() {
        group = new Group();
    }
 
    @org.junit.Test
    public void testNoStudentInGroup() {
        Assert.assertEquals(false, group.areStudentsInGroup());
    }
 
    @org.junit.Test
    public void testAddStudent() {
        Student st = new Student("Elena", "11");
        group.addStudent(st);
 
        Assert.assertTrue(group.getStudent("Elena").equals(st));
    }
    @After void tearDown() {
        group = null;
    }
 
}