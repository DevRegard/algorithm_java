package chap01;

import java.util.Scanner;

//������ ���α׷��� : �ϳ��� �Ա��� �ϳ��� �ⱸ�� ���� ��Ҹ��� ���������� ��ġ�Ͽ� ���α׷��� �����ϴ� ���

public class Digits {

	private static Scanner scan;
	
	//��𸣰� ��Ģ�� ���� 2�ڸ��� ���� 
	public static String digits() {
		scan = new Scanner(System.in);
		int n;
		
		System.out.println("�� �ڸ��� ������ �Է����ּ���.");
			
		do {
			System.out.print("�Է� : ");
			n = scan.nextInt();
			
		} while (n < 10 || n > 99); //10���� �̰ų� 99�̻��̸� �ٽ� �ݺ�
		
		return "�Է°��� " + n + "�Դϴ�.";
	}
	
	public static void main(String[] args) {
		System.out.println(digits());
	}
}
