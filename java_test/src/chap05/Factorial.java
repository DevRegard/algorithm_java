package chap05;

import testUtil.PrintUtil;

public class Factorial {

	public static int factorial(int n) {
		if (n > 0) 	return n * factorial(n - 1);
		else 		return 1;
	}
	
	public static void main(String[] args) {
		int f = PrintUtil.scanInt("팩토리얼 구하기");
		
		System.out.println(f + "의 팩토리얼은 " + factorial(f) + "입니다.");
	}
}
