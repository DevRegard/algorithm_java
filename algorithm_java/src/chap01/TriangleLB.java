package chap01;

import java.util.Scanner;

public class TriangleLB {

	private static Scanner scan;
	
	//왼쪽 아래가 직각인 이등변 삼각형
	public static void triangleLB() {
		
		int n;
		scan = new Scanner (System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 이등변 삼각형입니까? : ");
			n = scan.nextInt();

		} while (n <= 0);
		
		for (int i = 1; i < n; i++) { //n층
			for (int j = 1; j <= i; j++) { //n층 마다 n개의 별 출력
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//오른쪽 아래 직각인 이등변 삼각형
	public static void triangleRB() {
			
			int n;
			scan = new Scanner (System.in);
			
			System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
			
			do {
				System.out.print("몇 단 이등변 삼각형입니까? : ");
				n = scan.nextInt();
	
			} while (n <= 0);
			
			for (int i = 1; i <= n; i++) { //n층
				for (int j = 1; j <= n-i; j++) { //n층에서 i만큼 뺀 갯수만큼 출력
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) { //n층만큼 반복
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	
	//왼쪽 위가 직각인 이등변 삼각형
	
	//오른쪽 위가 직각인 이등변 삼각형
	
	//피라미드
	
	//피라미드 층마다 숫자출력
	
	public static void main(String[] args) {
//		triangleLB();
		triangleRB();
	}
}
