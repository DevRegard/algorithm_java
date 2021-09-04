package chap02;

import java.util.Scanner;
import java.util.Random;

public class MaxOfArrayRand {

	//���� Ű ū ���
	public static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	//��� ���� �Է��� ��ŭ ������ ���Ͽ� ���� Ű�� �ʱ�ȭ
	public static int[] printRand() {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ű�� ���� ū ����� ���մϴ�.");
		System.out.print("����� ���� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + rand.nextInt(90); // 1~89
			System.out.println("height [" + i + "] = " + height[i]);
		}
		
		return height;
	}
	
	//Q1. ����� ���� ������ ����ϴ� ���
	
	public static void main(String[] args) {
		System.out.println("���� ū ����� Ű�� " + maxOf(printRand()) + "cm �Դϴ�.");
	}
}
