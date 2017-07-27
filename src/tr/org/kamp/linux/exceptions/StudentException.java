package tr.org.kamp.linux.exceptions;

public class StudentException extends Exception {
	
	String getMessageForId() {
		return "TC kimlik numarası 11 karakterli olmalıdır.";
	}
	
}
