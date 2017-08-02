package tr.org.kamp.linux.document;

public class Picture extends Document {

	public Picture(String author, String content) {
		super(author, content);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printDocument() {
		System.out.println("Resim dokümanı yazdırılıyor..");
	}

}
