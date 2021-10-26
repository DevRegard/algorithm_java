package chap01;

// Q1-3
public class Min4 {

	static int min4 (int a, int b, int c, int d) {
		int min = a;
		
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		
		
		System.out.println("숫자 4개 중에서 최솟값은 " + min + " 입니다.");
		
		return min;
		
	}
	
	public static void main(String[] args) {
		min4(123, 53, 112, 45);
		min4(123, 3, 112, 45);
		min4(13, 53, 112, 45);
	}
}
