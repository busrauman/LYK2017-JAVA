package tr.org.kamp.linux.exceptions;

public class Student {
	String name;
	String id;
	int grade;
	
	
	public void idControl(String id) throws StudentException {
		if(id.length() != 11) {  
			throw new StudentException();
		}/// hata fırlat
		else this.id = id;
	}
	
	
	public void gradeControl(int grade) {
		if(grade < 0 || grade > 100) {
			try {
				throw new StudentException();
			} catch (StudentException e) {
				// TODO Auto-generated catch block
				System.out.println("Not değeri 0-100 arası olmalıdır");
			}
		}else {
			this.grade = grade;
		}
	}

}
