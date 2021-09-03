package chap01;

public class Multi99Table {

	public static void main (String[] adjkfbkasdfasfn) {
		
		//case 1. 구구단 결과값만 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%5d", i * j);
			}
			System.out.println();
		}
		System.out.println();
		
		//case 2. 구구단 식까지 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {  
				System.out.printf("%d * %d = %2d   ", i, j, i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		//case 3. 구구단 표 출력
		for (int i = 1; i <= 9; i++) {
			if(i == 1) {
				System.out.println("  |    2    3    4    5    6    7    8    9");
				System.out.println("--+----------------------------------------");
			}
			
			System.out.printf("%d |", i);
			
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%5d", i * j);
			}
			System.out.println();
		}
		System.out.println();
	}
}
