package tr.org.kamp.linux.arrays;

public class MultipleArrayDemo {
	
	public static void main(String[] args) {
		int[][] multiArr = new int[5][3];
		
		
		for(int i = 0 ; i< 5 ; i++ ) {
			for(int j = 0 ; j < 3 ; j++) {
				multiArr[i][j] = i * j ;
			}
		}
		
		
		for(int[] row  : multiArr) {
			for(int item : row) {
				System.out.print(item +  " ");
			}
			System.out.println();
		}
		
	}
}
