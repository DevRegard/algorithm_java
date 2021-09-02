package chap01;

public class Multi99Table {

	public static void main (String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%5d", i * j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {  
				System.out.printf("%d * %d = %2d   ", i, j, i*j);
			}
			System.out.println();
		}
	}
}
