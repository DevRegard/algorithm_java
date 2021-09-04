package chap01;

public class SumFor {

	//정수의 합
	public static String sumFor (int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		return "1부터 " + n + "까지의 합은 " + sum + "입니다. \n";
	}
	
	
	//식 포함 출력
	public static String sumFor2 (int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
			System.out.print(i+1 + "+");
		}
		
		System.out.print("=" + sum);
		System.out.println();
		
		return "1부터 " + n + "까지의 합은 " + sum + "입니다. \n";
	}
	
	
	//가우스의 덧셈
	public static String sumFor3 (int n) { return ""; }
	
	
	//정수 a,b를 포함하여 그 사이의 모든 정수의 합
	public static String sumFor4 (int n) { return ""; }
	
	
	public static void main(String[] args) {
		System.out.println(sumFor(10));
		System.out.println(sumFor(54745));
		System.out.println(sumFor(7685));
		
		System.out.println(sumFor2(7));
	}
}
