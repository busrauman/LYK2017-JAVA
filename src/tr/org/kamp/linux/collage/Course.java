package tr.org.kamp.linux.collage;

import java.util.ArrayList;

public class Course {
	
	private Department department;
	private String name;
	private String lecturer;
	ArrayList<Student> registeredStudent = new ArrayList<>();
	
	public Course(Department department, String name, String lecturer) {
		this.department = department;
		this.name = name;
		this.lecturer = lecturer;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public ArrayList<Student> getRegisteredStudent() {
		return registeredStudent;
	}

	public void setRegisteredStudent(ArrayList<Student> registeredStudent) {
		this.registeredStudent = registeredStudent;
	}
	
	public void registerToCourse(Student student) {
		registeredStudent.add(student);
	}

	@Override
	public String toString() {
		return "Course [department=" + department + ", name=" + name + ", lecturer=" + lecturer + ", \n\nregisteredStudent="
				+ registeredStudent + "]";
	}
	
	
}
