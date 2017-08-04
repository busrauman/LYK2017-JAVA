package tr.org.kamp.linux.collections;

import java.util.Collections;
import java.util.Iterator;

public class ArrayListImpTest {
	public static void main(String[] args) {
		ArrayListImp<String> liste = new ArrayListImp<>();
		ArrayListImp<String> liste2 = new ArrayListImp<>();
		
		liste.addItem("JAVA PROGRAMLAMA");
		liste.addItem("LİNUX YAZ KAMPI");
		liste.addItem("ÖZGÜR YAZILIM");
		liste.addItem("GNU LİNUX");
		liste2.addItem("ALP");
		liste2.addItem("çetin");
		liste2.addItem("Intizar");
		liste.set(1, "Linux yaz kampı 2017");
		
		System.out.println(liste.get(0));
		System.out.println(liste.checkItem("Java"));
		System.out.println(liste.removeItem("JAVA PROGRAMLAMA"));
		System.out.println("Reverse : " + liste.getReverse(liste));
		liste.addAll(liste2);
		System.out.println("eklenmiş liste : " + liste);
		liste.removeItem(0);
		System.out.println("liste " + liste);
		liste.addItem(1, "MUSTAFA");
		System.out.println(liste);
		liste.copy(liste, liste2);
		System.out.println(liste);
		System.out.println(liste2);
		System.out.println("ilk eleman liste2 : " + liste2.getItem(0));

		System.out.println("Liste2'nin elemanları :");
		for (String item  : liste2) {
			System.out.println(item);
		}
		System.out.println("Liste'nin elemanları :");
	
		for(int i = 0 ; i< liste.size(); i++) {
			System.out.println(liste.getItem(i));
		}
		
		Iterator<String > itr = liste.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		liste.clear();
		System.out.println(liste);
		
		
		
		
	}
}
