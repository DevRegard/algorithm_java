package chap01;

import java.util.Scanner;

public class TriangleLB {

	private static Scanner scan;
	
	//���� �Ʒ��� ������ �̵ �ﰢ��
	public static void triangleLB() {
		
		int n;
		scan = new Scanner (System.in);
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		do {
			System.out.print("�� �� �̵ �ﰢ���Դϱ�? : ");
			n = scan.nextInt();

		} while (n <= 0);
		
		for (int i = 1; i < n; i++) { //n��
			for (int j = 1; j <= i; j++) { //n�� ���� n���� �� ���
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//������ �Ʒ� ������ �̵ �ﰢ��
	public static void triangleRB() {
			
			int n;
			scan = new Scanner (System.in);
			
			System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
			
			do {
				System.out.print("�� �� �̵ �ﰢ���Դϱ�? : ");
				n = scan.nextInt();
	
			} while (n <= 0);
			
			for (int i = 1; i <= n; i++) { //n��
				for (int j = 1; j <= n-i; j++) { //n������ i��ŭ �� ������ŭ ���
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) { //n����ŭ �ݺ�
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	
	//���� ���� ������ �̵ �ﰢ��
	
	//������ ���� ������ �̵ �ﰢ��
	
	//�Ƕ�̵�
	
	//�Ƕ�̵� ������ �������
	
	public static void main(String[] args) {
//		triangleLB();
		triangleRB();
	}
}
