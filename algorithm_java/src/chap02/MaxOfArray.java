package chap02;

import java.util.Scanner;

public class MaxOfArray {
	
	private static Scanner scan;
	
	//�迭�� �ִ� �޼���
	public static int maxOf(int[] a) {
	
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;	
	}
	
	//����� �Է� �޼���
	public static int[] height() {
		scan = new Scanner(System.in);
		System.out.println("���� Ű�� ū ���");
		System.out.print("��� �� :  "); 
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("height[" + i + "] : ");
			height[i] = scan.nextInt();
		}
		
		return height;
	}
	
	public static void main(String[] args) {
		System.out.println("���� ū Ű�� " + maxOf(height()) + "�Դϴ�.");
	}
}
