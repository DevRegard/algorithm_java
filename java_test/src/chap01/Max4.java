package chap01;

// Q1-1
public class Max4 {

	static int max4	(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max)	max = b;
		if (c > max)	max = c;
		if (d > max)	max = d;
		
		System.out.println("숫자 4개 중 가장 큰 값은 " + max + " 입니다.");
		return max;
	}
	
	public static void main(String[] args) {
		max4(12, 43, 253, 12);
		max4(321, 43, 253, 12);
		max4(12, 4141, 253, 12);
	}
}
