package ExPro;

public class SpiraFor {

	static void spira(int n) {
		for (int i = 0; i < n; i++) { //행
			for (int j = 1; j < n-i; j++) { //n과 n-i의 차이점은 무엇일까?
				System.out.print("1");
			}
				
			for (int k = 0; k < i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		spira(5);
	}
}

/*
5-1 | 1
5-2 | 3
5-3 | 5
5-4 | 7
5-5 | 9

*/