package tr.org.kamp.linux.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HasSetImp {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		//Hash algoritması kullandığı için ekleme sırasına göre listelemeyi garanti vermez
		numbers.add(-1);
		numbers.add(125);
		numbers.add(45);
		numbers.add(4);
		numbers.add(5);
		numbers.add(-10);
		
		System.out.println(numbers);
		numbers.add(3);
		if(numbers.isEmpty()) {
			System.out.println("Set boş eleman eklemelisin");
		}
		ArrayList< Integer > fakeNumbers = new ArrayList<>();
		
		fakeNumbers.add(1);
		fakeNumbers.add(2);
		
		System.out.println(" Fake numbers in numbers? : " + numbers.containsAll(fakeNumbers));
		numbers.clear();
		
	}
}
