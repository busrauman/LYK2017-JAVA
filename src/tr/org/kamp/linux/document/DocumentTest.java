package tr.org.kamp.linux.document;

import java.util.ArrayList;
import java.util.Random;

public class DocumentTest {
	public static void main(String[] args) {
		ArrayList<Document> printList = new ArrayList<>();
		printList.add(new Pdf("Busra", "Bu bir pdf dokumanıdır",15));
		printList.add(new Picture("Java sınıf", "Bu bir resim dokümanıdır"));
		printList.add(new LibreOfficeCalc("Yaz Kampı", "Bu bir libreofficecalc dokümanıdır"));
		
		Random rand = new Random();
		int index=rand.nextInt(3); 
		printList.get(index).printDocument();
		
		if(printList.get(index) instanceof Pdf) {
			System.out.println( " yazar : " + printList.get(index).getAuthor() + 
					" içerik : " + printList.get(index).getContent()+ "  Sayfa sayısı : "+ ((Pdf)(printList.get(index))).getPageNumber() );
			
		}else {
			System.out.println( " yazar : " + printList.get(index).getAuthor() + 
					" içerik : " + printList.get(index).getContent());
			
		}
		
		
		
	}
}
