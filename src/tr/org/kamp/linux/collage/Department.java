package tr.org.kamp.linux.collage;

import java.util.HashMap;

public class Department {
	
	private String deptName;
	private String facultyName;
	HashMap<String, Student> students = new HashMap<>();
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public HashMap<String, Student> getStudents() {
		return students;
	}

	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}

	public Department(String deptName, String facultyName) {
	
		this.deptName = deptName;
		this.facultyName = facultyName;
	}
	
	public void addStudent(Student student) {
		students.put(student.getId(), student);
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", facultyName=" + facultyName + ",\n\n students=" + students + "]";
	}
	
	

}
