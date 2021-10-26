package chap01;

// Q1-2
public class Min3 {

	static int min3(int a, int b, int c) {
		
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		System.out.println("3개의 숫자 중에 가장 작은 숫자는 " + min + " 입니다.");
		
		return min; 
	}
	
	public static void main (String[] args) {
		min3(1,2,3);
		min3(14324,1414,3463634);
		min3(3,2,1);
	}
}
