package chap01;

import java.util.Scanner;

public class SumForPos {

	private static Scanner scan;

	//������ �Է��ϸ� ����� �Է��� ������ ��ĵ�ϴ� ���α׷�
	public static String sumForPos() {
		int n = 0;
		int sum = 0;
		
		System.out.println("1����  �Է°�(���)������ ���� ���մϴ�.");
		scan = new Scanner(System.in);
		
		do {
			System.out.println("n�� �� �Է� : ");
			n = scan.nextInt();
			
		} while (n <= 0);
		
		//System.out.println("1���� " + n + "������ ���� ���մϴ�.");
		
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		return "1���� " + n + "������ ���� " + sum + "�Դϴ�. \n";
	}
	
	//Q10. b-a ���
	
	//Q11. �ڸ��� �߰�
	
	public static void main(String[] args) {
		System.out.println(sumForPos());
		System.out.println(sumForPos());
	}
}
