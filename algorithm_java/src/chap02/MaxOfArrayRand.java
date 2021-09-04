package chap02;

import java.util.Scanner;
import java.util.Random;

public class MaxOfArrayRand {

	//가장 키 큰 사람
	public static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	//사람 수를 입력한 만큼 난수를 통하여 각각 키를 초기화
	public static int[] printRand() {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키가 가장 큰 사람을 구합니다.");
		System.out.print("사람의 수를 입력하세요 : ");
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + rand.nextInt(90); // 1~89
			System.out.println("height [" + i + "] = " + height[i]);
		}
		
		return height;
	}
	
	//Q1. 사람의 수도 난수로 출력하는 기능
	
	public static void main(String[] args) {
		System.out.println("가장 큰 사람의 키는 " + maxOf(printRand()) + "cm 입니다.");
	}
}
