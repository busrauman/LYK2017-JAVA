package tr.org.kamp.linux.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<String> myList1 = new ArrayList<>();
		myList1.add("Lambda expression Java");
		myList1.add("Java 8");
		myList1.add("Linux");
		
		for (String item : myList1) {
			if(item.length()>10)
			System.out.println(item);
		}
	
		myList1.forEach(item -> System.out.println(item));
		
		System.out.println("yeni gösterim ");
		myList1.stream()
		.filter(item -> item.contains("Java"))
		.forEach(item->System.out.println(item));
	 	Stream.of("a1", "a2", "a3")
		.map(s -> s.substring(1))
	    .mapToInt(Integer::parseInt)
	    .max()
	    .ifPresent(System.out::println); 
		
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
	
	
	
		int myArray[] = { 1, 5, 8, 8};
		long size = Arrays.stream(myArray).count();
		long sums = Arrays.stream(myArray).sum();

		System.out.println(size + " " + sums  );
		String[] myArray2 = { "Java", "programlama", "Linux", "yaz" , "Kampı" };
		String result = Arrays.stream(myArray2)
		                .reduce("", (a,b) -> a + " " + b);
		System.out.println(result);
		
		IntStream.range(1, 4).forEach(System.out::println);
			Arrays.stream(new int[] {1, 2, 3})
		    .map(n -> 2 * n + 1)
		    .average()
		    .ifPresent(System.out::println);  
		
			//old way
			List<Integer> list = Arrays.asList(1,2,8,4,5,6,7);
			for(Integer n : list) {
				int x = n * n;
				System.out.println(x);
			}

			//New way:
			List<Integer> listt = Arrays.asList(1,2,3);
			listt.stream().map((x) -> x*x).forEach(System.out::println);

			int sum = 0;
			for(Integer n : list) {
				int x = n * n;
				sum = sum + x;
			}
			System.out.println(sum);

			int sum2 = listt.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
			System.out.println(sum2);
		
	}
	
	
}
