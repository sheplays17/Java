package task2;

import java.util.ArrayList;
import java.util.List;

public class Course {
	  private String title;
	  private String description;
	  private Student[] students;
	  
	  public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public List filterYear(int year) {
		  List lista= new ArrayList<>();
		  
		  for(int i=0;i<students.length;i++) {
			  if(students[i].getYear() == year) {
				  lista.add(students[i]);
			  }
		  }
		  return lista;
	  }
}
