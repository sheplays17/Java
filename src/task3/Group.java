package task3;

import java.util.ArrayList;
import java.util.List;
 
public class Group {
 
    List<Student> students;
 
    Group () {
        students = new ArrayList<Student>();
    }
 
    public List<Student> getStudents() {
        return students;
    }
 
    public void setStudents(List<Student> students) {
        this.students = students;
    }
 
    public void addStudent(Student student) {
        students.add(student);
    }
 
    public Student getStudent(String name) {
        for (Student st : students) {
            if (null != st.getName() && st.getName().equals(name)) {
                return st;
            }
        }
        return null;
    }
 
    public boolean areStudentsInGroup() {
        if (0 == students.size()) {
            return false;
        }
        return true;
    }
 
}