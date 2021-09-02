package chap01;

public class Max3m {

	//Max3의 기능을 구현하는 메서드를 생성하고 테스트
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
	}
	
	//메서드를 통하여 별도의 테스트 환경 구축
	public static void main(String[] args) {
	System.out.println("max3(34,26,95)에서의 최댓값 : " + Max3m.max3(34, 26, 95) );
		
	}
}
