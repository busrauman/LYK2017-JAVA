package tr.org.kamp.linux;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImp {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
		colors.add("Turuncu");
		colors.add("Sarı");
		colors.add("Siyah");
		colors.add("mavi");
		colors.add("pembe");
		colors.add(1, "Kırmızı");
		colors.set(2, "Yeşil");
		
		System.out.println("silmeden önceki liste " + colors);
		colors.remove(3);
		
		System.out.println(colors);
		
		colors.remove(2);
		System.out.println(colors);
		System.out.println(colors.contains("Sarı"));
		System.out.println("ilk eleman : " + colors.getFirst());
		System.out.println("Son eleman : " + colors.getLast());
		System.out.println("3. eleman : " + colors.get(2));
		System.out.println("Listenin uzunluğu : " + colors.size());
	
		System.out.println("Foreach kullanımı");
		for (String item : colors) {
			System.out.println(item);
		}
		System.out.println("ters iterator kullanımı");
		Iterator<String> itr = colors.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList< String > removedColors = new ArrayList<>();
		removedColors.add("Siyah");
		removedColors.add("Turuncu");
		colors.removeAll(removedColors);
		System.out.println("liste silme isleminden sonra  : " + colors);
		colors.clear();
		
		
	}
	
	
}
