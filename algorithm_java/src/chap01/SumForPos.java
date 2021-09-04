package chap01;

import java.util.Scanner;

public class SumForPos {

	private static Scanner scan;

	//음수를 입력하면 양수를 입력할 때까지 스캔하는 프로그램
	public static String sumForPos() {
		int n = 0;
		int sum = 0;
		
		System.out.println("1부터  입력값(양수)까지의 합을 구합니다.");
		scan = new Scanner(System.in);
		
		do {
			System.out.println("n의 값 입력 : ");
			n = scan.nextInt();
			
		} while (n <= 0);
		
		//System.out.println("1부터 " + n + "까지의 합을 구합니다.");
		
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		return "1부터 " + n + "까지의 합은 " + sum + "입니다. \n";
	}
	
	//Q10. b-a 출력
	
	//Q11. 자릿수 추가
	
	public static void main(String[] args) {
		System.out.println(sumForPos());
		System.out.println(sumForPos());
	}
}
