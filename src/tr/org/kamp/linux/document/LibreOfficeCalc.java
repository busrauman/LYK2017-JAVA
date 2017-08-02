package tr.org.kamp.linux.document;

public class LibreOfficeCalc  extends Document{
	public LibreOfficeCalc(String author, String content) {
		super(author, content);
	}

	@Override
	void printDocument() {
		System.out.println("LibreOfficeCalc dokümanı yazdırılıyor..");
		
	}
}
