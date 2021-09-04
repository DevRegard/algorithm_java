package chap02;

import java.util.Scanner;

public class ReserveArray {

	//�ε��� ��Ҹ� ���� ��ȯ�ϴ� �޼���
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2]; //1�� 2�� �ǰ�,
		a[idx2] = t; //2�� 1�� �ȴ�. (t������ 1�̱� ����)
	}

	//�迭�� ��ҵ��� ��ġ�� �������� �ٲٴ� �޼���
	public static void reserve(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
			
			//Q2. ��ȯ�ϴ� ������ ����ϴ� ���
		}
	}
	
	//��ڼ� �Է� �� ����ϴ� �޼���
	public static int[] scanArray() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�迭�� ��ڼ� : ");
		int num = scan.nextInt();
		
		int[] xxx = new int[num];
		
		for (int i = 0; i < xxx.length; i++) {
			System.out.print("xxx[" + i + "] : ");
			xxx[i] = scan.nextInt();
		}
		
		return xxx;
	}
	
	//�Ű������� ���޹��� �迭�� �������� ����ϴ� �޼���
	public static int[] reserveArray(int[] xxx) {
		
		reserve(xxx);
		
		System.out.println("\n��Ҹ� �������� ����");
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
