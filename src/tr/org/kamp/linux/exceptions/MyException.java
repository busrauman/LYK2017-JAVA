package tr.org.kamp.linux.exceptions;

public class MyException extends Exception {
	@Override
	public String getMessage() {
		return "Hata Myexception classında  yakalandı";
	}

}
