package chap02;

import java.util.Scanner;

public class ArrayEqual {

//	private final int[] numA;
//	private final int[] numB;
	
//	public ArrayEqual(int[] numA, int[] numB) {
//		this.numA = numA;
//		this.numB = numB;
//	}
	
	public static boolean equals(int[] a, int[] b) {
		
		if (a.length != b.length) { //서로 길이가 같은가?
			return false;
		}
		
		for (int i = 0; i < a.length; i++) { //서로 요솟값들이 같은가?
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
	
//	public static int[] twoArray() {
//		
//		numA = new int[10];
//		numB = new int[10];
//		
//		return new ArrayEqual(numA,numB);
//	}
	
	//배열 b의 모든 요소를 배열 a로 복사하는 메서드
	static void copy(int[] a, int[] b) {}
	
	//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드
	static void rcopy(int[] a, int[] b) {}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열 a의 요솟값 추가
		System.out.print("배열 a의 요솟수 : ");
		int nA = scan.nextInt();
		
		int[] a = new int[nA];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scan.nextInt();
		}
		
		
		// 배열 b의 요솟값 추가
		System.out.print("\n배열 b의 요솟수 : ");
		int nB = scan.nextInt();
		
		int[] b = new int[nB];
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = scan.nextInt();
		}
		
		System.out.println("\n배열 a와 b는 " + 
				(equals(a,b) ? "같습니다."
							: "같지 않습니다.")
				);
	}
}
