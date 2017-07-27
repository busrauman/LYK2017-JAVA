package tr.org.kamp.linux.arrays;

import java.util.Random;

public class ArraysSort {
	private static Random rand = new Random();
	private static int bound = 10;  
	private static int[] array = new int[bound];
	
	public static void main(String[] args) {
		generateArray(); 
		printArray();
		sortArray();
		printArray();
		int findItem = rand.nextInt(bound); 
		
		if(findItem(findItem)) {
			System.out.println( "\n" + findItem + " elemanı dizi içinde bulundu ");
		}else {
			System.out.println( "\n" + findItem + " elemanı dizi içinde bulunamadı");
		}
		
		
		if(lastIndexOf(findItem) != -1) {
			System.out.println("\n"+findItem+ " elemanı "+ lastIndexOf(findItem) + " indisinde bulundu");
		}else {
			System.out.println("\n"+findItem+ " elemanı bulunamadı");

		}
	}

	private static boolean findItem(int item) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] == item) {
				return true;
			}
		}
		
		return false;
		
	}

	private static void printArray() {
		// TODO Auto-generated method stub
		System.out.println("Dizinin elemanlar  : ");
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print( array[i] +" ");
		}
		
	}


	private static void generateArray() {
		int item;

		for(int i = 0 ; i < bound ; i++ ) {
			item = rand.nextInt(30);
			
			array[i] = item;
		}
		
	}
	
	public static void sortArray() {
		int temp;
		System.out.print("\nSıralanmış ");
		for(int i = 0 ; i < array.length ; i++ ) {
			for(int j = 1 ; j < (array.length ) ; j++ ) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static int lastIndexOf(int item) {
		
		for(int i = (array.length -1) ; i >= 0 ; i--) {
			if(array[i] == item) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	
}
