package tr.org.kamp.linux.collage;

public class CollageTest {
	public static void main(String[] args) {
		Student st = new Student("123000", "Hilal Diler");
		Student st1 = new Student("123001", "Ali Tosun");
		Student st2 = new Student("123002", "Eray Yıldırım");
		Student st3 = new Student("123003", "Ülkü Çor");
		
		Department department = new Department("Yazılım", "Bilgisayar");
		Course course = new Course(department, "Java Programlama", "Büşra");
		
		department.addStudent(st);
		department.addStudent(st1);
		department.addStudent(st2);
		department.addStudent(st3);
		
		course.registerToCourse(st);
		course.registerToCourse(st1);
		course.registerToCourse(st2);
		
		System.out.println(department.toString());
		
		System.out.println(course.toString());


		
		
		
	}
}
