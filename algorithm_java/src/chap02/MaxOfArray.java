package chap02;

import java.util.Scanner;

public class MaxOfArray {
	
	private static Scanner scan;
	
	//배열의 최댓값 메서드
	public static int maxOf(int[] a) {
	
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;	
	}
	
	//사람수 입력 메서드
	public static int[] height() {
		scan = new Scanner(System.in);
		System.out.println("가장 키가 큰 사람");
		System.out.print("사람 수 :  "); 
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("height[" + i + "] : ");
			height[i] = scan.nextInt();
		}
		
		return height;
	}
	
	public static void main(String[] args) {
		System.out.println("가장 큰 키는 " + maxOf(height()) + "입니다.");
	}
}
