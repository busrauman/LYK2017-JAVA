package tr.org.kamp.linux.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapImp {
	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<>();
		
		students.put(1, "Merve yorulmaz");
		students.put(2, "Mustafa alp çetin");
		students.put(3, "Özgür Akdeniz");
		System.out.println(students);
		System.out.println("Hashmap boyutu : " + students.size());
		
		
		for (Map.Entry item  : students.entrySet()) {
			System.out.println(item.getValue() + " " + item.getKey());
		}
		
		for(Integer keys : students.keySet()) {
			System.out.println(keys);
		}
		
		for(String keys : students.values()) {
			System.out.println(keys);
		}
		Iterator<Entry<Integer, String>> itr = students.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getValue());
		}
		//containsKey containsValue;
		students.remove(2); //index değil obje ye göre silme yapar
		System.out.println(students);
		students.clear();
		System.out.println(students);


	}
}
