package chap01;

import java.util.Scanner;

//구조적 프로그래밍 : 하나의 입구와 하나의 출구를 가진 요소만을 계층적으로 배치하여 프로그램을 구성하는 방법

public class Digits {

	private static Scanner scan;
	
	//드모르간 법칙을 통한 2자릿수 제한 
	public static String digits() {
		scan = new Scanner(System.in);
		int n;
		
		System.out.println("두 자리의 정수를 입력해주세요.");
			
		do {
			System.out.print("입력 : ");
			n = scan.nextInt();
			
		} while (n < 10 || n > 99); //10이하 이거나 99이상이면 다시 반복
		
		return "입력값은 " + n + "입니다.";
	}
	
	public static void main(String[] args) {
		System.out.println(digits());
	}
}
