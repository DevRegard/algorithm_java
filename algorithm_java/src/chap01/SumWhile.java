package chap01;

public class SumWhile {

	//While문을 사용한 1부터 n까지의 합
	public static String sumWhile (int n) {
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("while문이 종료되었습니다. i의 최종값은 " + i + "입니다.");
		
		return "1부터 " + n + "까지의 합은 " + sum + "입니다. \n";
	}
	
	public static void main(String[] args) {
		System.out.println(sumWhile(5));
		System.out.println(sumWhile(18));
		System.out.println(sumWhile(86));
	}
}
