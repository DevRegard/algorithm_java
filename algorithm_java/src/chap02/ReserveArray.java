package chap02;

import java.util.Scanner;

public class ReserveArray {

	//인덱스 요소를 서로 교환하는 메서드
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2]; //1은 2가 되고,
		a[idx2] = t; //2는 1이 된다. (t변수는 1이기 때문)
	}

	//배열의 요소들의 위치를 역순으로 바꾸는 메서드
	public static void reserve(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
			
			//Q2. 교환하는 과정을 출력하는 기능
		}
	}
	
	//요솟수 입력 후 출력하는 메서드
	public static int[] scanArray() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열의 요솟수 : ");
		int num = scan.nextInt();
		
		int[] xxx = new int[num];
		
		for (int i = 0; i < xxx.length; i++) {
			System.out.print("xxx[" + i + "] : ");
			xxx[i] = scan.nextInt();
		}
		
		return xxx;
	}
	
	//매개변수로 전달받은 배열을 역순으로 출력하는 메서드
	public static int[] reserveArray(int[] xxx) {
		
		reserve(xxx);
		
		System.out.println("\n요소를 역순으로 정렬");
		for (int i = 0; i < xxx.length; i++) {
			System.out.println("xxx[" + i + "] : " + xxx[i]);
		}
		
		return xxx;
	}
	
	public static void main(String[] args) {
//		scanArray();
		reserveArray(scanArray());
		
		
	}
}
