package testUtil;

import java.util.Scanner;

public class PrintUtil  {

	private static Scanner scan = new Scanner(System.in);
	
	// 배열 생성
	public static int[] scanArray(String testName) {
		System.out.println(testName);
		System.out.print("요솟수 : ");
		int pn = scan.nextInt();
		int[] x = new int[pn];
		
		for (int i = 0; i < pn; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		return x;
	}
	
	// 배열 생성 + 보초 생성
	public static int[] scanArraySen(String testName) {
		System.out.println(testName);
		System.out.print("요솟수 : ");
		int pn = scan.nextInt();
		int[] x = new int[pn + 1]; // 보초를 위한 요솟수 + 1
		
		for (int i = 0; i < pn; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		return x;
	}
	
	// 정수 입력
	public static int scanInt(String testName) {
		System.out.println(testName);
		System.out.print("정수 입력 : ");
		int scanInt = scan.nextInt();
		int x = scanInt;
		
		return x;
	}
	
	// 배열 출력
	public static void printArray(int[] n) {
		System.out.println(); //줄바꿈
		for (int i = 0; i < n.length; i++) {
			System.out.println("x[" + i + "] = " + n[i]);
		}
	}
	
	// 검색값 생성
	public static int searchKey() {
		System.out.print("\n검색할 값 : ");
		int ky = scan.nextInt();
		System.out.printf("입력하신 값 '%d'이(가) 검색 되었습니다.", ky);
		
		return ky;
	}
	
	public static void main(String[] args) {
		
		printArray(scanArray("배열 생성 및 출력 테스트"));
		searchKey();
	}
}
