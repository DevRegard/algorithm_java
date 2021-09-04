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
		
		if (a.length != b.length) { //���� ���̰� ������?
			return false;
		}
		
		for (int i = 0; i < a.length; i++) { //���� ��ڰ����� ������?
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
	
	//�迭 b�� ��� ��Ҹ� �迭 a�� �����ϴ� �޼���
	static void copy(int[] a, int[] b) {}
	
	//�迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼���
	static void rcopy(int[] a, int[] b) {}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �迭 a�� ��ڰ� �߰�
		System.out.print("�迭 a�� ��ڼ� : ");
		int nA = scan.nextInt();
		
		int[] a = new int[nA];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scan.nextInt();
		}
		
		
		// �迭 b�� ��ڰ� �߰�
		System.out.print("\n�迭 b�� ��ڼ� : ");
		int nB = scan.nextInt();
		
		int[] b = new int[nB];
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = scan.nextInt();
		}
		
		System.out.println("\n�迭 a�� b�� " + 
				(equals(a,b) ? "�����ϴ�."
							: "���� �ʽ��ϴ�.")
				);
	}
}
